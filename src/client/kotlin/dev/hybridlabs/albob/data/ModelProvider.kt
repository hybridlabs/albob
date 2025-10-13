package dev.hybridlabs.albob.data

import dev.hybridlabs.albob.data.family.ALBOBlockFamilies
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.family.BlockFamily

internal class ModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(generator: BlockStateModelGenerator) {
        ALBOBlockFamilies.families
            .filter(BlockFamily::shouldGenerateModels)
            .forEach { family -> generator.registerCubeAllModelTexturePool(family.baseBlock).family(family) }
    }

    override fun generateItemModels(generator: ItemModelGenerator) {
    }
}
