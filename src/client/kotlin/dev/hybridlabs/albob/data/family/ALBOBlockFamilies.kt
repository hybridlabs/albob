package dev.hybridlabs.albob.data.family

import dev.hybridlabs.albob.block.ALBOBlocks
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.data.family.BlockFamily

object ALBOBlockFamilies {
    private val REGISTRY: MutableMap<Block, BlockFamily> = mutableMapOf()

    val families: Collection<BlockFamily> get() = REGISTRY.values

    init {
        register(ALBOBlocks.EXPOSED_BRICK) {
            it.wall(ALBOBlocks.EXPOSED_BRICK_WALL)
            it.stairs(ALBOBlocks.EXPOSED_BRICK_STAIRS)
            it.slab(ALBOBlocks.EXPOSED_BRICK_SLAB)
        }

        register(Blocks.WHITE_CONCRETE) {
            it.wall(ALBOBlocks.WHITE_CONCRETE_WALL)
            it.stairs(ALBOBlocks.WHITE_CONCRETE_STAIRS)
            it.slab(ALBOBlocks.WHITE_CONCRETE_SLAB)
        }

        register(Blocks.ORANGE_CONCRETE) {
            it.wall(ALBOBlocks.ORANGE_CONCRETE_WALL)
            it.stairs(ALBOBlocks.ORANGE_CONCRETE_STAIRS)
            it.slab(ALBOBlocks.ORANGE_CONCRETE_SLAB)
        }

        register(Blocks.MAGENTA_CONCRETE) {
            it.wall(ALBOBlocks.MAGENTA_CONCRETE_WALL)
            it.stairs(ALBOBlocks.MAGENTA_CONCRETE_STAIRS)
            it.slab(ALBOBlocks.MAGENTA_CONCRETE_SLAB)
        }

        register(Blocks.LIGHT_BLUE_CONCRETE) {
            it.wall(ALBOBlocks.LIGHT_BLUE_CONCRETE_WALL)
            it.stairs(ALBOBlocks.LIGHT_BLUE_CONCRETE_STAIRS)
            it.slab(ALBOBlocks.LIGHT_BLUE_CONCRETE_SLAB)
        }

        register(Blocks.YELLOW_CONCRETE) {
            it.wall(ALBOBlocks.YELLOW_CONCRETE_WALL)
            it.stairs(ALBOBlocks.YELLOW_CONCRETE_STAIRS)
            it.slab(ALBOBlocks.YELLOW_CONCRETE_SLAB)
        }

        register(Blocks.LIME_CONCRETE) {
            it.wall(ALBOBlocks.LIME_CONCRETE_WALL)
            it.stairs(ALBOBlocks.LIME_CONCRETE_STAIRS)
            it.slab(ALBOBlocks.LIME_CONCRETE_SLAB)
        }

        register(Blocks.PINK_CONCRETE) {
            it.wall(ALBOBlocks.PINK_CONCRETE_WALL)
            it.stairs(ALBOBlocks.PINK_CONCRETE_STAIRS)
            it.slab(ALBOBlocks.PINK_CONCRETE_SLAB)
        }

        register(Blocks.GRAY_CONCRETE) {
            it.wall(ALBOBlocks.GRAY_CONCRETE_WALL)
            it.stairs(ALBOBlocks.GRAY_CONCRETE_STAIRS)
            it.slab(ALBOBlocks.GRAY_CONCRETE_SLAB)
        }

        register(Blocks.LIGHT_GRAY_CONCRETE) {
            it.wall(ALBOBlocks.LIGHT_GRAY_CONCRETE_WALL)
            it.stairs(ALBOBlocks.LIGHT_GRAY_CONCRETE_STAIRS)
            it.slab(ALBOBlocks.LIGHT_GRAY_CONCRETE_SLAB)
        }

        register(Blocks.CYAN_CONCRETE) {
            it.wall(ALBOBlocks.CYAN_CONCRETE_WALL)
            it.stairs(ALBOBlocks.CYAN_CONCRETE_STAIRS)
            it.slab(ALBOBlocks.CYAN_CONCRETE_SLAB)
        }

        register(Blocks.PURPLE_CONCRETE) {
            it.wall(ALBOBlocks.PURPLE_CONCRETE_WALL)
            it.stairs(ALBOBlocks.PURPLE_CONCRETE_STAIRS)
            it.slab(ALBOBlocks.PURPLE_CONCRETE_SLAB)
        }

        register(Blocks.BLUE_CONCRETE) {
            it.wall(ALBOBlocks.BLUE_CONCRETE_WALL)
            it.stairs(ALBOBlocks.BLUE_CONCRETE_STAIRS)
            it.slab(ALBOBlocks.BLUE_CONCRETE_SLAB)
        }

        register(Blocks.BROWN_CONCRETE) {
            it.wall(ALBOBlocks.BROWN_CONCRETE_WALL)
            it.stairs(ALBOBlocks.BROWN_CONCRETE_STAIRS)
            it.slab(ALBOBlocks.BROWN_CONCRETE_SLAB)
        }

        register(Blocks.GREEN_CONCRETE) {
            it.wall(ALBOBlocks.GREEN_CONCRETE_WALL)
            it.stairs(ALBOBlocks.GREEN_CONCRETE_STAIRS)
            it.slab(ALBOBlocks.GREEN_CONCRETE_SLAB)
        }

        register(Blocks.RED_CONCRETE) {
            it.wall(ALBOBlocks.RED_CONCRETE_WALL)
            it.stairs(ALBOBlocks.RED_CONCRETE_STAIRS)
            it.slab(ALBOBlocks.RED_CONCRETE_SLAB)
        }

        register(Blocks.BLACK_CONCRETE) {
            it.wall(ALBOBlocks.BLACK_CONCRETE_WALL)
            it.stairs(ALBOBlocks.BLACK_CONCRETE_STAIRS)
            it.slab(ALBOBlocks.BLACK_CONCRETE_SLAB)
        }

    }

    private fun register(block: Block, factory: (BlockFamily.Builder) -> Unit): BlockFamily {
        val builder = BlockFamily.Builder(block).apply(factory)
        val family = builder.build()
        REGISTRY[block] = family
        return family
    }
}
