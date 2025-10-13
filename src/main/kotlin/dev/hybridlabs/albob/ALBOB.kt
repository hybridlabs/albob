package dev.hybridlabs.albob

import dev.hybridlabs.albob.block.ALBOBlocks
import dev.hybridlabs.albob.item.ALBOBItemGroups
import dev.hybridlabs.albob.item.ALBOBItems
import net.fabricmc.api.ModInitializer
import net.minecraft.registry.Registry
import org.slf4j.LoggerFactory

object ALBOB : ModInitializer {
    const val MOD_ID = "albob"
    const val MOD_NAME = "A Little Bit of Blocks"

    private val logger = LoggerFactory.getLogger(MOD_ID)

	@Suppress("UnusedExpression")
    override fun onInitialize() {
		logger.info("Initializing $MOD_NAME")

        ALBOBlocks
        ALBOBItems
        ALBOBItemGroups
	}

    fun <T> Registry<T>.filterAlbobMod(): List<T> {
        return filter { obj ->
            val identifier = getId(obj)
            identifier?.namespace == MOD_ID
        }
    }
}
