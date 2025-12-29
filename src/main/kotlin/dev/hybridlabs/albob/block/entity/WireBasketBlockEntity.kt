package dev.hybridlabs.albob.block.entity

import dev.hybridlabs.albob.ALBOB
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
import net.minecraft.world.inventory.MenuType
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.entity.ContainerOpenersCounter
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity
import net.minecraft.world.level.block.state.BlockState

class WireBasketBlockEntity(pos: BlockPos, state: BlockState) : RandomizableContainerBlockEntity(ALBOBlockEntityTypes.WIRE_BASKET, pos, state) {
    private var inventory: NonNullList<ItemStack> = NonNullList.withSize(containerSize, ItemStack.EMPTY)

    private val openersCounter: ContainerOpenersCounter = object : ContainerOpenersCounter() {
        private val blockEntity: WireBasketBlockEntity = this@WireBasketBlockEntity

        override fun onOpen(level: Level, pos: BlockPos, state: BlockState) {
            blockEntity.playSound(SoundEvents.IRON_TRAPDOOR_OPEN)
        }

        override fun onClose(level: Level, pos: BlockPos, state: BlockState) {
            blockEntity.playSound(SoundEvents.IRON_TRAPDOOR_CLOSE)
        }

        override fun openerCountChanged(level: Level, pos: BlockPos, state: BlockState, previousOpenCount: Int, openCount: Int) {
        }

        override fun isOwnContainer(player: Player): Boolean {
            val menu = player.containerMenu
            return menu is ChestMenu && menu.container == blockEntity
        }
    }

    override fun getItems(): NonNullList<ItemStack> {
        return inventory
    }

    override fun setItems(list: NonNullList<ItemStack>) {
        inventory = list
    }

    override fun getDefaultName(): Component {
        return Component.translatable("${ALBOB.MOD_ID}.container.wire_basket")
    }

    override fun createMenu(containerId: Int, inventory: Inventory): AbstractContainerMenu {
        return ChestMenu(MenuType.GENERIC_9x2, containerId, inventory, this, ROWS)
    }

    override fun getContainerSize(): Int {
        return ROWS * 9
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

    override fun startOpen(player: Player) {
        if (!remove && !player.isSpectator) {
            openersCounter.incrementOpeners(player, level, blockPos, blockState)
        }
    }

    override fun stopOpen(player: Player) {
        if (!remove && !player.isSpectator) {
            openersCounter.decrementOpeners(player, level, blockPos, blockState)
        }
    }

    fun recheckOpen() {
        if (!remove) {
            openersCounter.recheckOpeners(level, blockPos, blockState)
        }
    }

    fun playSound(soundEvent: SoundEvent) {
        level?.let { level ->
            level.playSound(
                null,
                worldPosition.x + 0.5,
                worldPosition.y + 0.5,
                worldPosition.z + 0.5,
                soundEvent,
                SoundSource.BLOCKS,
                0.5f,
                level.random.nextFloat() * 0.1f + 0.9f
            )
        }
    }

    companion object {
        const val ROWS = 2
    }
}
