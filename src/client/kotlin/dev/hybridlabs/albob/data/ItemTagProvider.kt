package dev.hybridlabs.albob.data

import dev.hybridlabs.albob.ALBOB.filterAlbobMod
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.tags.ItemTags
import net.minecraft.world.item.BlockItem
import net.minecraft.world.level.block.SlabBlock
import net.minecraft.world.level.block.StairBlock
import net.minecraft.world.level.block.WallBlock
import java.util.concurrent.CompletableFuture

class ItemTagProvider(output: FabricDataOutput, future: CompletableFuture<HolderLookup.Provider>) : FabricTagProvider.ItemTagProvider(output, future) {
    override fun addTags(lookup: HolderLookup.Provider) {
        getOrCreateTagBuilder(ItemTags.WALLS).let { builder ->
            BuiltInRegistries.ITEM.filterAlbobMod()
                .filterIsInstance<BlockItem>()
                .filter { it.block is WallBlock }
                .forEach(builder::add)
        }

        getOrCreateTagBuilder(ItemTags.STAIRS).let { builder ->
            BuiltInRegistries.ITEM.filterAlbobMod()
                .filterIsInstance<BlockItem>()
                .filter { it.block is StairBlock }
                .forEach(builder::add)
        }

        getOrCreateTagBuilder(ItemTags.SLABS).let { builder ->
            BuiltInRegistries.ITEM.filterAlbobMod()
                .filterIsInstance<BlockItem>()
                .filter { it.block is SlabBlock }
                .forEach(builder::add)
        }
    }
}
