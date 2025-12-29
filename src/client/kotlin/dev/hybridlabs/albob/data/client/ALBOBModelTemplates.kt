package dev.hybridlabs.albob.data.client

import dev.hybridlabs.albob.ALBOB
import net.minecraft.data.models.model.ModelTemplate
import net.minecraft.data.models.model.TextureSlot
import net.minecraft.resources.ResourceLocation
import java.util.Optional

object ALBOBModelTemplates {
    val TEMPLATE_METAL_DRUM: ModelTemplate = create("block/template_metal_drum",
        TextureSlot.SIDE,
        ALBOBTextureSlot.BAND,
        ALBOBTextureSlot.CASE,
        TextureSlot.PARTICLE
    )

    val TEMPLATE_PALLET: ModelTemplate = create("block/template_pallet", TextureSlot.TEXTURE)
    val TEMPLATE_FOOD_BOWL: ModelTemplate = create("block/template_food_bowl", TextureSlot.TEXTURE, TextureSlot.PARTICLE)
    val TEMPLATE_TRAFFIC_CONE: ModelTemplate = create("block/template_traffic_cone", TextureSlot.TEXTURE, TextureSlot.PARTICLE)
    val TEMPLATE_PENDANT_LAMP: ModelTemplate = create("block/template_pendant_lamp", TextureSlot.TEXTURE, TextureSlot.PARTICLE)
    val TEMPLATE_BIRDHOUSE: ModelTemplate = create("block/template_birdhouse", TextureSlot.TEXTURE, TextureSlot.PARTICLE)
    val TEMPLATE_CHECKERBOARD: ModelTemplate = create("block/template_checkerboard", TextureSlot.TEXTURE, TextureSlot.PARTICLE)
    val TEMPLATE_CHESSBOARD: ModelTemplate = create("block/template_chessboard", TextureSlot.TEXTURE, TextureSlot.PARTICLE)
    val TEMPLATE_WIRE_BASKET: ModelTemplate = create("block/template_wire_basket", TextureSlot.TEXTURE, TextureSlot.PARTICLE)

    private fun create(id: String, vararg slots: TextureSlot): ModelTemplate {
        return ModelTemplate(Optional.of(ResourceLocation(ALBOB.MOD_ID, id)), Optional.empty(), *slots)
    }
}
