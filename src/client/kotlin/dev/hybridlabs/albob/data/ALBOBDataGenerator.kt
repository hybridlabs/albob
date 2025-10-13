package dev.hybridlabs.albob.data

import dev.hybridlabs.albob.ALBOB
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import org.slf4j.LoggerFactory

object ALBOBDataGenerator : DataGeneratorEntrypoint {
    private val logger = LoggerFactory.getLogger("${ALBOB.MOD_ID}-data")

	override fun onInitializeDataGenerator(generator: FabricDataGenerator) {
        logger.info("Initializing ${ALBOB.MOD_NAME} (Data)")

        val pack = generator.createPack()
        pack.addProvider(::ModelProvider)
        pack.addProvider(::LanguageProvider)
	}
}
