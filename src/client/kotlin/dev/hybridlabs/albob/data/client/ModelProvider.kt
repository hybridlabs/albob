package dev.hybridlabs.albob.data.client

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

        generator.create(ALBOBlocks.OIL_DRUM, TEMPLATE_OIL_DRUM)
        generator.create(ALBOBlocks.WHITE_OIL_DRUM, TEMPLATE_OIL_DRUM)
        generator.create(ALBOBlocks.ORANGE_OIL_DRUM, TEMPLATE_OIL_DRUM)
        generator.create(ALBOBlocks.MAGENTA_OIL_DRUM, TEMPLATE_OIL_DRUM)
        generator.create(ALBOBlocks.LIGHT_BLUE_OIL_DRUM, TEMPLATE_OIL_DRUM)
        generator.create(ALBOBlocks.YELLOW_OIL_DRUM, TEMPLATE_OIL_DRUM)
        generator.create(ALBOBlocks.LIME_OIL_DRUM, TEMPLATE_OIL_DRUM)
        generator.create(ALBOBlocks.PINK_OIL_DRUM, TEMPLATE_OIL_DRUM)
        generator.create(ALBOBlocks.GRAY_OIL_DRUM, TEMPLATE_OIL_DRUM)
        generator.create(ALBOBlocks.LIGHT_GRAY_OIL_DRUM, TEMPLATE_OIL_DRUM)
        generator.create(ALBOBlocks.CYAN_OIL_DRUM, TEMPLATE_OIL_DRUM)
        generator.create(ALBOBlocks.PURPLE_OIL_DRUM, TEMPLATE_OIL_DRUM)
        generator.create(ALBOBlocks.BLUE_OIL_DRUM, TEMPLATE_OIL_DRUM)
        generator.create(ALBOBlocks.BROWN_OIL_DRUM, TEMPLATE_OIL_DRUM)
        generator.create(ALBOBlocks.GREEN_OIL_DRUM, TEMPLATE_OIL_DRUM)
        generator.create(ALBOBlocks.RED_OIL_DRUM, TEMPLATE_OIL_DRUM)
        generator.create(ALBOBlocks.BLACK_OIL_DRUM, TEMPLATE_OIL_DRUM)

        generator.create(ALBOBlocks.FOOD_BOWL, TEMPLATE_FOOD_BOWL)
        generator.create(ALBOBlocks.WHITE_FOOD_BOWL, TEMPLATE_FOOD_BOWL)
        generator.create(ALBOBlocks.ORANGE_FOOD_BOWL, TEMPLATE_FOOD_BOWL)
        generator.create(ALBOBlocks.MAGENTA_FOOD_BOWL, TEMPLATE_FOOD_BOWL)
        generator.create(ALBOBlocks.LIGHT_BLUE_FOOD_BOWL, TEMPLATE_FOOD_BOWL)
        generator.create(ALBOBlocks.YELLOW_FOOD_BOWL, TEMPLATE_FOOD_BOWL)
        generator.create(ALBOBlocks.LIME_FOOD_BOWL, TEMPLATE_FOOD_BOWL)
        generator.create(ALBOBlocks.PINK_FOOD_BOWL, TEMPLATE_FOOD_BOWL)
        generator.create(ALBOBlocks.GRAY_FOOD_BOWL, TEMPLATE_FOOD_BOWL)
        generator.create(ALBOBlocks.LIGHT_GRAY_FOOD_BOWL, TEMPLATE_FOOD_BOWL)
        generator.create(ALBOBlocks.CYAN_FOOD_BOWL, TEMPLATE_FOOD_BOWL)
        generator.create(ALBOBlocks.PURPLE_FOOD_BOWL, TEMPLATE_FOOD_BOWL)
        generator.create(ALBOBlocks.BLUE_FOOD_BOWL, TEMPLATE_FOOD_BOWL)
        generator.create(ALBOBlocks.BROWN_FOOD_BOWL, TEMPLATE_FOOD_BOWL)
        generator.create(ALBOBlocks.GREEN_FOOD_BOWL, TEMPLATE_FOOD_BOWL)
        generator.create(ALBOBlocks.RED_FOOD_BOWL, TEMPLATE_FOOD_BOWL)
        generator.create(ALBOBlocks.BLACK_FOOD_BOWL, TEMPLATE_FOOD_BOWL)

        generator.create(ALBOBlocks.TRAFFIC_CONE, TEMPLATE_TRAFFIC_CONE)
    }

    override fun generateItemModels(generator: ItemModelGenerators) {
    }

    companion object {
        val TEMPLATE_OIL_DRUM: ModelTemplate = create("block/template_metal_drum", TextureSlot.TEXTURE)
        val TEMPLATE_PALLET: ModelTemplate = create("block/template_pallet", TextureSlot.TEXTURE)
        val TEMPLATE_FOOD_BOWL: ModelTemplate = create("block/template_food_bowl", TextureSlot.TEXTURE)
        val TEMPLATE_TRAFFIC_CONE: ModelTemplate = create("block/template_traffic_cone", TextureSlot.TEXTURE)

        private fun create(id: String, vararg slots: TextureSlot): ModelTemplate {
            return ModelTemplate(Optional.of(ResourceLocation(ALBOB.MOD_ID, id)), Optional.empty(), *slots)
        }

        fun BlockModelGenerators.create(block: Block, template: ModelTemplate) {
            val location = template.create(block, TextureMapping.defaultTexture(block), modelOutput)
            blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, location))
        }
    }
}
