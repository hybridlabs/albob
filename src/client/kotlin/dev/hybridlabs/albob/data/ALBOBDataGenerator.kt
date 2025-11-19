package dev.hybridlabs.albob.data

import dev.hybridlabs.albob.ALBOB
import dev.hybridlabs.albob.data.client.LanguageProvider
import dev.hybridlabs.albob.data.client.ModelProvider
import dev.hybridlabs.albob.data.server.BlockLootTableProvider
import dev.hybridlabs.albob.data.server.BlockTagProvider
import dev.hybridlabs.albob.data.server.ItemTagProvider
import dev.hybridlabs.albob.data.server.RecipeProvider
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import org.slf4j.LoggerFactory

internal object ALBOBDataGenerator : DataGeneratorEntrypoint {
    private val logger = LoggerFactory.getLogger("${ALBOB.MOD_ID}-data")

    override fun onInitializeDataGenerator(generator: FabricDataGenerator) {
        logger.info("Initializing ${ALBOB.MOD_NAME} (Data)")

        val pack = generator.createPack()

        pack.addProvider(::ModelProvider)
        pack.addProvider(::LanguageProvider)

        pack.addProvider(::BlockLootTableProvider)

        pack.addProvider(::BlockTagProvider)
        pack.addProvider(::ItemTagProvider)

        pack.addProvider(::RecipeProvider)
    }
}
