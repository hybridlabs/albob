package dev.hybridlabs.albob.item

import dev.hybridlabs.albob.ALBOB
import dev.hybridlabs.albob.block.ALBOBlocks
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block

object ALBOBItems {
    val EXPOSED_BRICK = register("exposed_brick", ALBOBlocks.EXPOSED_BRICK)
    val EXPOSED_BRICK_WALL = register("exposed_brick_wall", ALBOBlocks.EXPOSED_BRICK_WALL)
    val EXPOSED_BRICK_STAIRS = register("exposed_brick_stairs", ALBOBlocks.EXPOSED_BRICK_STAIRS)
    val EXPOSED_BRICK_SLAB = register("exposed_brick_slab", ALBOBlocks.EXPOSED_BRICK_SLAB)

    val WHITE_CONCRETE_WALL = register("white_concrete_wall", ALBOBlocks.WHITE_CONCRETE_WALL)
    val ORANGE_CONCRETE_WALL = register("orange_concrete_wall", ALBOBlocks.ORANGE_CONCRETE_WALL)
    val MAGENTA_CONCRETE_WALL = register("magenta_concrete_wall", ALBOBlocks.MAGENTA_CONCRETE_WALL)
    val LIGHT_BLUE_CONCRETE_WALL = register("light_blue_concrete_wall", ALBOBlocks.LIGHT_BLUE_CONCRETE_WALL)
    val YELLOW_CONCRETE_WALL = register("yellow_concrete_wall", ALBOBlocks.YELLOW_CONCRETE_WALL)
    val LIME_CONCRETE_WALL = register("lime_concrete_wall", ALBOBlocks.LIME_CONCRETE_WALL)
    val PINK_CONCRETE_WALL = register("pink_concrete_wall", ALBOBlocks.PINK_CONCRETE_WALL)
    val GRAY_CONCRETE_WALL = register("gray_concrete_wall", ALBOBlocks.GRAY_CONCRETE_WALL)
    val LIGHT_GRAY_CONCRETE_WALL = register("light_gray_concrete_wall", ALBOBlocks.LIGHT_GRAY_CONCRETE_WALL)
    val CYAN_CONCRETE_WALL = register("cyan_concrete_wall", ALBOBlocks.CYAN_CONCRETE_WALL)
    val PURPLE_CONCRETE_WALL = register("purple_concrete_wall", ALBOBlocks.PURPLE_CONCRETE_WALL)
    val BLUE_CONCRETE_WALL = register("blue_concrete_wall", ALBOBlocks.BLUE_CONCRETE_WALL)
    val BROWN_CONCRETE_WALL = register("brown_concrete_wall", ALBOBlocks.BROWN_CONCRETE_WALL)
    val GREEN_CONCRETE_WALL = register("green_concrete_wall", ALBOBlocks.GREEN_CONCRETE_WALL)
    val RED_CONCRETE_WALL = register("red_concrete_wall", ALBOBlocks.RED_CONCRETE_WALL)
    val BLACK_CONCRETE_WALL = register("black_concrete_wall", ALBOBlocks.BLACK_CONCRETE_WALL)

    val WHITE_CONCRETE_STAIRS = register("white_concrete_stairs", ALBOBlocks.WHITE_CONCRETE_STAIRS)
    val ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs", ALBOBlocks.ORANGE_CONCRETE_STAIRS)
    val MAGENTA_CONCRETE_STAIRS = register("magenta_concrete_stairs", ALBOBlocks.MAGENTA_CONCRETE_STAIRS)
    val LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs", ALBOBlocks.LIGHT_BLUE_CONCRETE_STAIRS)
    val YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs", ALBOBlocks.YELLOW_CONCRETE_STAIRS)
    val LIME_CONCRETE_STAIRS = register("lime_concrete_stairs", ALBOBlocks.LIME_CONCRETE_STAIRS)
    val PINK_CONCRETE_STAIRS = register("pink_concrete_stairs", ALBOBlocks.PINK_CONCRETE_STAIRS)
    val GRAY_CONCRETE_STAIRS = register("gray_concrete_stairs", ALBOBlocks.GRAY_CONCRETE_STAIRS)
    val LIGHT_GRAY_CONCRETE_STAIRS = register("light_gray_concrete_stairs", ALBOBlocks.LIGHT_GRAY_CONCRETE_STAIRS)
    val CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs", ALBOBlocks.CYAN_CONCRETE_STAIRS)
    val PURPLE_CONCRETE_STAIRS = register("purple_concrete_stairs", ALBOBlocks.PURPLE_CONCRETE_STAIRS)
    val BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs", ALBOBlocks.BLUE_CONCRETE_STAIRS)
    val BROWN_CONCRETE_STAIRS = register("brown_concrete_stairs", ALBOBlocks.BROWN_CONCRETE_STAIRS)
    val GREEN_CONCRETE_STAIRS = register("green_concrete_stairs", ALBOBlocks.GREEN_CONCRETE_STAIRS)
    val RED_CONCRETE_STAIRS = register("red_concrete_stairs", ALBOBlocks.RED_CONCRETE_STAIRS)
    val BLACK_CONCRETE_STAIRS = register("black_concrete_stairs", ALBOBlocks.BLACK_CONCRETE_STAIRS)

    val WHITE_CONCRETE_SLAB = register("white_concrete_slab", ALBOBlocks.WHITE_CONCRETE_SLAB)
    val ORANGE_CONCRETE_SLAB = register("orange_concrete_slab", ALBOBlocks.ORANGE_CONCRETE_SLAB)
    val MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab", ALBOBlocks.MAGENTA_CONCRETE_SLAB)
    val LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab", ALBOBlocks.LIGHT_BLUE_CONCRETE_SLAB)
    val YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab", ALBOBlocks.YELLOW_CONCRETE_SLAB)
    val LIME_CONCRETE_SLAB = register("lime_concrete_slab", ALBOBlocks.LIME_CONCRETE_SLAB)
    val PINK_CONCRETE_SLAB = register("pink_concrete_slab", ALBOBlocks.PINK_CONCRETE_SLAB)
    val GRAY_CONCRETE_SLAB = register("gray_concrete_slab", ALBOBlocks.GRAY_CONCRETE_SLAB)
    val LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab", ALBOBlocks.LIGHT_GRAY_CONCRETE_SLAB)
    val CYAN_CONCRETE_SLAB = register("cyan_concrete_slab", ALBOBlocks.CYAN_CONCRETE_SLAB)
    val PURPLE_CONCRETE_SLAB = register("purple_concrete_slab", ALBOBlocks.PURPLE_CONCRETE_SLAB)
    val BLUE_CONCRETE_SLAB = register("blue_concrete_slab", ALBOBlocks.BLUE_CONCRETE_SLAB)
    val BROWN_CONCRETE_SLAB = register("brown_concrete_slab", ALBOBlocks.BROWN_CONCRETE_SLAB)
    val GREEN_CONCRETE_SLAB = register("green_concrete_slab", ALBOBlocks.GREEN_CONCRETE_SLAB)
    val RED_CONCRETE_SLAB = register("red_concrete_slab", ALBOBlocks.RED_CONCRETE_SLAB)
    val BLACK_CONCRETE_SLAB = register("black_concrete_slab", ALBOBlocks.BLACK_CONCRETE_SLAB)

    private fun register(id: String, block: Block): BlockItem {
        return register(id, BlockItem(block, Item.Properties()))
    }

    private fun <T : Item> register(id: String, item: T): T {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation(ALBOB.MOD_ID, id), item)
    }
}
