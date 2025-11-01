package dev.hybridlabs.albob.item

import dev.hybridlabs.albob.ALBOB
import dev.hybridlabs.albob.ALBOB.filterAlbobMod
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack

object ALBOBItemGroups {
    val BLOCKS = register("blocks",
        FabricItemGroup.builder()
            .title(Component.translatable("itemGroup.${ALBOB.MOD_ID}.blocks"))
            .icon { ItemStack(ALBOBItems.EXPOSED_BRICK) }
            .displayItems { _, entries ->
                BuiltInRegistries.BLOCK.filterAlbobMod().forEach(entries::accept)
            }
            .build()
    )

    private fun register(id: String, group: CreativeModeTab): CreativeModeTab {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation(ALBOB.MOD_ID, id), group)
    }
}
