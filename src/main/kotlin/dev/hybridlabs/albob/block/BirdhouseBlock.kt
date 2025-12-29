@file:Suppress("OVERRIDE_DEPRECATION")

package dev.hybridlabs.albob.block

import net.minecraft.core.BlockPos
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.phys.shapes.CollisionContext
import net.minecraft.world.phys.shapes.VoxelShape

class BirdhouseBlock(properties: Properties) : BasicHorizontalDirectionBlock(properties) {
    override fun getShape(state: BlockState, level: BlockGetter, pos: BlockPos, context: CollisionContext): VoxelShape {
        return SHAPE
    }

    companion object {
        val SHAPE: VoxelShape = box(3.0, 0.0, 3.0, 13.0, 10.0, 13.0)
    }
}
