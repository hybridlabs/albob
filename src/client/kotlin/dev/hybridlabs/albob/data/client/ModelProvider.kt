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

        generator.createOilDrum(ALBOBlocks.OIL_DRUM)
        generator.createOilDrum(ALBOBlocks.WHITE_OIL_DRUM)
        generator.createOilDrum(ALBOBlocks.ORANGE_OIL_DRUM)
        generator.createOilDrum(ALBOBlocks.MAGENTA_OIL_DRUM)
        generator.createOilDrum(ALBOBlocks.LIGHT_BLUE_OIL_DRUM)
        generator.createOilDrum(ALBOBlocks.YELLOW_OIL_DRUM)
        generator.createOilDrum(ALBOBlocks.LIME_OIL_DRUM)
        generator.createOilDrum(ALBOBlocks.PINK_OIL_DRUM)
        generator.createOilDrum(ALBOBlocks.GRAY_OIL_DRUM)
        generator.createOilDrum(ALBOBlocks.LIGHT_GRAY_OIL_DRUM)
        generator.createOilDrum(ALBOBlocks.CYAN_OIL_DRUM)
        generator.createOilDrum(ALBOBlocks.PURPLE_OIL_DRUM)
        generator.createOilDrum(ALBOBlocks.BLUE_OIL_DRUM)
        generator.createOilDrum(ALBOBlocks.BROWN_OIL_DRUM)
        generator.createOilDrum(ALBOBlocks.GREEN_OIL_DRUM)
        generator.createOilDrum(ALBOBlocks.RED_OIL_DRUM)
        generator.createOilDrum(ALBOBlocks.BLACK_OIL_DRUM)

        generator.create(ALBOBlocks.FOOD_BOWL, TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.WHITE_FOOD_BOWL, TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.ORANGE_FOOD_BOWL, TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.MAGENTA_FOOD_BOWL, TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.LIGHT_BLUE_FOOD_BOWL, TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.YELLOW_FOOD_BOWL, TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.LIME_FOOD_BOWL, TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.PINK_FOOD_BOWL, TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.GRAY_FOOD_BOWL, TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.LIGHT_GRAY_FOOD_BOWL, TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.CYAN_FOOD_BOWL, TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.PURPLE_FOOD_BOWL, TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.BLUE_FOOD_BOWL, TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.BROWN_FOOD_BOWL, TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.GREEN_FOOD_BOWL, TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.RED_FOOD_BOWL, TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.BLACK_FOOD_BOWL, TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)

        generator.create(ALBOBlocks.TRAFFIC_CONE, TEMPLATE_TRAFFIC_CONE, TextureMapping.getBlockTexture(ALBOBlocks.TRAFFIC_CONE, "_particle"))
    }

    override fun generateItemModels(generator: ItemModelGenerators) {
    }

    companion object {
        val TEMPLATE_METAL_DRUM: ModelTemplate = create("block/template_metal_drum",
            TextureSlot.SIDE,
            ALBOBTextureSlot.BAND,
            ALBOBTextureSlot.CASE,
            TextureSlot.PARTICLE
        )

        val TEMPLATE_PALLET: ModelTemplate = create("block/template_pallet", TextureSlot.TEXTURE)
        val TEMPLATE_FOOD_BOWL: ModelTemplate = create("block/template_food_bowl", TextureSlot.TEXTURE, TextureSlot.PARTICLE)
        val TEMPLATE_TRAFFIC_CONE: ModelTemplate = create("block/template_traffic_cone", TextureSlot.TEXTURE, TextureSlot.PARTICLE)

        val FOOD_BOWL_FOOD_TEXTURE: ResourceLocation = TextureMapping.getBlockTexture(ALBOBlocks.FOOD_BOWL, "_food")
        val OIL_DRUM_CASE_TEXTURE: ResourceLocation = TextureMapping.getBlockTexture(ALBOBlocks.OIL_DRUM, "_case")

        private fun create(id: String, vararg slots: TextureSlot): ModelTemplate {
            return ModelTemplate(Optional.of(ResourceLocation(ALBOB.MOD_ID, id)), Optional.empty(), *slots)
        }

        fun BlockModelGenerators.create(block: Block, template: ModelTemplate, particleLocation: ResourceLocation? = null) {
            val mapping = TextureMapping.defaultTexture(block).also {
                if (particleLocation != null) {
                    it.put(TextureSlot.PARTICLE, particleLocation)
                }
            }

            val location = template.create(block, mapping, modelOutput)
            blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, location))
        }

        fun TextureMapping.put(slot: TextureSlot, block: Block): TextureMapping {
            return put(slot, TextureMapping.getBlockTexture(block, "_${slot.id}"))
        }

        /* Block Specific */

        fun BlockModelGenerators.createOilDrum(block: Block) {
            val mapping = TextureMapping()
                .put(TextureSlot.SIDE, block)
                .put(ALBOBTextureSlot.BAND, block)
                .put(ALBOBTextureSlot.CASE, OIL_DRUM_CASE_TEXTURE)
                .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(block, "_${TextureSlot.SIDE.id}"))

            val location = TEMPLATE_METAL_DRUM.create(block, mapping, modelOutput)
            blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, location))
        }
    }
}
