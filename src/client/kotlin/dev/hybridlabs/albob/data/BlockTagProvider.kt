package dev.hybridlabs.albob.data

import dev.hybridlabs.albob.ALBOB.filterAlbobMod
import dev.hybridlabs.albob.block.ALBOBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.block.SlabBlock
import net.minecraft.block.StairsBlock
import net.minecraft.block.WallBlock
import net.minecraft.registry.Registries
import net.minecraft.registry.RegistryWrapper.WrapperLookup
import net.minecraft.registry.tag.BlockTags
import java.util.concurrent.CompletableFuture

class BlockTagProvider(output: FabricDataOutput, future: CompletableFuture<WrapperLookup>) : FabricTagProvider.BlockTagProvider(output, future) {
    override fun configure(lookup: WrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).let { builder ->
            builder.add(ALBOBlocks.EXPOSED_BRICK)
            builder.add(ALBOBlocks.EXPOSED_BRICK_WALL)
            builder.add(ALBOBlocks.EXPOSED_BRICK_STAIRS)
            builder.add(ALBOBlocks.EXPOSED_BRICK_SLAB)

            builder.add(ALBOBlocks.WHITE_CONCRETE_WALL)
            builder.add(ALBOBlocks.WHITE_CONCRETE_STAIRS)
            builder.add(ALBOBlocks.WHITE_CONCRETE_SLAB)

            builder.add(ALBOBlocks.ORANGE_CONCRETE_WALL)
            builder.add(ALBOBlocks.ORANGE_CONCRETE_STAIRS)
            builder.add(ALBOBlocks.ORANGE_CONCRETE_SLAB)

            builder.add(ALBOBlocks.MAGENTA_CONCRETE_WALL)
            builder.add(ALBOBlocks.MAGENTA_CONCRETE_STAIRS)
            builder.add(ALBOBlocks.MAGENTA_CONCRETE_SLAB)

            builder.add(ALBOBlocks.LIGHT_BLUE_CONCRETE_WALL)
            builder.add(ALBOBlocks.LIGHT_BLUE_CONCRETE_STAIRS)
            builder.add(ALBOBlocks.LIGHT_BLUE_CONCRETE_SLAB)

            builder.add(ALBOBlocks.YELLOW_CONCRETE_WALL)
            builder.add(ALBOBlocks.YELLOW_CONCRETE_STAIRS)
            builder.add(ALBOBlocks.YELLOW_CONCRETE_SLAB)

            builder.add(ALBOBlocks.LIME_CONCRETE_WALL)
            builder.add(ALBOBlocks.LIME_CONCRETE_STAIRS)
            builder.add(ALBOBlocks.LIME_CONCRETE_SLAB)

            builder.add(ALBOBlocks.PINK_CONCRETE_WALL)
            builder.add(ALBOBlocks.PINK_CONCRETE_STAIRS)
            builder.add(ALBOBlocks.PINK_CONCRETE_SLAB)

            builder.add(ALBOBlocks.GRAY_CONCRETE_WALL)
            builder.add(ALBOBlocks.GRAY_CONCRETE_STAIRS)
            builder.add(ALBOBlocks.GRAY_CONCRETE_SLAB)

            builder.add(ALBOBlocks.LIGHT_GRAY_CONCRETE_WALL)
            builder.add(ALBOBlocks.LIGHT_GRAY_CONCRETE_STAIRS)
            builder.add(ALBOBlocks.LIGHT_GRAY_CONCRETE_SLAB)

            builder.add(ALBOBlocks.CYAN_CONCRETE_WALL)
            builder.add(ALBOBlocks.CYAN_CONCRETE_STAIRS)
            builder.add(ALBOBlocks.CYAN_CONCRETE_SLAB)

            builder.add(ALBOBlocks.PURPLE_CONCRETE_WALL)
            builder.add(ALBOBlocks.PURPLE_CONCRETE_STAIRS)
            builder.add(ALBOBlocks.PURPLE_CONCRETE_SLAB)

            builder.add(ALBOBlocks.BLUE_CONCRETE_WALL)
            builder.add(ALBOBlocks.BLUE_CONCRETE_STAIRS)
            builder.add(ALBOBlocks.BLUE_CONCRETE_SLAB)

            builder.add(ALBOBlocks.BROWN_CONCRETE_WALL)
            builder.add(ALBOBlocks.BROWN_CONCRETE_STAIRS)
            builder.add(ALBOBlocks.BROWN_CONCRETE_SLAB)

            builder.add(ALBOBlocks.GREEN_CONCRETE_WALL)
            builder.add(ALBOBlocks.GREEN_CONCRETE_STAIRS)
            builder.add(ALBOBlocks.GREEN_CONCRETE_SLAB)

            builder.add(ALBOBlocks.RED_CONCRETE_WALL)
            builder.add(ALBOBlocks.RED_CONCRETE_STAIRS)
            builder.add(ALBOBlocks.RED_CONCRETE_SLAB)

            builder.add(ALBOBlocks.BLACK_CONCRETE_WALL)
            builder.add(ALBOBlocks.BLACK_CONCRETE_STAIRS)
            builder.add(ALBOBlocks.BLACK_CONCRETE_SLAB)
        }

        getOrCreateTagBuilder(BlockTags.WALLS).let { builder ->
            Registries.BLOCK.filterAlbobMod().filterIsInstance<WallBlock>().forEach(builder::add)
        }

        getOrCreateTagBuilder(BlockTags.STAIRS).let { builder ->
            Registries.BLOCK.filterAlbobMod().filterIsInstance<StairsBlock>().forEach(builder::add)
        }

        getOrCreateTagBuilder(BlockTags.SLABS).let { builder ->
            Registries.BLOCK.filterAlbobMod().filterIsInstance<SlabBlock>().forEach(builder::add)
        }
    }
}
