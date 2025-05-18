package org.tingyu.atomicarchitect.common.world.inventory;


import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.tingyu.atomicarchitect.common.util.math.Coordinate2i;
import org.tingyu.atomicarchitect.common.world.item.ElementItem;

/**
 *  This is the class that implement my custom slots.
 * */
public class AlchemyTable extends Slot {

    /**
     *  x: the x value of top-left corner of the slot
     *  y: the y value of top-left corner of the slot
     *  height: the height of slot(direction X)
     *  width: the width of slot(direction Y)
     * */
    public final int x;
    public final int y;

    public final AlchemyContainer container;

    public AlchemyTable(int x, int y, AlchemyContainer container, int slot) {
        super(container, slot, x, y);
        this.x = x;
        this.y = y;
        this.container = container;
    }

    @Override
    public int getMaxStackSize() {
        return 64;
    }

    @Override
    public boolean mayPlace(ItemStack item) {
        return item.getItem() instanceof ElementItem;
    }

    @Override
    public void set(ItemStack itemStack) {
        super.set(itemStack);
    }
}
