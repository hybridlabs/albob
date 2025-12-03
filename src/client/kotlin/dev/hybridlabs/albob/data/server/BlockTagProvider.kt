package dev.hybridlabs.albob.data.server

import dev.hybridlabs.albob.ALBOB.filterAlbobMod
import dev.hybridlabs.albob.block.ALBOBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.tags.BlockTags
import net.minecraft.world.level.block.SlabBlock
import net.minecraft.world.level.block.StairBlock
import net.minecraft.world.level.block.WallBlock
import java.util.concurrent.CompletableFuture

class BlockTagProvider(output: FabricDataOutput, future: CompletableFuture<HolderLookup.Provider>) : FabricTagProvider.BlockTagProvider(output, future) {
    override fun addTags(lookup: HolderLookup.Provider) {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE).let { builder ->
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

            builder.add(ALBOBlocks.OIL_DRUM)
            builder.add(ALBOBlocks.WHITE_OIL_DRUM)
            builder.add(ALBOBlocks.ORANGE_OIL_DRUM)
            builder.add(ALBOBlocks.MAGENTA_OIL_DRUM)
            builder.add(ALBOBlocks.LIGHT_BLUE_OIL_DRUM)
            builder.add(ALBOBlocks.YELLOW_OIL_DRUM)
            builder.add(ALBOBlocks.LIME_OIL_DRUM)
            builder.add(ALBOBlocks.PINK_OIL_DRUM)
            builder.add(ALBOBlocks.GRAY_OIL_DRUM)
            builder.add(ALBOBlocks.LIGHT_GRAY_OIL_DRUM)
            builder.add(ALBOBlocks.CYAN_OIL_DRUM)
            builder.add(ALBOBlocks.PURPLE_OIL_DRUM)
            builder.add(ALBOBlocks.BLUE_OIL_DRUM)
            builder.add(ALBOBlocks.BROWN_OIL_DRUM)
            builder.add(ALBOBlocks.GREEN_OIL_DRUM)
            builder.add(ALBOBlocks.RED_OIL_DRUM)
            builder.add(ALBOBlocks.BLACK_OIL_DRUM)

            builder.add(ALBOBlocks.PENDANT_LAMP)
        }

        getOrCreateTagBuilder(BlockTags.WALLS).let { builder ->
            BuiltInRegistries.BLOCK.filterAlbobMod().filterIsInstance<WallBlock>().forEach(builder::add)
        }

        getOrCreateTagBuilder(BlockTags.STAIRS).let { builder ->
            BuiltInRegistries.BLOCK.filterAlbobMod().filterIsInstance<StairBlock>().forEach(builder::add)
        }

        getOrCreateTagBuilder(BlockTags.SLABS).let { builder ->
            BuiltInRegistries.BLOCK.filterAlbobMod().filterIsInstance<SlabBlock>().forEach(builder::add)
        }
    }
}
