@file:Suppress("OVERRIDE_DEPRECATION", "DEPRECATION")

package dev.hybridlabs.albob.block

import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.RenderShape
import net.minecraft.world.level.block.SimpleWaterloggedBlock
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.StateDefinition
import net.minecraft.world.level.block.state.properties.BlockStateProperties
import net.minecraft.world.level.block.state.properties.BooleanProperty
import net.minecraft.world.level.material.FluidState
import net.minecraft.world.level.material.Fluids

class FoodBowlBlock(settings: Properties) : Block(settings), SimpleWaterloggedBlock {
    init {
        registerDefaultState(
            stateDefinition.any()
                .setValue(WATERLOGGED, false)
        )
    }

    override fun createBlockStateDefinition(builder: StateDefinition.Builder<Block, BlockState>) {
        builder.add(WATERLOGGED)
    }

    override fun getFluidState(state: BlockState): FluidState {
        return if (state.getValue(WATERLOGGED)) {
            Fluids.WATER.getSource(false)
        } else {
            super.getFluidState(state)
        }
    }

    override fun getRenderShape(blockState: BlockState): RenderShape {
        return RenderShape.MODEL
    }

    companion object {
        val WATERLOGGED: BooleanProperty = BlockStateProperties.WATERLOGGED
    }
}
