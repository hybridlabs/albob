@file:Suppress("OVERRIDE_DEPRECATION")

package dev.hybridlabs.albob.block

import net.minecraft.core.BlockPos
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.phys.shapes.CollisionContext
import net.minecraft.world.phys.shapes.Shapes
import net.minecraft.world.phys.shapes.VoxelShape

class PendantLampBlock(properties: Properties) : CeilingOnlyLanternBlock(properties) {
    override fun getShape(state: BlockState, level: BlockGetter, pos: BlockPos, context: CollisionContext): VoxelShape {
        return SHAPE
    }

    companion object {
        val SHAPE: VoxelShape = Shapes.or(
            box(6.0, 1.0, 6.0, 10.0, 2.0, 10.0),
            box(2.0, 2.0, 2.0, 14.0, 3.0, 14.0),
            box(3.0, 3.0, 3.0, 13.0, 7.0, 13.0),
            box(6.0, 7.0, 6.0, 10.0, 10.0, 10.0),
        )
    }
}
