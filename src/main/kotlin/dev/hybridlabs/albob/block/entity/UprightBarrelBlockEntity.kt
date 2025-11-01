package dev.hybridlabs.albob.block.entity

import dev.hybridlabs.albob.block.UprightBarrelBlock
import net.minecraft.core.BlockPos
import net.minecraft.core.NonNullList
import net.minecraft.nbt.CompoundTag
import net.minecraft.network.chat.Component
import net.minecraft.sounds.SoundEvent
import net.minecraft.sounds.SoundEvents
import net.minecraft.sounds.SoundSource
import net.minecraft.world.ContainerHelper
import net.minecraft.world.entity.player.Inventory
import net.minecraft.world.entity.player.Player
import net.minecraft.world.inventory.AbstractContainerMenu
import net.minecraft.world.inventory.ChestMenu
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.entity.ContainerOpenersCounter
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.phys.Vec3

class UprightBarrelBlockEntity(pos: BlockPos, state: BlockState) : RandomizableContainerBlockEntity(ALBOBlockEntityTypes.UPRIGHT_BARREL, pos, state) {
    private var inventory: NonNullList<ItemStack> = NonNullList.withSize(containerSize, ItemStack.EMPTY)

    val openersCounter = object : ContainerOpenersCounter() {
        override fun onOpen(level: Level, pos: BlockPos, state: BlockState) {
            playSound(SoundEvents.BARREL_CLOSE)
            updateBlockState(state, true)
        }

        override fun onClose(level: Level, pos: BlockPos, state: BlockState) {
            playSound(SoundEvents.BARREL_CLOSE)
            updateBlockState(state, false)
        }

        override fun openerCountChanged(level: Level, pos: BlockPos, state: BlockState, i: Int, j: Int) {
        }

        override fun isOwnContainer(player: Player): Boolean {
            val menu = player.containerMenu
            return if (menu is ChestMenu) {
                val container = menu.container
                container == this@UprightBarrelBlockEntity
            } else {
                false
            }
        }
    }

    override fun saveAdditional(tag: CompoundTag) {
        super.saveAdditional(tag)

        if (!trySaveLootTable(tag)) {
            ContainerHelper.saveAllItems(tag, inventory)
        }
    }

    override fun load(tag: CompoundTag) {
        super.load(tag)

        inventory = NonNullList.withSize(containerSize, ItemStack.EMPTY)
        if (!tryLoadLootTable(tag)) {
            ContainerHelper.loadAllItems(tag, inventory)
        }
    }

    override fun getContainerSize(): Int {
        return 27
    }

    override fun getItems(): NonNullList<ItemStack> {
        return inventory
    }

    override fun setItems(items: NonNullList<ItemStack>) {
        inventory = items
    }

    override fun getDefaultName(): Component {
        return Component.translatable("container.barrel")
    }

    override fun createMenu(id: Int, inventory: Inventory): AbstractContainerMenu {
        return ChestMenu.threeRows(id, inventory, this)
    }

    override fun startOpen(player: Player) {
        level?.let { level ->
            if (!remove && !player.isSpectator) {
                openersCounter.incrementOpeners(player, level, blockPos, blockState)
            }
        }
    }

    override fun stopOpen(player: Player) {
        level?.let { level ->
            if (!remove && !player.isSpectator) {
                openersCounter.decrementOpeners(player, level, blockPos, blockState)
            }
        }
    }

    fun recheckOpen() {
        level?.let { level ->
            if (!remove) {
                openersCounter.recheckOpeners(level, blockPos, blockState)
            }
        }
    }

    fun updateBlockState(state: BlockState, open: Boolean) {
        level?.setBlock(blockPos, state.setValue(UprightBarrelBlock.OPEN, open), Block.UPDATE_NEIGHBORS.or(Block.UPDATE_CLIENTS))
    }

    fun playSound(soundEvent: SoundEvent) {
        level?.let { level ->
            val pos = Vec3.atCenterOf(blockPos).add(0.0, 0.5, 0.0)
            level.playSound(null, pos.x, pos.y, pos.z, soundEvent, SoundSource.BLOCKS, 0.5f, level.random.nextFloat() * 0.1f + 0.9f)
        }
    }
}
