package org.tingyu.atomicarchitect.common.world.inventory;

import net.minecraft.core.NonNullList;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class AlchemyContainer implements Container {
    private final AlchemyTableMenu menu;
    public final NonNullList<ItemStack> elements = NonNullList.create();


    public AlchemyContainer(AlchemyTableMenu menu) {
        this.menu = menu;
    }

    @Override
    public int getContainerSize() {
        return this.elements.size();
    }

    @Override
    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    @Override
    public ItemStack getItem(int slot) {
        if (slot >= this.elements.size()) return ItemStack.EMPTY;
        return this.elements.get(slot);
    }

    @Override
    public ItemStack removeItem(int amount, int decrement) {
        ItemStack itemstack = ContainerHelper.removeItem(this.elements, amount, decrement);
        if (!itemstack.isEmpty()) {
            this.setChanged();
        }

        return itemstack;
    }

    @Override
    public ItemStack removeItemNoUpdate(int p_18951_) {
        return ItemStack.EMPTY;
    }

    @Override
    public void setItem(int slot, ItemStack itemStack) {
        if (this.elements.size() <= slot) this.elements.add(itemStack);
        else this.elements.set(slot, itemStack);
        if (itemStack.getCount() > this.getMaxStackSize()) {
            itemStack.setCount(this.getMaxStackSize());
        }

        this.setChanged();
    }

    @Override
    public void setChanged() {

    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    @Override
    public void clearContent() {
        this.elements.clear();
    }
}
