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
    }

    override fun generateItemModels(generator: ItemModelGenerators) {
    }

    companion object {
        val TEMPLATE_OIL_DRUM: ModelTemplate = create("block/template_metal_drum", TextureSlot.TEXTURE)

        private fun create(id: String, vararg slots: TextureSlot): ModelTemplate {
            return ModelTemplate(Optional.of(ResourceLocation(ALBOB.MOD_ID, id)), Optional.empty(), *slots)
        }
    }
}
