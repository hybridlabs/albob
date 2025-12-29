@file:Suppress("OVERRIDE_DEPRECATION")

package dev.hybridlabs.albob.block

import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import net.minecraft.world.item.context.BlockPlaceContext
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.RotatedPillarBlock
import net.minecraft.world.level.block.Rotation
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.StateDefinition
import net.minecraft.world.level.block.state.properties.BlockStateProperties
import net.minecraft.world.level.block.state.properties.EnumProperty
import net.minecraft.world.phys.shapes.CollisionContext
import net.minecraft.world.phys.shapes.VoxelShape

class WireBasketBlock(properties: Properties) : Block(properties) {
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
