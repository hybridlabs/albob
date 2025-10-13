package dev.hybridlabs.albob.client

import dev.hybridlabs.albob.ALBOB
import net.fabricmc.api.ClientModInitializer
import org.slf4j.LoggerFactory

object ALBOBClient : ClientModInitializer {
    private val logger = LoggerFactory.getLogger("${ALBOB.MOD_ID}-client")

	override fun onInitializeClient() {
        logger.info("Initializing ${ALBOB.MOD_NAME} (Client)")
	}
}
