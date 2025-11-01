package dev.hybridlabs.albob.block.entity

import dev.hybridlabs.albob.ALBOB
import dev.hybridlabs.albob.block.ALBOBlocks
import net.minecraft.Util
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.util.datafix.fixes.References
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.entity.BlockEntityType

object ALBOBlockEntityTypes {
    val UPRIGHT_BARREL = register("upright_barrel", BlockEntityType.Builder.of(::UprightBarrelBlockEntity,
        ALBOBlocks.OIL_BARREL,
        ALBOBlocks.WHITE_OIL_BARREL,
        ALBOBlocks.ORANGE_OIL_BARREL,
        ALBOBlocks.MAGENTA_OIL_BARREL,
        ALBOBlocks.LIGHT_BLUE_OIL_BARREL,
        ALBOBlocks.YELLOW_OIL_BARREL,
        ALBOBlocks.LIME_OIL_BARREL,
        ALBOBlocks.PINK_OIL_BARREL,
        ALBOBlocks.GRAY_OIL_BARREL,
        ALBOBlocks.LIGHT_GRAY_OIL_BARREL,
        ALBOBlocks.CYAN_OIL_BARREL,
        ALBOBlocks.PURPLE_OIL_BARREL,
        ALBOBlocks.BLUE_OIL_BARREL,
        ALBOBlocks.BROWN_OIL_BARREL,
        ALBOBlocks.GREEN_OIL_BARREL,
        ALBOBlocks.RED_OIL_BARREL,
        ALBOBlocks.BLACK_OIL_BARREL,

        ALBOBlocks.OIL_DRUM,
        ALBOBlocks.WHITE_OIL_DRUM,
        ALBOBlocks.ORANGE_OIL_DRUM,
        ALBOBlocks.MAGENTA_OIL_DRUM,
        ALBOBlocks.LIGHT_BLUE_OIL_DRUM,
        ALBOBlocks.YELLOW_OIL_DRUM,
        ALBOBlocks.LIME_OIL_DRUM,
        ALBOBlocks.PINK_OIL_DRUM,
        ALBOBlocks.GRAY_OIL_DRUM,
        ALBOBlocks.LIGHT_GRAY_OIL_DRUM,
        ALBOBlocks.CYAN_OIL_DRUM,
        ALBOBlocks.PURPLE_OIL_DRUM,
        ALBOBlocks.BLUE_OIL_DRUM,
        ALBOBlocks.BROWN_OIL_DRUM,
        ALBOBlocks.GREEN_OIL_DRUM,
        ALBOBlocks.RED_OIL_DRUM,
        ALBOBlocks.BLACK_OIL_DRUM,
    ))

    @Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
    private fun <T : BlockEntity> register(id: String, builder: BlockEntityType.Builder<T>): BlockEntityType<T> {
        val location = ResourceLocation(ALBOB.MOD_ID, id)
        val choiceType = Util.fetchChoiceType(References.BLOCK_ENTITY, location.toString())
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, location, builder.build(choiceType))
    }
}
