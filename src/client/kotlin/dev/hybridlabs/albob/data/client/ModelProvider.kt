package dev.hybridlabs.albob.data.client

import dev.hybridlabs.albob.block.ALBOBlocks
import dev.hybridlabs.albob.data.family.ALBOBlockFamilies
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.core.Direction
import net.minecraft.data.BlockFamily
import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.ItemModelGenerators
import net.minecraft.data.models.blockstates.BlockStateGenerator
import net.minecraft.data.models.blockstates.MultiVariantGenerator
import net.minecraft.data.models.blockstates.PropertyDispatch
import net.minecraft.data.models.blockstates.Variant
import net.minecraft.data.models.blockstates.VariantProperties
import net.minecraft.data.models.model.ModelTemplate
import net.minecraft.data.models.model.TextureMapping
import net.minecraft.data.models.model.TextureSlot
import net.minecraft.data.models.model.TexturedModel
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.properties.BlockStateProperties

internal class ModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(generator: BlockModelGenerators) {
        ALBOBlockFamilies.families
            .filter(BlockFamily::shouldGenerateModel)
            .forEach { family -> generator.family(family.baseBlock).generateFor(family) }

        generator.create(ALBOBlocks.OIL_DRUM, ALBOBModelTemplates.TEMPLATE_METAL_DRUM)
        generator.create(ALBOBlocks.WHITE_OIL_DRUM, ALBOBModelTemplates.TEMPLATE_METAL_DRUM)
        generator.create(ALBOBlocks.ORANGE_OIL_DRUM, ALBOBModelTemplates.TEMPLATE_METAL_DRUM)
        generator.create(ALBOBlocks.MAGENTA_OIL_DRUM, ALBOBModelTemplates.TEMPLATE_METAL_DRUM)
        generator.create(ALBOBlocks.LIGHT_BLUE_OIL_DRUM, ALBOBModelTemplates.TEMPLATE_METAL_DRUM)
        generator.create(ALBOBlocks.YELLOW_OIL_DRUM, ALBOBModelTemplates.TEMPLATE_METAL_DRUM)
        generator.create(ALBOBlocks.LIME_OIL_DRUM, ALBOBModelTemplates.TEMPLATE_METAL_DRUM)
        generator.create(ALBOBlocks.PINK_OIL_DRUM, ALBOBModelTemplates.TEMPLATE_METAL_DRUM)
        generator.create(ALBOBlocks.GRAY_OIL_DRUM, ALBOBModelTemplates.TEMPLATE_METAL_DRUM)
        generator.create(ALBOBlocks.LIGHT_GRAY_OIL_DRUM, ALBOBModelTemplates.TEMPLATE_METAL_DRUM)
        generator.create(ALBOBlocks.CYAN_OIL_DRUM, ALBOBModelTemplates.TEMPLATE_METAL_DRUM)
        generator.create(ALBOBlocks.PURPLE_OIL_DRUM, ALBOBModelTemplates.TEMPLATE_METAL_DRUM)
        generator.create(ALBOBlocks.BLUE_OIL_DRUM, ALBOBModelTemplates.TEMPLATE_METAL_DRUM)
        generator.create(ALBOBlocks.BROWN_OIL_DRUM, ALBOBModelTemplates.TEMPLATE_METAL_DRUM)
        generator.create(ALBOBlocks.GREEN_OIL_DRUM, ALBOBModelTemplates.TEMPLATE_METAL_DRUM)
        generator.create(ALBOBlocks.RED_OIL_DRUM, ALBOBModelTemplates.TEMPLATE_METAL_DRUM)
        generator.create(ALBOBlocks.BLACK_OIL_DRUM, ALBOBModelTemplates.TEMPLATE_METAL_DRUM)

        generator.create(ALBOBlocks.FOOD_BOWL, ALBOBModelTemplates.TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.WHITE_FOOD_BOWL, ALBOBModelTemplates.TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.ORANGE_FOOD_BOWL, ALBOBModelTemplates.TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.MAGENTA_FOOD_BOWL, ALBOBModelTemplates.TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.LIGHT_BLUE_FOOD_BOWL, ALBOBModelTemplates.TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.YELLOW_FOOD_BOWL, ALBOBModelTemplates.TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.LIME_FOOD_BOWL, ALBOBModelTemplates.TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.PINK_FOOD_BOWL, ALBOBModelTemplates.TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.GRAY_FOOD_BOWL, ALBOBModelTemplates.TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.LIGHT_GRAY_FOOD_BOWL, ALBOBModelTemplates.TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.CYAN_FOOD_BOWL, ALBOBModelTemplates.TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.PURPLE_FOOD_BOWL, ALBOBModelTemplates.TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.BLUE_FOOD_BOWL, ALBOBModelTemplates.TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.BROWN_FOOD_BOWL, ALBOBModelTemplates.TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.GREEN_FOOD_BOWL, ALBOBModelTemplates.TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.RED_FOOD_BOWL, ALBOBModelTemplates.TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)
        generator.create(ALBOBlocks.BLACK_FOOD_BOWL, ALBOBModelTemplates.TEMPLATE_FOOD_BOWL, FOOD_BOWL_FOOD_TEXTURE)

        generator.createParticle(ALBOBlocks.TRAFFIC_CONE, ALBOBModelTemplates.TEMPLATE_TRAFFIC_CONE)
        generator.createParticle(ALBOBlocks.PENDANT_LAMP, ALBOBModelTemplates.TEMPLATE_PENDANT_LAMP)
        generator.createParticle(ALBOBlocks.IRON_CHANDELIER, ALBOBModelTemplates.TEMPLATE_CHANDELIER)
        generator.createParticle(ALBOBlocks.GOLDEN_CHANDELIER, ALBOBModelTemplates.TEMPLATE_CHANDELIER)

        ALBOBlocks.WIRE_BASKET.let { block ->
            val location = generator.createModel(block, ALBOBModelTemplates.TEMPLATE_WIRE_BASKET)
            generator.blockStateOutput.accept(createXZRotationVariant(block, location))
        }

        generator.createBasicHorizontal(ALBOBlocks.COPPER_WATERING_CAN, ALBOBModelTemplates.TEMPLATE_WATERING_CAN)
        generator.createBasicHorizontal(ALBOBlocks.IRON_WATERING_CAN, ALBOBModelTemplates.TEMPLATE_WATERING_CAN)
        generator.createBasicHorizontal(ALBOBlocks.OAK_BIRDHOUSE, ALBOBModelTemplates.TEMPLATE_BIRDHOUSE)
        generator.createBasicHorizontal(ALBOBlocks.CHECKERBOARD, ALBOBModelTemplates.TEMPLATE_CHECKERBOARD)
        generator.createBasicHorizontal(ALBOBlocks.CHESSBOARD, ALBOBModelTemplates.TEMPLATE_CHESSBOARD)
    }

    override fun generateItemModels(generator: ItemModelGenerators) {
    }

    companion object {
        val FOOD_BOWL_FOOD_TEXTURE: ResourceLocation = TextureMapping.getBlockTexture(ALBOBlocks.FOOD_BOWL, "_food")

        fun createMapping(block: Block, particleLocation: ResourceLocation? = TextureMapping.getBlockTexture(block)): TextureMapping? {
            return TextureMapping.defaultTexture(block).also {
                if (particleLocation != null) {
                    it.put(TextureSlot.PARTICLE, particleLocation)
                }
            }
        }

        fun BlockModelGenerators.createModel(block: Block, template: ModelTemplate, particleLocation: ResourceLocation? = TextureMapping.getBlockTexture(block)): ResourceLocation {
            val mapping = createMapping(block, particleLocation)

            return template.create(block, mapping, modelOutput)
        }

        fun BlockModelGenerators.create(block: Block, template: ModelTemplate, particleLocation: ResourceLocation? = TextureMapping.getBlockTexture(block)) {
            val location = createModel(block, template, particleLocation)
            blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, location))
        }

        fun BlockModelGenerators.createParticle(block: Block, template: ModelTemplate) {
            create(block, template, TextureMapping.getBlockTexture(block, "_particle"))
        }

        fun TextureMapping.put(slot: TextureSlot, block: Block): TextureMapping {
            return put(slot, TextureMapping.getBlockTexture(block, "_${slot.id}"))
        }

        /* Block Specific */

        fun createXZRotationVariant(block: Block, location: ResourceLocation): BlockStateGenerator {
            return MultiVariantGenerator.multiVariant(block)
                .with(
                    PropertyDispatch.property(BlockStateProperties.HORIZONTAL_AXIS)
                        .select(
                            Direction.Axis.Z,
                            Variant.variant().with(VariantProperties.MODEL, location)
                        )
                        .select(
                            Direction.Axis.X,
                            Variant.variant()
                                .with(VariantProperties.MODEL, location)
                                .with(
                                    VariantProperties.Y_ROT,
                                    VariantProperties.Rotation.R90
                                )
                        )
                )
        }

        private fun BlockModelGenerators.createBasicHorizontal(block: Block, template: ModelTemplate) {
            createHorizontallyRotatedBlock(block, TexturedModel.createDefault(::createMapping, template))
        }
    }
}
