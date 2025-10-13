package dev.hybridlabs.albob.item

import dev.hybridlabs.albob.ALBOB
import dev.hybridlabs.albob.ALBOB.filterAlbobMod
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier

object ALBOBItemGroups {
    val BLOCKS = register("blocks",
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.${ALBOB.MOD_ID}.blocks"))
            .icon { ItemStack(ALBOBItems.EXPOSED_BRICK) }
            .entries { _, entries ->
                Registries.BLOCK.filterAlbobMod().forEach(entries::add)
            }
            .build()
    )

    private fun register(id: String, group: ItemGroup): ItemGroup {
        return Registry.register(Registries.ITEM_GROUP, Identifier.of(ALBOB.MOD_ID, id), group)
    }
}
