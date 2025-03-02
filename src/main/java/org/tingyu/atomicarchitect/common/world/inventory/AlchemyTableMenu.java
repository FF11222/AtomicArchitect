package org.tingyu.atomicarchitect.common.world.inventory;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import org.jetbrains.annotations.Nullable;

public class AlchemyTableMenu extends AbstractContainerMenu {
    public AlchemyTableMenu(int containerId, Inventory inventory) {
        super(ModMenuTypes.ALCHEMY_TABLE, containerId);
    }

    @Override
    public boolean stillValid(Player p_38874_) {
        return false;
    }
}
