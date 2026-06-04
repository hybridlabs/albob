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
    
    val OIL_DRUM = register("oil_drum", ALBOBlocks.OIL_DRUM)
    val WHITE_OIL_DRUM = register("white_oil_drum", ALBOBlocks.WHITE_OIL_DRUM)
    val ORANGE_OIL_DRUM = register("orange_oil_drum", ALBOBlocks.ORANGE_OIL_DRUM)
    val MAGENTA_OIL_DRUM = register("magenta_oil_drum", ALBOBlocks.MAGENTA_OIL_DRUM)
    val LIGHT_BLUE_OIL_DRUM = register("light_blue_oil_drum", ALBOBlocks.LIGHT_BLUE_OIL_DRUM)
    val YELLOW_OIL_DRUM = register("yellow_oil_drum", ALBOBlocks.YELLOW_OIL_DRUM)
    val LIME_OIL_DRUM = register("lime_oil_drum", ALBOBlocks.LIME_OIL_DRUM)
    val PINK_OIL_DRUM = register("pink_oil_drum", ALBOBlocks.PINK_OIL_DRUM)
    val GRAY_OIL_DRUM = register("gray_oil_drum", ALBOBlocks.GRAY_OIL_DRUM)
    val LIGHT_GRAY_OIL_DRUM = register("light_gray_oil_drum", ALBOBlocks.LIGHT_GRAY_OIL_DRUM)
    val CYAN_OIL_DRUM = register("cyan_oil_drum", ALBOBlocks.CYAN_OIL_DRUM)
    val PURPLE_OIL_DRUM = register("purple_oil_drum", ALBOBlocks.PURPLE_OIL_DRUM)
    val BLUE_OIL_DRUM = register("blue_oil_drum", ALBOBlocks.BLUE_OIL_DRUM)
    val BROWN_OIL_DRUM = register("brown_oil_drum", ALBOBlocks.BROWN_OIL_DRUM)
    val GREEN_OIL_DRUM = register("green_oil_drum", ALBOBlocks.GREEN_OIL_DRUM)
    val RED_OIL_DRUM = register("red_oil_drum", ALBOBlocks.RED_OIL_DRUM)
    val BLACK_OIL_DRUM = register("black_oil_drum", ALBOBlocks.BLACK_OIL_DRUM)

    val FOOD_BOWL = register("food_bowl", ALBOBlocks.FOOD_BOWL)
    val WHITE_FOOD_BOWL = register("white_food_bowl", ALBOBlocks.WHITE_FOOD_BOWL)
    val ORANGE_FOOD_BOWL = register("orange_food_bowl", ALBOBlocks.ORANGE_FOOD_BOWL)
    val MAGENTA_FOOD_BOWL = register("magenta_food_bowl", ALBOBlocks.MAGENTA_FOOD_BOWL)
    val LIGHT_BLUE_FOOD_BOWL = register("light_blue_food_bowl", ALBOBlocks.LIGHT_BLUE_FOOD_BOWL)
    val YELLOW_FOOD_BOWL = register("yellow_food_bowl", ALBOBlocks.YELLOW_FOOD_BOWL)
    val LIME_FOOD_BOWL = register("lime_food_bowl", ALBOBlocks.LIME_FOOD_BOWL)
    val PINK_FOOD_BOWL = register("pink_food_bowl", ALBOBlocks.PINK_FOOD_BOWL)
    val GRAY_FOOD_BOWL = register("gray_food_bowl", ALBOBlocks.GRAY_FOOD_BOWL)
    val LIGHT_GRAY_FOOD_BOWL = register("light_gray_food_bowl", ALBOBlocks.LIGHT_GRAY_FOOD_BOWL)
    val CYAN_FOOD_BOWL = register("cyan_food_bowl", ALBOBlocks.CYAN_FOOD_BOWL)
    val PURPLE_FOOD_BOWL = register("purple_food_bowl", ALBOBlocks.PURPLE_FOOD_BOWL)
    val BLUE_FOOD_BOWL = register("blue_food_bowl", ALBOBlocks.BLUE_FOOD_BOWL)
    val BROWN_FOOD_BOWL = register("brown_food_bowl", ALBOBlocks.BROWN_FOOD_BOWL)
    val GREEN_FOOD_BOWL = register("green_food_bowl", ALBOBlocks.GREEN_FOOD_BOWL)
    val RED_FOOD_BOWL = register("red_food_bowl", ALBOBlocks.RED_FOOD_BOWL)
    val BLACK_FOOD_BOWL = register("black_food_bowl", ALBOBlocks.BLACK_FOOD_BOWL)

    val TRAFFIC_CONE = register("traffic_cone", ALBOBlocks.TRAFFIC_CONE)
    val PENDANT_LAMP = register("pendant_lamp", ALBOBlocks.PENDANT_LAMP)
    val IRON_CHANDELIER = register("iron_chandelier", ALBOBlocks.IRON_CHANDELIER)
    val GOLDEN_CHANDELIER = register("golden_chandelier", ALBOBlocks.GOLDEN_CHANDELIER)
    val COPPER_WATERING_CAN = register("copper_watering_can", ALBOBlocks.COPPER_WATERING_CAN)
    val IRON_WATERING_CAN = register("iron_watering_can", ALBOBlocks.IRON_WATERING_CAN)

    val OAK_BIRDHOUSE = register("oak_birdhouse", ALBOBlocks.OAK_BIRDHOUSE)

    val CHECKERBOARD = register("checkerboard", ALBOBlocks.CHECKERBOARD)
    val CHESSBOARD = register("chessboard", ALBOBlocks.CHESSBOARD)
    val WIRE_BASKET = register("wire_basket", ALBOBlocks.WIRE_BASKET)

    private fun register(id: String, block: Block): BlockItem {
        return register(id, BlockItem(block, Item.Properties()))
    }

    private fun <T : Item> register(id: String, item: T): T {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation(ALBOB.MOD_ID, id), item)
    }
}
