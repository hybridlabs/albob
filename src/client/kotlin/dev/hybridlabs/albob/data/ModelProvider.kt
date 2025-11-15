package dev.hybridlabs.albob.data

import dev.hybridlabs.albob.ALBOB
import dev.hybridlabs.albob.block.ALBOBlocks
import dev.hybridlabs.albob.data.family.ALBOBlockFamilies
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.BlockFamily
import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.ItemModelGenerators
import net.minecraft.data.models.model.ModelTemplate
import net.minecraft.data.models.model.TextureMapping
import net.minecraft.data.models.model.TextureSlot
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.Block
import java.util.Optional

internal class ModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(generator: BlockModelGenerators) {
        ALBOBlockFamilies.families
            .filter(BlockFamily::shouldGenerateModel)
            .forEach { family -> generator.family(family.baseBlock).generateFor(family) }

        fun createDrum(block: Block) {
            val location = TEMPLATE_OIL_DRUM.create(block, TextureMapping.defaultTexture(block), generator.modelOutput)
            generator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, location))
        }

        fun createFoodBowl(block: Block) {
            val location = TEMPLATE_FOOD_BOWL.create(block, TextureMapping.defaultTexture(block), generator.modelOutput)
            generator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, location))
        }

        createDrum(ALBOBlocks.OIL_DRUM)
        createDrum(ALBOBlocks.WHITE_OIL_DRUM)
        createDrum(ALBOBlocks.ORANGE_OIL_DRUM)
        createDrum(ALBOBlocks.MAGENTA_OIL_DRUM)
        createDrum(ALBOBlocks.LIGHT_BLUE_OIL_DRUM)
        createDrum(ALBOBlocks.YELLOW_OIL_DRUM)
        createDrum(ALBOBlocks.LIME_OIL_DRUM)
        createDrum(ALBOBlocks.PINK_OIL_DRUM)
        createDrum(ALBOBlocks.GRAY_OIL_DRUM)
        createDrum(ALBOBlocks.LIGHT_GRAY_OIL_DRUM)
        createDrum(ALBOBlocks.CYAN_OIL_DRUM)
        createDrum(ALBOBlocks.PURPLE_OIL_DRUM)
        createDrum(ALBOBlocks.BLUE_OIL_DRUM)
        createDrum(ALBOBlocks.BROWN_OIL_DRUM)
        createDrum(ALBOBlocks.GREEN_OIL_DRUM)
        createDrum(ALBOBlocks.RED_OIL_DRUM)
        createDrum(ALBOBlocks.BLACK_OIL_DRUM)

        createFoodBowl(ALBOBlocks.FOOD_BOWL)
        createFoodBowl(ALBOBlocks.WHITE_FOOD_BOWL)
        createFoodBowl(ALBOBlocks.ORANGE_FOOD_BOWL)
        createFoodBowl(ALBOBlocks.MAGENTA_FOOD_BOWL)
        createFoodBowl(ALBOBlocks.LIGHT_BLUE_FOOD_BOWL)
        createFoodBowl(ALBOBlocks.YELLOW_FOOD_BOWL)
        createFoodBowl(ALBOBlocks.LIME_FOOD_BOWL)
        createFoodBowl(ALBOBlocks.PINK_FOOD_BOWL)
        createFoodBowl(ALBOBlocks.GRAY_FOOD_BOWL)
        createFoodBowl(ALBOBlocks.LIGHT_GRAY_FOOD_BOWL)
        createFoodBowl(ALBOBlocks.CYAN_FOOD_BOWL)
        createFoodBowl(ALBOBlocks.PURPLE_FOOD_BOWL)
        createFoodBowl(ALBOBlocks.BLUE_FOOD_BOWL)
        createFoodBowl(ALBOBlocks.BROWN_FOOD_BOWL)
        createFoodBowl(ALBOBlocks.GREEN_FOOD_BOWL)
        createFoodBowl(ALBOBlocks.RED_FOOD_BOWL)
        createFoodBowl(ALBOBlocks.BLACK_FOOD_BOWL)
    }

    override fun generateItemModels(generator: ItemModelGenerators) {
    }

    companion object {
        val TEMPLATE_OIL_DRUM: ModelTemplate = create("block/template_metal_drum", TextureSlot.TEXTURE)
        val TEMPLATE_PALLET: ModelTemplate = create("block/template_pallet", TextureSlot.TEXTURE)
        val TEMPLATE_FOOD_BOWL: ModelTemplate = create("block/template_food_bowl", TextureSlot.TEXTURE)

        private fun create(id: String, vararg slots: TextureSlot): ModelTemplate {
            return ModelTemplate(Optional.of(ResourceLocation(ALBOB.MOD_ID, id)), Optional.empty(), *slots)
        }
    }
}
