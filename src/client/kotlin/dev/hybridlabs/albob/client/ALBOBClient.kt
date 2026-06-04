package dev.hybridlabs.albob.client

import dev.hybridlabs.albob.ALBOB
import dev.hybridlabs.albob.block.ALBOBlocks
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.client.renderer.RenderType
import org.slf4j.LoggerFactory

object ALBOBClient : ClientModInitializer {
    private val logger = LoggerFactory.getLogger("${ALBOB.MOD_ID}-client")

    override fun onInitializeClient() {
        logger.info("Initializing ${ALBOB.MOD_NAME} (Client)")

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
            ALBOBlocks.PENDANT_LAMP,
            ALBOBlocks.GOLDEN_CHANDELIER,
            ALBOBlocks.IRON_CHANDELIER,
            ALBOBlocks.COPPER_WATERING_CAN,
            ALBOBlocks.IRON_WATERING_CAN,
            ALBOBlocks.WIRE_BASKET,
        )
    }
}
