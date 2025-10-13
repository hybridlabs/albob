package dev.hybridlabs.albob.data

import dev.hybridlabs.albob.block.ALBOBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider

internal class BlockLootTableProvider(output: FabricDataOutput) : FabricBlockLootTableProvider(output) {
    override fun generate() {
        addDrop(ALBOBlocks.EXPOSED_BRICK)
        addDrop(ALBOBlocks.EXPOSED_BRICK_WALL)
        addDrop(ALBOBlocks.EXPOSED_BRICK_STAIRS)
        addDrop(ALBOBlocks.EXPOSED_BRICK_SLAB)

        addDrop(ALBOBlocks.WHITE_CONCRETE_WALL)
        addDrop(ALBOBlocks.WHITE_CONCRETE_STAIRS)
        addDrop(ALBOBlocks.WHITE_CONCRETE_SLAB)

        addDrop(ALBOBlocks.ORANGE_CONCRETE_WALL)
        addDrop(ALBOBlocks.ORANGE_CONCRETE_STAIRS)
        addDrop(ALBOBlocks.ORANGE_CONCRETE_SLAB)

        addDrop(ALBOBlocks.MAGENTA_CONCRETE_WALL)
        addDrop(ALBOBlocks.MAGENTA_CONCRETE_STAIRS)
        addDrop(ALBOBlocks.MAGENTA_CONCRETE_SLAB)

        addDrop(ALBOBlocks.LIGHT_BLUE_CONCRETE_WALL)
        addDrop(ALBOBlocks.LIGHT_BLUE_CONCRETE_STAIRS)
        addDrop(ALBOBlocks.LIGHT_BLUE_CONCRETE_SLAB)

        addDrop(ALBOBlocks.YELLOW_CONCRETE_WALL)
        addDrop(ALBOBlocks.YELLOW_CONCRETE_STAIRS)
        addDrop(ALBOBlocks.YELLOW_CONCRETE_SLAB)

        addDrop(ALBOBlocks.LIME_CONCRETE_WALL)
        addDrop(ALBOBlocks.LIME_CONCRETE_STAIRS)
        addDrop(ALBOBlocks.LIME_CONCRETE_SLAB)

        addDrop(ALBOBlocks.PINK_CONCRETE_WALL)
        addDrop(ALBOBlocks.PINK_CONCRETE_STAIRS)
        addDrop(ALBOBlocks.PINK_CONCRETE_SLAB)

        addDrop(ALBOBlocks.GRAY_CONCRETE_WALL)
        addDrop(ALBOBlocks.GRAY_CONCRETE_STAIRS)
        addDrop(ALBOBlocks.GRAY_CONCRETE_SLAB)

        addDrop(ALBOBlocks.LIGHT_GRAY_CONCRETE_WALL)
        addDrop(ALBOBlocks.LIGHT_GRAY_CONCRETE_STAIRS)
        addDrop(ALBOBlocks.LIGHT_GRAY_CONCRETE_SLAB)

        addDrop(ALBOBlocks.CYAN_CONCRETE_WALL)
        addDrop(ALBOBlocks.CYAN_CONCRETE_STAIRS)
        addDrop(ALBOBlocks.CYAN_CONCRETE_SLAB)

        addDrop(ALBOBlocks.PURPLE_CONCRETE_WALL)
        addDrop(ALBOBlocks.PURPLE_CONCRETE_STAIRS)
        addDrop(ALBOBlocks.PURPLE_CONCRETE_SLAB)

        addDrop(ALBOBlocks.BLUE_CONCRETE_WALL)
        addDrop(ALBOBlocks.BLUE_CONCRETE_STAIRS)
        addDrop(ALBOBlocks.BLUE_CONCRETE_SLAB)

        addDrop(ALBOBlocks.BROWN_CONCRETE_WALL)
        addDrop(ALBOBlocks.BROWN_CONCRETE_STAIRS)
        addDrop(ALBOBlocks.BROWN_CONCRETE_SLAB)

        addDrop(ALBOBlocks.GREEN_CONCRETE_WALL)
        addDrop(ALBOBlocks.GREEN_CONCRETE_STAIRS)
        addDrop(ALBOBlocks.GREEN_CONCRETE_SLAB)

        addDrop(ALBOBlocks.RED_CONCRETE_WALL)
        addDrop(ALBOBlocks.RED_CONCRETE_STAIRS)
        addDrop(ALBOBlocks.RED_CONCRETE_SLAB)

        addDrop(ALBOBlocks.BLACK_CONCRETE_WALL)
        addDrop(ALBOBlocks.BLACK_CONCRETE_STAIRS)
        addDrop(ALBOBlocks.BLACK_CONCRETE_SLAB)
    }
}
