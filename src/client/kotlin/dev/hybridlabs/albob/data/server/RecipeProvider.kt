package dev.hybridlabs.albob.data.server

import dev.hybridlabs.albob.item.ALBOBItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.recipes.FinishedRecipe
import net.minecraft.data.recipes.RecipeCategory
import net.minecraft.data.recipes.ShapedRecipeBuilder
import net.minecraft.data.recipes.ShapelessRecipeBuilder
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import net.minecraft.world.item.crafting.Ingredient
import java.util.function.Consumer

class RecipeProvider(output: FabricDataOutput) : FabricRecipeProvider(output) {
    override fun buildRecipes(exporter: Consumer<FinishedRecipe>) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ALBOBItems.OIL_DRUM)
            .define('#', Items.IRON_NUGGET)
            .define('X', Items.IRON_INGOT)
            .pattern("X#X")
            .pattern("X X")
            .pattern("X#X")
            .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
            .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
            .group("oil_drum")
            .save(exporter)

        colorBlockWithDye(
            exporter,
            ALBOBItems.OIL_DRUM,
            listOf(
                ALBOBItems.BLACK_OIL_DRUM,
                ALBOBItems.BLUE_OIL_DRUM,
                ALBOBItems.BROWN_OIL_DRUM,
                ALBOBItems.CYAN_OIL_DRUM,
                ALBOBItems.GRAY_OIL_DRUM,
                ALBOBItems.GREEN_OIL_DRUM,
                ALBOBItems.LIGHT_BLUE_OIL_DRUM,
                ALBOBItems.LIGHT_GRAY_OIL_DRUM,
                ALBOBItems.LIME_OIL_DRUM,
                ALBOBItems.MAGENTA_OIL_DRUM,
                ALBOBItems.ORANGE_OIL_DRUM,
                ALBOBItems.PINK_OIL_DRUM,
                ALBOBItems.PURPLE_OIL_DRUM,
                ALBOBItems.RED_OIL_DRUM,
                ALBOBItems.YELLOW_OIL_DRUM,
                ALBOBItems.WHITE_OIL_DRUM,
            ), "oil_drum"
        )

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ALBOBItems.FOOD_BOWL)
            .define('X', Items.BRICK)
            .pattern("X X")
            .pattern("XXX")
            .unlockedBy("has_brick", has(Items.BRICK))
            .group("food_bowl")
            .save(exporter)

        colorBlockWithDye(
            exporter,
            ALBOBItems.FOOD_BOWL,
            listOf(
                ALBOBItems.BLACK_FOOD_BOWL,
                ALBOBItems.BLUE_FOOD_BOWL,
                ALBOBItems.BROWN_FOOD_BOWL,
                ALBOBItems.CYAN_FOOD_BOWL,
                ALBOBItems.GRAY_FOOD_BOWL,
                ALBOBItems.GREEN_FOOD_BOWL,
                ALBOBItems.LIGHT_BLUE_FOOD_BOWL,
                ALBOBItems.LIGHT_GRAY_FOOD_BOWL,
                ALBOBItems.LIME_FOOD_BOWL,
                ALBOBItems.MAGENTA_FOOD_BOWL,
                ALBOBItems.ORANGE_FOOD_BOWL,
                ALBOBItems.PINK_FOOD_BOWL,
                ALBOBItems.PURPLE_FOOD_BOWL,
                ALBOBItems.RED_FOOD_BOWL,
                ALBOBItems.YELLOW_FOOD_BOWL,
                ALBOBItems.WHITE_FOOD_BOWL,
            ), "food_bowl"
        )
    }

    fun colorBlockWithDye(exporter: Consumer<FinishedRecipe>, rootItem: Item, results: List<Item>, group: String) {
        ORDERED_DYE_LIST.forEachIndexed { index, dyeItem ->
            val result = results.getOrNull(index) ?: throw IllegalArgumentException("No result provided for $dyeItem @ $index")
            ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result)
                .requires(dyeItem)
                .requires(Ingredient.of(*(results + rootItem).toTypedArray()))
                .group(group)
                .unlockedBy("has_needed_dye", has(dyeItem))
                .unlockedBy("has_root_item", has(rootItem))
                .save(exporter, "dye_" + getItemName(result))
        }
    }

    companion object {
        val ORDERED_DYE_LIST = listOf(
            Items.BLACK_DYE,
            Items.BLUE_DYE,
            Items.BROWN_DYE,
            Items.CYAN_DYE,
            Items.GRAY_DYE,
            Items.GREEN_DYE,
            Items.LIGHT_BLUE_DYE,
            Items.LIGHT_GRAY_DYE,
            Items.LIME_DYE,
            Items.MAGENTA_DYE,
            Items.ORANGE_DYE,
            Items.PINK_DYE,
            Items.PURPLE_DYE,
            Items.RED_DYE,
            Items.YELLOW_DYE,
            Items.WHITE_DYE,
        )
    }
}
