package dev.hybridlabs.albob.block

import dev.hybridlabs.albob.ALBOB
import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.block.MapColor
import net.minecraft.block.SlabBlock
import net.minecraft.block.StairsBlock
import net.minecraft.block.WallBlock
import net.minecraft.block.enums.Instrument
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import java.util.function.Function
import java.util.function.UnaryOperator

object ALBOBlocks {
    val EXPOSED_BRICK = register("exposed_brick") { it.mapColor(MapColor.RED).instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F) }
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

    private fun <T : Block> register(id: String, block: T): T {
        return Registry.register(Registries.BLOCK, Identifier.of(ALBOB.MOD_ID, id), block)
    }

    /* Basic */

    private fun register(id: String, settings: UnaryOperator<AbstractBlock.Settings>): Block {
        return register(id, settings.apply(AbstractBlock.Settings.create()))
    }

    private fun register(id: String, settings: AbstractBlock.Settings): Block {
        return register(id, Block(settings))
    }

    /* Parented Blocks */

    private fun <T : Block> registerParent(id: String, parent: Block, factory: Function<AbstractBlock.Settings, T>): T {
        return register(id, factory.apply(AbstractBlock.Settings.copy(parent)))
    }

    private fun registerWall(id: String, parent: Block): WallBlock {
        return registerParent(id, parent, ::WallBlock)
    }

    private fun registerStairs(id: String, parent: Block): StairsBlock {
        return registerParent(id, parent) { StairsBlock(parent.defaultState, it) }
    }

    private fun registerSlab(id: String, parent: Block): SlabBlock {
        return registerParent(id, parent, ::SlabBlock)
    }
}
