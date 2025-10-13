package dev.hybridlabs.albob

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object ALBOB : ModInitializer {
    const val MOD_ID = "albob"
    const val MOD_NAME = "A Little Bit of Blocks"

    private val logger = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		logger.info("Initializing $MOD_NAME")
	}
}
