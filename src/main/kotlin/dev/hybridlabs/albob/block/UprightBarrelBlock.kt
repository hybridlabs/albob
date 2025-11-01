@file:Suppress("OVERRIDE_DEPRECATION", "DEPRECATION")

package dev.hybridlabs.albob.block

import dev.hybridlabs.albob.block.entity.UprightBarrelBlockEntity
import net.minecraft.core.BlockPos
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
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.BaseEntityBlock
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.RenderShape
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.StateDefinition
import net.minecraft.world.level.block.state.properties.BlockStateProperties
import net.minecraft.world.level.block.state.properties.BooleanProperty
import net.minecraft.world.phys.BlockHitResult

class UprightBarrelBlock(settings: Properties) : BaseEntityBlock(settings) {
    init {
        registerDefaultState(
            stateDefinition.any()
                .setValue(OPEN, false)
        )
    }

    override fun tick(state: BlockState, level: ServerLevel, pos: BlockPos, random: RandomSource) {
        val blockEntity = level.getBlockEntity(pos)
        if (blockEntity is UprightBarrelBlockEntity) {
            blockEntity.recheckOpen()
        }
    }

    override fun use(state: BlockState, level: Level, pos: BlockPos, player: Player, hand: InteractionHand, hit: BlockHitResult): InteractionResult {
        return if (level.isClientSide) {
            InteractionResult.SUCCESS
        } else {
            val blockEntity = level.getBlockEntity(pos)
            if (blockEntity is UprightBarrelBlockEntity) {
                player.openMenu(blockEntity)
                // player.awardStat(Stats.OPEN_BARREL) // TODO
                PiglinAi.angerNearbyPiglins(player, true)
            }

            InteractionResult.CONSUME
        }
    }

    override fun setPlacedBy(level: Level, pos: BlockPos, state: BlockState, entity: LivingEntity?, stack: ItemStack) {
        if (stack.hasCustomHoverName()) {
            val blockEntity = level.getBlockEntity(pos)
            if (blockEntity is UprightBarrelBlockEntity) {
                blockEntity.customName = stack.hoverName
            }
        }
    }

    override fun onRemove(state: BlockState, level: Level, pos: BlockPos, newState: BlockState, byPiston: Boolean) {
        if (!state.`is`(newState.block)) {
            val blockEntity = level.getBlockEntity(pos)
            if (blockEntity is Container) {
                Containers.dropContents(level, pos, blockEntity)
                level.updateNeighbourForOutputSignal(pos, this)
            }

            super.onRemove(state, level, pos, newState, byPiston)
        }
    }

    override fun hasAnalogOutputSignal(blockState: BlockState): Boolean {
        return true
    }

    override fun getAnalogOutputSignal(state: BlockState, level: Level, pos: BlockPos): Int {
        return AbstractContainerMenu.getRedstoneSignalFromBlockEntity(level.getBlockEntity(pos))
    }

    override fun createBlockStateDefinition(builder: StateDefinition.Builder<Block, BlockState>) {
        builder.add(OPEN)
    }

    override fun getRenderShape(blockState: BlockState): RenderShape {
        return RenderShape.MODEL
    }

    override fun newBlockEntity(pos: BlockPos, state: BlockState): BlockEntity {
        return UprightBarrelBlockEntity(pos, state)
    }

    companion object {
        val OPEN: BooleanProperty = BlockStateProperties.OPEN
    }
}
