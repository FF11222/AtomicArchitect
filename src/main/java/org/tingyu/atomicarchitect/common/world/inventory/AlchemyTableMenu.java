package org.tingyu.atomicarchitect.common.world.inventory;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.tingyu.atomicarchitect.common.util.math.Coordinate2i;
import org.tingyu.atomicarchitect.common.world.level.block.ModBlocks;

public class AlchemyTableMenu extends AbstractContainerMenu {
    private final AlchemyContainer container = new AlchemyContainer(this);
    public final AlchemyTable alchemyTable;
    private final ContainerLevelAccess access;

    public AlchemyTableMenu(int containerId, Inventory inventory) {
        this(containerId, inventory, ContainerLevelAccess.NULL);
    }

    public AlchemyTableMenu(int containerId, Inventory inventory, ContainerLevelAccess access) {
        super(ModMenuTypes.ALCHEMY_TABLE, containerId);
        this.access = access;

        this.alchemyTable = new AlchemyTable(9, 10, 73, 64, this.container, 0);
        this.addSlot(this.alchemyTable);

        //add player's inventory and hotbar slots
        this.addPlayerInventory(inventory);
        this.addPlayerHotbar(inventory);
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

    @Override
    public void clicked(int slotIndex, int button, ClickType clickType, Player player) {
        super.clicked(slotIndex, button, clickType, player);
    }

    public void onPlaceAlchemyTable(int mouseX, int mouseY) {
        ItemStack itemStack = this.alchemyTable.getItem(mouseX, mouseY);
        if (itemStack.isEmpty()) {
            this.setCarried(this.alchemyTable.safeInsert(this.getCarried(), new Coordinate2i(mouseX, mouseY)));
        }
    }
}
