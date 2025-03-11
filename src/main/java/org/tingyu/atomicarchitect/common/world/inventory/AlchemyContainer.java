package org.tingyu.atomicarchitect.common.world.inventory;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.tingyu.atomicarchitect.common.util.math.Coordinate2i;

import java.util.HashMap;
import java.util.Map;

public class AlchemyContainer implements Container {
    private final AlchemyTableMenu menu;
    public final Map<Coordinate2i, ItemStack> elements = new HashMap<>();


    public AlchemyContainer(AlchemyTableMenu menu) {
        this.menu = menu;
    }

    @Override
    public int getContainerSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public ItemStack getItem(int p_18941_) {
        //TODO:
        return ItemStack.EMPTY;
    }

    @Override
    public ItemStack removeItem(int p_18942_, int p_18943_) {
        return null;
    }

    @Override
    public ItemStack removeItemNoUpdate(int p_18951_) {
        return null;
    }

    @Override
    public void setItem(int p_18944_, ItemStack p_18945_) {

    }

    @Override
    public void setChanged() {

    }

    @Override
    public boolean stillValid(Player p_18946_) {
        return true;
    }

    @Override
    public void clearContent() {

    }
}
