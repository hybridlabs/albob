@file:Suppress("OVERRIDE_DEPRECATION")

package dev.hybridlabs.albob.block

import net.minecraft.core.BlockPos
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.phys.shapes.CollisionContext
import net.minecraft.world.phys.shapes.VoxelShape

class CheckerboardBlock(properties: Properties) : BasicHorizontalDirectionBlock(properties) {
    override fun getShape(state: BlockState, level: BlockGetter, pos: BlockPos, context: CollisionContext): VoxelShape {
        return SHAPE
    }

    companion object {
        val SHAPE: VoxelShape = box(2.0, 0.0, 2.0, 14.0, 1.5, 14.0)
    }
}
