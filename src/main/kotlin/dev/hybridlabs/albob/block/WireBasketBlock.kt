@file:Suppress("OVERRIDE_DEPRECATION", "DEPRECATION")

package dev.hybridlabs.albob.block

import dev.hybridlabs.albob.block.entity.WireBasketBlockEntity
import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import net.minecraft.server.level.ServerLevel
import net.minecraft.util.RandomSource
import net.minecraft.world.Container
import net.minecraft.world.Containers
import net.minecraft.world.InteractionHand
import net.minecraft.world.InteractionResult
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.entity.monster.piglin.PiglinAi
import net.minecraft.world.entity.player.Player
import net.minecraft.world.inventory.AbstractContainerMenu
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.context.BlockPlaceContext
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.BaseEntityBlock
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.RenderShape
import net.minecraft.world.level.block.RotatedPillarBlock
import net.minecraft.world.level.block.Rotation
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.StateDefinition
import net.minecraft.world.level.block.state.properties.BlockStateProperties
import net.minecraft.world.level.block.state.properties.EnumProperty
import net.minecraft.world.phys.BlockHitResult
import net.minecraft.world.phys.shapes.CollisionContext
import net.minecraft.world.phys.shapes.VoxelShape

class WireBasketBlock(properties: Properties) : BaseEntityBlock(properties) {
    init {
        registerDefaultState(
            stateDefinition.any()
                .setValue(HORIZONTAL_AXIS, Direction.Axis.X)
        )
    }

    override fun getStateForPlacement(context: BlockPlaceContext): BlockState {
        return defaultBlockState().setValue(HORIZONTAL_AXIS, context.horizontalDirection.axis)
    }

    override fun rotate(state: BlockState, rotation: Rotation): BlockState {
        return rotatePillar(state, rotation)
    }

    override fun getShape(state: BlockState, level: BlockGetter, pos: BlockPos, context: CollisionContext): VoxelShape {
        return when (val axis = state.getValue(HORIZONTAL_AXIS)) {
            Direction.Axis.X -> X_SHAPE
            Direction.Axis.Z -> Z_SHAPE
            else -> error("Invalid state: $axis")
        }
    }

    override fun createBlockStateDefinition(builder: StateDefinition.Builder<Block, BlockState>) {
        builder.add(HORIZONTAL_AXIS)
    }

    override fun newBlockEntity(pos: BlockPos, state: BlockState): BlockEntity {
        return WireBasketBlockEntity(pos, state)
    }

    override fun use(state: BlockState, level: Level, pos: BlockPos, player: Player, hand: InteractionHand, hit: BlockHitResult): InteractionResult {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS
        } else {
            val blockEntity = level.getBlockEntity(pos)
            if (blockEntity is WireBasketBlockEntity) {
                player.openMenu(blockEntity)
                // player.awardStat(Stats.OPEN_BARREL) // TODO
                PiglinAi.angerNearbyPiglins(player, true)
            }

            return InteractionResult.CONSUME
        }
    }

    override fun onRemove(state: BlockState, level: Level, pos: BlockPos, otherState: BlockState, bl: Boolean) {
        if (!state.`is`(otherState.block)) {
            val blockEntity = level.getBlockEntity(pos)
            if (blockEntity is Container) {
                Containers.dropContents(level, pos, blockEntity as Container)
                level.updateNeighbourForOutputSignal(pos, this)
            }

            super.onRemove(state, level, pos, otherState, bl)
        }
    }

    override fun tick(state: BlockState, level: ServerLevel, pos: BlockPos, source: RandomSource) {
        val blockEntity = level.getBlockEntity(pos)
        if (blockEntity is WireBasketBlockEntity) {
            blockEntity.recheckOpen()
        }
    }

    override fun getRenderShape(state: BlockState): RenderShape {
        return RenderShape.MODEL
    }

    override fun setPlacedBy(level: Level, pos: BlockPos, state: BlockState, entity: LivingEntity?, stack: ItemStack) {
        if (stack.hasCustomHoverName()) {
            val blockEntity = level.getBlockEntity(pos)
            if (blockEntity is WireBasketBlockEntity) {
                blockEntity.customName = stack.getHoverName()
            }
        }
    }

    override fun hasAnalogOutputSignal(state: BlockState): Boolean {
        return true
    }

    override fun getAnalogOutputSignal(state: BlockState, level: Level, pos: BlockPos): Int {
        return AbstractContainerMenu.getRedstoneSignalFromBlockEntity(level.getBlockEntity(pos))
    }

    companion object {
        val Z_SHAPE: VoxelShape = box(3.0, 0.0, 0.0, 13.0, 10.0, 16.0)
        val X_SHAPE: VoxelShape = box(0.0, 0.0, 3.0, 16.0, 10.0, 13.0)

        val HORIZONTAL_AXIS: EnumProperty<Direction.Axis> = BlockStateProperties.HORIZONTAL_AXIS

        fun rotatePillar(state: BlockState, rotation: Rotation): BlockState {
            return when (rotation) {
                Rotation.COUNTERCLOCKWISE_90, Rotation.CLOCKWISE_90 -> when (state.getValue(RotatedPillarBlock.AXIS) as Direction.Axis) {
                    Direction.Axis.X -> state.setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z)
                    Direction.Axis.Z -> state.setValue(RotatedPillarBlock.AXIS, Direction.Axis.X)
                    else -> state
                }

                else -> state
            }
        }
    }
}
