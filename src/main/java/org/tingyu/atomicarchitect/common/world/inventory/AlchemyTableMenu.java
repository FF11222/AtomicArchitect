package org.tingyu.atomicarchitect.common.world.inventory;

import net.minecraft.core.NonNullList;
import net.minecraft.network.protocol.game.ClientboundContainerSetSlotPacket;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemFrameItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.tingyu.atomicarchitect.common.world.item.crafting.AlchemyRecipe;
import org.tingyu.atomicarchitect.common.world.item.crafting.ModRecipeTypes;
import org.tingyu.atomicarchitect.common.world.level.block.ModBlocks;

import java.util.Optional;

public class AlchemyTableMenu extends AbstractContainerMenu {
    public final AlchemyContainer container = new AlchemyContainer(this);
    private final ResultContainer resultSlots = new ResultContainer();
    public final AlchemyTable alchemyTable;
    private final ContainerLevelAccess access;
    private final Player player;
    private NonNullList<AlchemyTable> craftSlots = NonNullList.create();
    private int slot = 0;

    public AlchemyTableMenu(int containerId, Inventory inventory) {
        this(containerId, inventory, ContainerLevelAccess.NULL);
    }

    public AlchemyTableMenu(int containerId, Inventory inventory, ContainerLevelAccess access) {
        super(ModMenuTypes.ALCHEMY_TABLE, containerId);
        this.access = access;
        this.player = inventory.player;

        this.alchemyTable = new AlchemyTable(9, 16, this.container, 1);

        //add player's inventory and hotbar slots
        this.addPlayerHotbar(inventory);
        this.addPlayerInventory(inventory);
        this.addSlot(this.alchemyTable);
        this.addSlot(new Slot(new SimpleContainer(), 0, 101, 21));
        this.addSlot(new ModResultSlot(this.resultSlots, 2, 138, 32));
    }

    @Override
    public void slotsChanged(Container container) {
        super.slotsChanged(container);
        this.access.execute((level, blockPos) -> {
            slotChangedCraftingGrid(this, level, this.player, this.container, this.resultSlots);
        });
    }

    protected static void slotChangedCraftingGrid(AbstractContainerMenu menu, Level level, Player player, AlchemyContainer craftSlots, ResultContainer resultSlots) {
        if (level.isClientSide) return;
        ServerPlayer serverplayer = (ServerPlayer)player;
        ItemStack itemstack = ItemStack.EMPTY;
        if (level.getServer() == null) return;
        Optional<AlchemyRecipe> optional = level.getServer().getRecipeManager().getRecipeFor(ModRecipeTypes.ALCHEMIZE, craftSlots, level);
        if (optional.isPresent()) {
            AlchemyRecipe alchemyRecipe = optional.get();
            if (resultSlots.setRecipeUsed(level, serverplayer, alchemyRecipe)) {
                itemstack = alchemyRecipe.assemble(craftSlots);
            }
        }

        resultSlots.setItem(0, itemstack);
        menu.setRemoteSlot(0, itemstack);
        serverplayer.connection.send(new ClientboundContainerSetSlotPacket(menu.containerId, menu.incrementStateId(), 0, itemstack));
    }

    //This method controls the appearance of your gui, if you haven't use stillValid() in AbstractContainerMenu it won't display normally.
    @Override
    public boolean stillValid(@NotNull Player player) {
        return stillValid(access, player, ModBlocks.ALCHEMY_TABLE);
    }

    private void addPlayerInventory(Inventory inventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(inventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory inventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(inventory, i, 8 + i * 18, 142));
        }
    }
    
    public NonNullList<AlchemyTable> getCraftSlots() {
        return this.craftSlots;
    }

    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;

    // THIS YOU HAVE TO DEFINE!
    private static final int TE_INVENTORY_SLOT_COUNT = 3;  // must be the number of slots you have!

    @Override
    public ItemStack quickMoveStack(Player playerIn, int index) {
        Slot sourceSlot = slots.get(index);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;  //EMPTY_ITEM
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        // Check if the slot clicked is one of the vanilla container slots
        if (index < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            // This is a vanilla container slot so merge the stack into the tile inventory
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX
                    + TE_INVENTORY_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;  // EMPTY_ITEM
            }
        } else if (index < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            // This is a TE slot so merge the stack into the players inventory
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex:" + index);
            return ItemStack.EMPTY;
        }
        // If stack size == 0 (the entire stack was moved) set slot contents to null
        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

    public void addSlotAt(int mouseX, int mouseY, ItemStack itemStack) {
        for (Slot slot1 : this.craftSlots) {
            if (slot1.x - mouseX <= 3 && slot1.y - mouseY <= 3) return;
        }

        AlchemyTable slot = new AlchemyTable(mouseX, mouseY, this.container, this.slot++);
        slot.container.setItem(this.slot - 1, itemStack);
        this.craftSlots.add(slot);
        this.addSlot(slot);
    }

    public void removeSlot(Slot slot) {
        this.slots.remove(slot);
    }
}
