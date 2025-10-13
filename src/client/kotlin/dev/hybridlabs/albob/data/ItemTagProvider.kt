package dev.hybridlabs.albob.data

import dev.hybridlabs.albob.ALBOB.filterAlbobMod
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.block.SlabBlock
import net.minecraft.block.StairsBlock
import net.minecraft.block.WallBlock
import net.minecraft.item.BlockItem
import net.minecraft.registry.Registries
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import net.minecraft.registry.tag.ItemTags
import java.util.concurrent.CompletableFuture

class ItemTagProvider(output: FabricDataOutput, future: CompletableFuture<WrapperLookup>) : FabricTagProvider.ItemTagProvider(output, future) {
    override fun configure(lookup: WrapperLookup) {
        getOrCreateTagBuilder(ItemTags.WALLS).let { builder ->
            Registries.ITEM.filterAlbobMod()
                .filterIsInstance<BlockItem>()
                .filter { it.block is WallBlock }
                .forEach(builder::add)
        }

        getOrCreateTagBuilder(ItemTags.STAIRS).let { builder ->
            Registries.ITEM.filterAlbobMod()
                .filterIsInstance<BlockItem>()
                .filter { it.block is StairsBlock }
                .forEach(builder::add)
        }

        getOrCreateTagBuilder(ItemTags.SLABS).let { builder ->
            Registries.ITEM.filterAlbobMod()
                .filterIsInstance<BlockItem>()
                .filter { it.block is SlabBlock }
                .forEach(builder::add)
        }
    }
}
