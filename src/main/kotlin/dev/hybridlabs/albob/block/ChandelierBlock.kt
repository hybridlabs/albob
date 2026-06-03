@file:Suppress("OVERRIDE_DEPRECATION", "DEPRECATION")

package dev.hybridlabs.albob.block

import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import net.minecraft.world.item.context.BlockPlaceContext
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.LevelAccessor
import net.minecraft.world.level.LevelReader
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.SimpleWaterloggedBlock
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.StateDefinition
import net.minecraft.world.level.block.state.properties.BlockStateProperties
import net.minecraft.world.level.block.state.properties.BooleanProperty
import net.minecraft.world.level.material.FluidState
import net.minecraft.world.level.material.Fluids
import net.minecraft.world.level.pathfinder.PathComputationType

open class ChandelierBlock(properties: Properties) : Block(properties), SimpleWaterloggedBlock {
    init {
        registerDefaultState(stateDefinition.any().setValue(WATERLOGGED, false))
    }

    override fun getStateForPlacement(context: BlockPlaceContext): BlockState? {
        if (context.nearestLookingDirections.contains(Direction.UP)) {
            val state = defaultBlockState()
            if (state.canSurvive(context.level, context.clickedPos)) {
                val fluidState = context.level.getFluidState(context.clickedPos)
                return state.setValue(WATERLOGGED, fluidState.type == Fluids.WATER)
            }
        }

        return null
    }

    override fun updateShape(state: BlockState, direction: Direction, otherState: BlockState, level: LevelAccessor, pos: BlockPos, otherPos: BlockPos): BlockState? {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level))
        }

        return if (direction == Direction.UP && !state.canSurvive(level, pos)) {
            Blocks.AIR.defaultBlockState()
        } else {
            super.updateShape(state, direction, otherState, level, pos, otherPos)
        }
    }

    override fun canSurvive(state: BlockState, level: LevelReader, pos: BlockPos): Boolean {
        return canSupportCenter(level, pos.relative(Direction.UP), Direction.DOWN)
    }

    override fun isPathfindable(state: BlockState, level: BlockGetter, pos: BlockPos, type: PathComputationType): Boolean {
        return false
    }

    override fun getFluidState(state: BlockState): FluidState? {
        return if (state.getValue(WATERLOGGED)) Fluids.WATER.getSource(false) else super.getFluidState(state)
    }

    override fun createBlockStateDefinition(builder: StateDefinition.Builder<Block?, BlockState?>) {
        builder.add(WATERLOGGED)
    }

    companion object {
        val WATERLOGGED: BooleanProperty = BlockStateProperties.WATERLOGGED
    }
}
