package dev.hybridlabs.albob.data.client

import dev.hybridlabs.albob.ALBOB
import dev.hybridlabs.albob.block.ALBOBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider

internal class LanguageProvider(output: FabricDataOutput) : FabricLanguageProvider(output) {
    override fun generateTranslations(builder: TranslationBuilder) {
        builder.add("itemGroup.${ALBOB.MOD_ID}.blocks", ALBOB.MOD_NAME)

        registerBlocks(builder)

        builder.add("${ALBOB.MOD_ID}.container.drum", "Drum")
    }

    private fun registerBlocks(builder: TranslationBuilder) {
        builder.add(ALBOBlocks.EXPOSED_BRICK, "Exposed Brick")
        builder.add(ALBOBlocks.EXPOSED_BRICK_WALL, "Exposed Brick Wall")
        builder.add(ALBOBlocks.EXPOSED_BRICK_STAIRS, "Exposed Brick Stairs")
        builder.add(ALBOBlocks.EXPOSED_BRICK_SLAB, "Exposed Brick Slab")

        builder.add(ALBOBlocks.WHITE_CONCRETE_WALL, "White Concrete Wall")
        builder.add(ALBOBlocks.WHITE_CONCRETE_STAIRS, "White Concrete Stairs")
        builder.add(ALBOBlocks.WHITE_CONCRETE_SLAB, "White Concrete Slab")

        builder.add(ALBOBlocks.ORANGE_CONCRETE_WALL, "Orange Concrete Wall")
        builder.add(ALBOBlocks.ORANGE_CONCRETE_STAIRS, "Orange Concrete Stairs")
        builder.add(ALBOBlocks.ORANGE_CONCRETE_SLAB, "Orange Concrete Slab")

        builder.add(ALBOBlocks.MAGENTA_CONCRETE_WALL, "Magenta Concrete Wall")
        builder.add(ALBOBlocks.MAGENTA_CONCRETE_STAIRS, "Magenta Concrete Stairs")
        builder.add(ALBOBlocks.MAGENTA_CONCRETE_SLAB, "Magenta Concrete Slab")

        builder.add(ALBOBlocks.LIGHT_BLUE_CONCRETE_WALL, "Light Blue Concrete Wall")
        builder.add(ALBOBlocks.LIGHT_BLUE_CONCRETE_STAIRS, "Light Blue Concrete Stairs")
        builder.add(ALBOBlocks.LIGHT_BLUE_CONCRETE_SLAB, "Light Blue Concrete Slab")

        builder.add(ALBOBlocks.YELLOW_CONCRETE_WALL, "Yellow Concrete Wall")
        builder.add(ALBOBlocks.YELLOW_CONCRETE_STAIRS, "Yellow Concrete Stairs")
        builder.add(ALBOBlocks.YELLOW_CONCRETE_SLAB, "Yellow Concrete Slab")

        builder.add(ALBOBlocks.LIME_CONCRETE_WALL, "Lime Concrete Wall")
        builder.add(ALBOBlocks.LIME_CONCRETE_STAIRS, "Lime Concrete Stairs")
        builder.add(ALBOBlocks.LIME_CONCRETE_SLAB, "Lime Concrete Slab")

        builder.add(ALBOBlocks.PINK_CONCRETE_WALL, "Pink Concrete Wall")
        builder.add(ALBOBlocks.PINK_CONCRETE_STAIRS, "Pink Concrete Stairs")
        builder.add(ALBOBlocks.PINK_CONCRETE_SLAB, "Pink Concrete Slab")

        builder.add(ALBOBlocks.GRAY_CONCRETE_WALL, "Gray Concrete Wall")
        builder.add(ALBOBlocks.GRAY_CONCRETE_STAIRS, "Gray Concrete Stairs")
        builder.add(ALBOBlocks.GRAY_CONCRETE_SLAB, "Gray Concrete Slab")

        builder.add(ALBOBlocks.LIGHT_GRAY_CONCRETE_WALL, "Light Gray Concrete Wall")
        builder.add(ALBOBlocks.LIGHT_GRAY_CONCRETE_STAIRS, "Light Gray Concrete Stairs")
        builder.add(ALBOBlocks.LIGHT_GRAY_CONCRETE_SLAB, "Light Gray Concrete Slab")

        builder.add(ALBOBlocks.CYAN_CONCRETE_WALL, "Cyan Concrete Wall")
        builder.add(ALBOBlocks.CYAN_CONCRETE_STAIRS, "Cyan Concrete Stairs")
        builder.add(ALBOBlocks.CYAN_CONCRETE_SLAB, "Cyan Concrete Slab")

        builder.add(ALBOBlocks.PURPLE_CONCRETE_WALL, "Purple Concrete Wall")
        builder.add(ALBOBlocks.PURPLE_CONCRETE_STAIRS, "Purple Concrete Stairs")
        builder.add(ALBOBlocks.PURPLE_CONCRETE_SLAB, "Purple Concrete Slab")

        builder.add(ALBOBlocks.BLUE_CONCRETE_WALL, "Blue Concrete Wall")
        builder.add(ALBOBlocks.BLUE_CONCRETE_STAIRS, "Blue Concrete Stairs")
        builder.add(ALBOBlocks.BLUE_CONCRETE_SLAB, "Blue Concrete Slab")

        builder.add(ALBOBlocks.BROWN_CONCRETE_WALL, "Brown Concrete Wall")
        builder.add(ALBOBlocks.BROWN_CONCRETE_STAIRS, "Brown Concrete Stairs")
        builder.add(ALBOBlocks.BROWN_CONCRETE_SLAB, "Brown Concrete Slab")

        builder.add(ALBOBlocks.GREEN_CONCRETE_WALL, "Green Concrete Wall")
        builder.add(ALBOBlocks.GREEN_CONCRETE_STAIRS, "Green Concrete Stairs")
        builder.add(ALBOBlocks.GREEN_CONCRETE_SLAB, "Green Concrete Slab")

        builder.add(ALBOBlocks.RED_CONCRETE_WALL, "Red Concrete Wall")
        builder.add(ALBOBlocks.RED_CONCRETE_STAIRS, "Red Concrete Stairs")
        builder.add(ALBOBlocks.RED_CONCRETE_SLAB, "Red Concrete Slab")

        builder.add(ALBOBlocks.BLACK_CONCRETE_WALL, "Black Concrete Wall")
        builder.add(ALBOBlocks.BLACK_CONCRETE_STAIRS, "Black Concrete Stairs")
        builder.add(ALBOBlocks.BLACK_CONCRETE_SLAB, "Black Concrete Slab")

        builder.add(ALBOBlocks.OIL_DRUM, "Oil Drum")
        builder.add(ALBOBlocks.WHITE_OIL_DRUM, "White Oil Drum")
        builder.add(ALBOBlocks.ORANGE_OIL_DRUM, "Orange Oil Drum")
        builder.add(ALBOBlocks.MAGENTA_OIL_DRUM, "Magenta Oil Drum")
        builder.add(ALBOBlocks.LIGHT_BLUE_OIL_DRUM, "Light Blue Oil Drum")
        builder.add(ALBOBlocks.YELLOW_OIL_DRUM, "Yellow Oil Drum")
        builder.add(ALBOBlocks.LIME_OIL_DRUM, "Lime Oil Drum")
        builder.add(ALBOBlocks.PINK_OIL_DRUM, "Pink Oil Drum")
        builder.add(ALBOBlocks.GRAY_OIL_DRUM, "Gray Oil Drum")
        builder.add(ALBOBlocks.LIGHT_GRAY_OIL_DRUM, "Light Gray Oil Drum")
        builder.add(ALBOBlocks.CYAN_OIL_DRUM, "Cyan Oil Drum")
        builder.add(ALBOBlocks.PURPLE_OIL_DRUM, "Purple Oil Drum")
        builder.add(ALBOBlocks.BLUE_OIL_DRUM, "Blue Oil Drum")
        builder.add(ALBOBlocks.BROWN_OIL_DRUM, "Brown Oil Drum")
        builder.add(ALBOBlocks.GREEN_OIL_DRUM, "Green Oil Drum")
        builder.add(ALBOBlocks.RED_OIL_DRUM, "Red Oil Drum")
        builder.add(ALBOBlocks.BLACK_OIL_DRUM, "Black Oil Drum")

        builder.add(ALBOBlocks.FOOD_BOWL, "Food Bowl")
        builder.add(ALBOBlocks.WHITE_FOOD_BOWL, "White Food Bowl")
        builder.add(ALBOBlocks.ORANGE_FOOD_BOWL, "Orange Food Bowl")
        builder.add(ALBOBlocks.MAGENTA_FOOD_BOWL, "Magenta Food Bowl")
        builder.add(ALBOBlocks.LIGHT_BLUE_FOOD_BOWL, "Light Blue Food Bowl")
        builder.add(ALBOBlocks.YELLOW_FOOD_BOWL, "Yellow Food Bowl")
        builder.add(ALBOBlocks.LIME_FOOD_BOWL, "Lime Food Bowl")
        builder.add(ALBOBlocks.PINK_FOOD_BOWL, "Pink Food Bowl")
        builder.add(ALBOBlocks.GRAY_FOOD_BOWL, "Gray Food Bowl")
        builder.add(ALBOBlocks.LIGHT_GRAY_FOOD_BOWL, "Light Gray Food Bowl")
        builder.add(ALBOBlocks.CYAN_FOOD_BOWL, "Cyan Food Bowl")
        builder.add(ALBOBlocks.PURPLE_FOOD_BOWL, "Purple Food Bowl")
        builder.add(ALBOBlocks.BLUE_FOOD_BOWL, "Blue Food Bowl")
        builder.add(ALBOBlocks.BROWN_FOOD_BOWL, "Brown Food Bowl")
        builder.add(ALBOBlocks.GREEN_FOOD_BOWL, "Green Food Bowl")
        builder.add(ALBOBlocks.RED_FOOD_BOWL, "Red Food Bowl")
        builder.add(ALBOBlocks.BLACK_FOOD_BOWL, "Black Food Bowl")

        builder.add(ALBOBlocks.TRAFFIC_CONE, "Traffic Cone")
    }
}
