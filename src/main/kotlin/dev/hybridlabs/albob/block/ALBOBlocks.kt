package dev.hybridlabs.albob.block

import dev.hybridlabs.albob.ALBOB
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.SlabBlock
import net.minecraft.world.level.block.SoundType
import net.minecraft.world.level.block.StairBlock
import net.minecraft.world.level.block.WallBlock
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument
import net.minecraft.world.level.material.MapColor
import java.util.function.Function
import java.util.function.UnaryOperator

object ALBOBlocks {
    val EXPOSED_BRICK = register("exposed_brick") { it.mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F) }
    val EXPOSED_BRICK_WALL = registerWall("exposed_brick_wall", EXPOSED_BRICK)
    val EXPOSED_BRICK_STAIRS = registerStairs("exposed_brick_stairs", EXPOSED_BRICK)
    val EXPOSED_BRICK_SLAB = registerSlab("exposed_brick_slab", EXPOSED_BRICK)

    val WHITE_CONCRETE_WALL = registerWall("white_concrete_wall", Blocks.WHITE_CONCRETE)
    val WHITE_CONCRETE_STAIRS = registerStairs("white_concrete_stairs", Blocks.WHITE_CONCRETE)
    val WHITE_CONCRETE_SLAB = registerSlab("white_concrete_slab", Blocks.WHITE_CONCRETE)

    val ORANGE_CONCRETE_WALL = registerWall("orange_concrete_wall", Blocks.ORANGE_CONCRETE)
    val ORANGE_CONCRETE_STAIRS = registerStairs("orange_concrete_stairs", Blocks.ORANGE_CONCRETE)
    val ORANGE_CONCRETE_SLAB = registerSlab("orange_concrete_slab", Blocks.ORANGE_CONCRETE)

    val MAGENTA_CONCRETE_WALL = registerWall("magenta_concrete_wall", Blocks.MAGENTA_CONCRETE)
    val MAGENTA_CONCRETE_STAIRS = registerStairs("magenta_concrete_stairs", Blocks.MAGENTA_CONCRETE)
    val MAGENTA_CONCRETE_SLAB = registerSlab("magenta_concrete_slab", Blocks.MAGENTA_CONCRETE)

    val LIGHT_BLUE_CONCRETE_WALL = registerWall("light_blue_concrete_wall", Blocks.LIGHT_BLUE_CONCRETE)
    val LIGHT_BLUE_CONCRETE_STAIRS = registerStairs("light_blue_concrete_stairs", Blocks.LIGHT_BLUE_CONCRETE)
    val LIGHT_BLUE_CONCRETE_SLAB = registerSlab("light_blue_concrete_slab", Blocks.LIGHT_BLUE_CONCRETE)

    val YELLOW_CONCRETE_WALL = registerWall("yellow_concrete_wall", Blocks.YELLOW_CONCRETE)
    val YELLOW_CONCRETE_STAIRS = registerStairs("yellow_concrete_stairs", Blocks.YELLOW_CONCRETE)
    val YELLOW_CONCRETE_SLAB = registerSlab("yellow_concrete_slab", Blocks.YELLOW_CONCRETE)

    val LIME_CONCRETE_WALL = registerWall("lime_concrete_wall", Blocks.LIME_CONCRETE)
    val LIME_CONCRETE_STAIRS = registerStairs("lime_concrete_stairs", Blocks.LIME_CONCRETE)
    val LIME_CONCRETE_SLAB = registerSlab("lime_concrete_slab", Blocks.LIME_CONCRETE)

    val PINK_CONCRETE_WALL = registerWall("pink_concrete_wall", Blocks.PINK_CONCRETE)
    val PINK_CONCRETE_STAIRS = registerStairs("pink_concrete_stairs", Blocks.PINK_CONCRETE)
    val PINK_CONCRETE_SLAB = registerSlab("pink_concrete_slab", Blocks.PINK_CONCRETE)

    val GRAY_CONCRETE_WALL = registerWall("gray_concrete_wall", Blocks.GRAY_CONCRETE)
    val GRAY_CONCRETE_STAIRS = registerStairs("gray_concrete_stairs", Blocks.GRAY_CONCRETE)
    val GRAY_CONCRETE_SLAB = registerSlab("gray_concrete_slab", Blocks.GRAY_CONCRETE)

    val LIGHT_GRAY_CONCRETE_WALL = registerWall("light_gray_concrete_wall", Blocks.LIGHT_GRAY_CONCRETE)
    val LIGHT_GRAY_CONCRETE_STAIRS = registerStairs("light_gray_concrete_stairs", Blocks.LIGHT_GRAY_CONCRETE)
    val LIGHT_GRAY_CONCRETE_SLAB = registerSlab("light_gray_concrete_slab", Blocks.LIGHT_GRAY_CONCRETE)

    val CYAN_CONCRETE_WALL = registerWall("cyan_concrete_wall", Blocks.CYAN_CONCRETE)
    val CYAN_CONCRETE_STAIRS = registerStairs("cyan_concrete_stairs", Blocks.CYAN_CONCRETE)
    val CYAN_CONCRETE_SLAB = registerSlab("cyan_concrete_slab", Blocks.CYAN_CONCRETE)

    val PURPLE_CONCRETE_WALL = registerWall("purple_concrete_wall", Blocks.PURPLE_CONCRETE)
    val PURPLE_CONCRETE_STAIRS = registerStairs("purple_concrete_stairs", Blocks.PURPLE_CONCRETE)
    val PURPLE_CONCRETE_SLAB = registerSlab("purple_concrete_slab", Blocks.PURPLE_CONCRETE)

    val BLUE_CONCRETE_WALL = registerWall("blue_concrete_wall", Blocks.BLUE_CONCRETE)
    val BLUE_CONCRETE_STAIRS = registerStairs("blue_concrete_stairs", Blocks.BLUE_CONCRETE)
    val BLUE_CONCRETE_SLAB = registerSlab("blue_concrete_slab", Blocks.BLUE_CONCRETE)

    val BROWN_CONCRETE_WALL = registerWall("brown_concrete_wall", Blocks.BROWN_CONCRETE)
    val BROWN_CONCRETE_STAIRS = registerStairs("brown_concrete_stairs", Blocks.BROWN_CONCRETE)
    val BROWN_CONCRETE_SLAB = registerSlab("brown_concrete_slab", Blocks.BROWN_CONCRETE)

    val GREEN_CONCRETE_WALL = registerWall("green_concrete_wall", Blocks.GREEN_CONCRETE)
    val GREEN_CONCRETE_STAIRS = registerStairs("green_concrete_stairs", Blocks.GREEN_CONCRETE)
    val GREEN_CONCRETE_SLAB = registerSlab("green_concrete_slab", Blocks.GREEN_CONCRETE)

    val RED_CONCRETE_WALL = registerWall("red_concrete_wall", Blocks.RED_CONCRETE)
    val RED_CONCRETE_STAIRS = registerStairs("red_concrete_stairs", Blocks.RED_CONCRETE)
    val RED_CONCRETE_SLAB = registerSlab("red_concrete_slab", Blocks.RED_CONCRETE)

    val BLACK_CONCRETE_WALL = registerWall("black_concrete_wall", Blocks.BLACK_CONCRETE)
    val BLACK_CONCRETE_STAIRS = registerStairs("black_concrete_stairs", Blocks.BLACK_CONCRETE)
    val BLACK_CONCRETE_SLAB = registerSlab("black_concrete_slab", Blocks.BLACK_CONCRETE)

    val OIL_DRUM = register("oil_drum", ::MetalDrumBlock) {
        it.mapColor(MapColor.METAL)
            .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
            .requiresCorrectToolForDrops()
            .strength(5.0F, 6.0F)
            .sound(SoundType.METAL)
            .noOcclusion()
    }

    val WHITE_OIL_DRUM = registerMetalDrum("white_oil_drum", OIL_DRUM, MapColor.TERRACOTTA_WHITE)
    val ORANGE_OIL_DRUM = registerMetalDrum("orange_oil_drum", OIL_DRUM, MapColor.COLOR_ORANGE)
    val MAGENTA_OIL_DRUM = registerMetalDrum("magenta_oil_drum", OIL_DRUM, MapColor.COLOR_MAGENTA)
    val LIGHT_BLUE_OIL_DRUM = registerMetalDrum("light_blue_oil_drum", OIL_DRUM, MapColor.COLOR_LIGHT_BLUE)
    val YELLOW_OIL_DRUM = registerMetalDrum("yellow_oil_drum", OIL_DRUM, MapColor.COLOR_YELLOW)
    val LIME_OIL_DRUM = registerMetalDrum("lime_oil_drum", OIL_DRUM, MapColor.COLOR_LIGHT_GREEN)
    val PINK_OIL_DRUM = registerMetalDrum("pink_oil_drum", OIL_DRUM, MapColor.COLOR_PINK)
    val GRAY_OIL_DRUM = registerMetalDrum("gray_oil_drum", OIL_DRUM, MapColor.COLOR_GRAY)
    val LIGHT_GRAY_OIL_DRUM = registerMetalDrum("light_gray_oil_drum", OIL_DRUM, MapColor.COLOR_LIGHT_GRAY)
    val CYAN_OIL_DRUM = registerMetalDrum("cyan_oil_drum", OIL_DRUM, MapColor.COLOR_CYAN)
    val PURPLE_OIL_DRUM = registerMetalDrum("purple_oil_drum", OIL_DRUM, MapColor.COLOR_PURPLE)
    val BLUE_OIL_DRUM = registerMetalDrum("blue_oil_drum", OIL_DRUM, MapColor.COLOR_BLUE)
    val BROWN_OIL_DRUM = registerMetalDrum("brown_oil_drum", OIL_DRUM, MapColor.COLOR_BROWN)
    val GREEN_OIL_DRUM = registerMetalDrum("green_oil_drum", OIL_DRUM, MapColor.COLOR_GREEN)
    val RED_OIL_DRUM = registerMetalDrum("red_oil_drum", OIL_DRUM, MapColor.COLOR_RED)
    val BLACK_OIL_DRUM = registerMetalDrum("black_oil_drum", OIL_DRUM, MapColor.COLOR_BLACK)

    val OAK_PALLET = registerMetalDrum("oak_pallet", OIL_DRUM, MapColor.COLOR_BLACK)

    private fun <T : Block> register(id: String, block: T): T {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation(ALBOB.MOD_ID, id), block)
    }

    /* Basic */

    private fun register(id: String, properties: UnaryOperator<BlockBehaviour.Properties>): Block {
        return register(id, properties.apply(BlockBehaviour.Properties.of()))
    }

    private fun register(id: String, properties: BlockBehaviour.Properties): Block {
        return register(id, Block(properties))
    }

    private fun <T : Block> register(id: String, block: Function<BlockBehaviour.Properties, T>, properties: UnaryOperator<BlockBehaviour.Properties>): T {
        return register(id, block.apply(properties.apply(BlockBehaviour.Properties.of())))
    }

    /* Parented Blocks */

    private fun <T : Block> registerParent(id: String, parent: Block, factory: Function<BlockBehaviour.Properties, T>): T {
        return register(id, factory.apply(BlockBehaviour.Properties.copy(parent)))
    }

    private fun <T : Block> registerParent(id: String, parent: Block, factory: Function<BlockBehaviour.Properties, T>, properties: UnaryOperator<BlockBehaviour.Properties>): T {
        return registerParent(id, parent) { factory.apply(properties.apply(it)) }
    }

    private fun registerWall(id: String, parent: Block): WallBlock {
        return registerParent(id, parent, ::WallBlock)
    }

    private fun registerStairs(id: String, parent: Block): StairBlock {
        return registerParent(id, parent) { StairBlock(parent.defaultBlockState(), it) }
    }

    private fun registerSlab(id: String, parent: Block): SlabBlock {
        return registerParent(id, parent, ::SlabBlock)
    }

    private fun registerMetalDrum(id: String, parent: Block, color: MapColor): MetalDrumBlock {
        return registerParent(id, parent, ::MetalDrumBlock) { it.mapColor(color).noOcclusion() }
    }

    private fun registerPallet(id: String, parent: Block, color: MapColor): PalletBlock {
        return registerParent(id, parent, ::PalletBlock) { it.mapColor(color).noOcclusion() }
    }
}
