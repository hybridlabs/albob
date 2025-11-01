package dev.hybridlabs.albob.data

import dev.hybridlabs.albob.block.ALBOBlocks
import dev.hybridlabs.albob.data.family.ALBOBlockFamilies
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.BlockFamily
import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.ItemModelGenerators

internal class ModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(generator: BlockModelGenerators) {
        ALBOBlockFamilies.families
            .filter(BlockFamily::shouldGenerateModel)
            .forEach { family -> generator.family(family.baseBlock).generateFor(family) }

        generator.createTrivialCube(ALBOBlocks.OIL_BARREL)
        generator.createTrivialCube(ALBOBlocks.WHITE_OIL_BARREL)
        generator.createTrivialCube(ALBOBlocks.ORANGE_OIL_BARREL)
        generator.createTrivialCube(ALBOBlocks.MAGENTA_OIL_BARREL)
        generator.createTrivialCube(ALBOBlocks.LIGHT_BLUE_OIL_BARREL)
        generator.createTrivialCube(ALBOBlocks.YELLOW_OIL_BARREL)
        generator.createTrivialCube(ALBOBlocks.LIME_OIL_BARREL)
        generator.createTrivialCube(ALBOBlocks.PINK_OIL_BARREL)
        generator.createTrivialCube(ALBOBlocks.GRAY_OIL_BARREL)
        generator.createTrivialCube(ALBOBlocks.LIGHT_GRAY_OIL_BARREL)
        generator.createTrivialCube(ALBOBlocks.CYAN_OIL_BARREL)
        generator.createTrivialCube(ALBOBlocks.PURPLE_OIL_BARREL)
        generator.createTrivialCube(ALBOBlocks.BLUE_OIL_BARREL)
        generator.createTrivialCube(ALBOBlocks.BROWN_OIL_BARREL)
        generator.createTrivialCube(ALBOBlocks.GREEN_OIL_BARREL)
        generator.createTrivialCube(ALBOBlocks.RED_OIL_BARREL)
        generator.createTrivialCube(ALBOBlocks.BLACK_OIL_BARREL)

        generator.createTrivialCube(ALBOBlocks.OIL_DRUM)
        generator.createTrivialCube(ALBOBlocks.WHITE_OIL_DRUM)
        generator.createTrivialCube(ALBOBlocks.ORANGE_OIL_DRUM)
        generator.createTrivialCube(ALBOBlocks.MAGENTA_OIL_DRUM)
        generator.createTrivialCube(ALBOBlocks.LIGHT_BLUE_OIL_DRUM)
        generator.createTrivialCube(ALBOBlocks.YELLOW_OIL_DRUM)
        generator.createTrivialCube(ALBOBlocks.LIME_OIL_DRUM)
        generator.createTrivialCube(ALBOBlocks.PINK_OIL_DRUM)
        generator.createTrivialCube(ALBOBlocks.GRAY_OIL_DRUM)
        generator.createTrivialCube(ALBOBlocks.LIGHT_GRAY_OIL_DRUM)
        generator.createTrivialCube(ALBOBlocks.CYAN_OIL_DRUM)
        generator.createTrivialCube(ALBOBlocks.PURPLE_OIL_DRUM)
        generator.createTrivialCube(ALBOBlocks.BLUE_OIL_DRUM)
        generator.createTrivialCube(ALBOBlocks.BROWN_OIL_DRUM)
        generator.createTrivialCube(ALBOBlocks.GREEN_OIL_DRUM)
        generator.createTrivialCube(ALBOBlocks.RED_OIL_DRUM)
        generator.createTrivialCube(ALBOBlocks.BLACK_OIL_DRUM)
    }

    override fun generateItemModels(generator: ItemModelGenerators) {
    }
}
