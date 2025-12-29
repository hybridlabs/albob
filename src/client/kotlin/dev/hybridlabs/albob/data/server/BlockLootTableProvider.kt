package dev.hybridlabs.albob.data.server

import dev.hybridlabs.albob.block.ALBOBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider

internal class BlockLootTableProvider(output: FabricDataOutput) : FabricBlockLootTableProvider(output) {
    override fun generate() {
        dropSelf(ALBOBlocks.EXPOSED_BRICK)
        dropSelf(ALBOBlocks.EXPOSED_BRICK_WALL)
        dropSelf(ALBOBlocks.EXPOSED_BRICK_STAIRS)
        dropSelf(ALBOBlocks.EXPOSED_BRICK_SLAB)

        dropSelf(ALBOBlocks.WHITE_CONCRETE_WALL)
        dropSelf(ALBOBlocks.WHITE_CONCRETE_STAIRS)
        dropSelf(ALBOBlocks.WHITE_CONCRETE_SLAB)

        dropSelf(ALBOBlocks.ORANGE_CONCRETE_WALL)
        dropSelf(ALBOBlocks.ORANGE_CONCRETE_STAIRS)
        dropSelf(ALBOBlocks.ORANGE_CONCRETE_SLAB)

        dropSelf(ALBOBlocks.MAGENTA_CONCRETE_WALL)
        dropSelf(ALBOBlocks.MAGENTA_CONCRETE_STAIRS)
        dropSelf(ALBOBlocks.MAGENTA_CONCRETE_SLAB)

        dropSelf(ALBOBlocks.LIGHT_BLUE_CONCRETE_WALL)
        dropSelf(ALBOBlocks.LIGHT_BLUE_CONCRETE_STAIRS)
        dropSelf(ALBOBlocks.LIGHT_BLUE_CONCRETE_SLAB)

        dropSelf(ALBOBlocks.YELLOW_CONCRETE_WALL)
        dropSelf(ALBOBlocks.YELLOW_CONCRETE_STAIRS)
        dropSelf(ALBOBlocks.YELLOW_CONCRETE_SLAB)

        dropSelf(ALBOBlocks.LIME_CONCRETE_WALL)
        dropSelf(ALBOBlocks.LIME_CONCRETE_STAIRS)
        dropSelf(ALBOBlocks.LIME_CONCRETE_SLAB)

        dropSelf(ALBOBlocks.PINK_CONCRETE_WALL)
        dropSelf(ALBOBlocks.PINK_CONCRETE_STAIRS)
        dropSelf(ALBOBlocks.PINK_CONCRETE_SLAB)

        dropSelf(ALBOBlocks.GRAY_CONCRETE_WALL)
        dropSelf(ALBOBlocks.GRAY_CONCRETE_STAIRS)
        dropSelf(ALBOBlocks.GRAY_CONCRETE_SLAB)

        dropSelf(ALBOBlocks.LIGHT_GRAY_CONCRETE_WALL)
        dropSelf(ALBOBlocks.LIGHT_GRAY_CONCRETE_STAIRS)
        dropSelf(ALBOBlocks.LIGHT_GRAY_CONCRETE_SLAB)

        dropSelf(ALBOBlocks.CYAN_CONCRETE_WALL)
        dropSelf(ALBOBlocks.CYAN_CONCRETE_STAIRS)
        dropSelf(ALBOBlocks.CYAN_CONCRETE_SLAB)

        dropSelf(ALBOBlocks.PURPLE_CONCRETE_WALL)
        dropSelf(ALBOBlocks.PURPLE_CONCRETE_STAIRS)
        dropSelf(ALBOBlocks.PURPLE_CONCRETE_SLAB)

        dropSelf(ALBOBlocks.BLUE_CONCRETE_WALL)
        dropSelf(ALBOBlocks.BLUE_CONCRETE_STAIRS)
        dropSelf(ALBOBlocks.BLUE_CONCRETE_SLAB)

        dropSelf(ALBOBlocks.BROWN_CONCRETE_WALL)
        dropSelf(ALBOBlocks.BROWN_CONCRETE_STAIRS)
        dropSelf(ALBOBlocks.BROWN_CONCRETE_SLAB)

        dropSelf(ALBOBlocks.GREEN_CONCRETE_WALL)
        dropSelf(ALBOBlocks.GREEN_CONCRETE_STAIRS)
        dropSelf(ALBOBlocks.GREEN_CONCRETE_SLAB)

        dropSelf(ALBOBlocks.RED_CONCRETE_WALL)
        dropSelf(ALBOBlocks.RED_CONCRETE_STAIRS)
        dropSelf(ALBOBlocks.RED_CONCRETE_SLAB)

        dropSelf(ALBOBlocks.BLACK_CONCRETE_WALL)
        dropSelf(ALBOBlocks.BLACK_CONCRETE_STAIRS)
        dropSelf(ALBOBlocks.BLACK_CONCRETE_SLAB)

        dropSelf(ALBOBlocks.OIL_DRUM)
        dropSelf(ALBOBlocks.WHITE_OIL_DRUM)
        dropSelf(ALBOBlocks.ORANGE_OIL_DRUM)
        dropSelf(ALBOBlocks.MAGENTA_OIL_DRUM)
        dropSelf(ALBOBlocks.LIGHT_BLUE_OIL_DRUM)
        dropSelf(ALBOBlocks.YELLOW_OIL_DRUM)
        dropSelf(ALBOBlocks.LIME_OIL_DRUM)
        dropSelf(ALBOBlocks.PINK_OIL_DRUM)
        dropSelf(ALBOBlocks.GRAY_OIL_DRUM)
        dropSelf(ALBOBlocks.LIGHT_GRAY_OIL_DRUM)
        dropSelf(ALBOBlocks.CYAN_OIL_DRUM)
        dropSelf(ALBOBlocks.PURPLE_OIL_DRUM)
        dropSelf(ALBOBlocks.BLUE_OIL_DRUM)
        dropSelf(ALBOBlocks.BROWN_OIL_DRUM)
        dropSelf(ALBOBlocks.GREEN_OIL_DRUM)
        dropSelf(ALBOBlocks.RED_OIL_DRUM)
        dropSelf(ALBOBlocks.BLACK_OIL_DRUM)

        dropSelf(ALBOBlocks.TRAFFIC_CONE)
        dropSelf(ALBOBlocks.PENDANT_LAMP)

        dropSelf(ALBOBlocks.OAK_BIRDHOUSE)

        dropSelf(ALBOBlocks.CHECKERBOARD)
        dropSelf(ALBOBlocks.CHESSBOARD)
        dropSelf(ALBOBlocks.WIRE_BASKET)
    }
}
