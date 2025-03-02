package org.tingyu.atomicarchitect.common.world.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import java.util.List;

public class AtomElement extends Item {
    private final int atomicNumber;
    private final String name;
    private final String symbol;
    public AtomElement(AtomElement.Properties properties) {
        super(properties);
        this.atomicNumber = properties.atomicNumber;
        this.name = properties.name;
        this.symbol = properties.symbol;
    }

    public static class Properties extends Item.Properties{
        public Properties() {
            this.tab(null);
        }

        int atomicNumber;
        String name;
        String symbol;
        public AtomElement.Properties atomicNumber(int atomicNumber) {
            this.atomicNumber = atomicNumber;
            return this;
        }

        public AtomElement.Properties name(String name) {
            this.name = name;
            return this;
        }

        public AtomElement.Properties symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        @Override
        public Item.Properties tab(CreativeModeTab tab) {
            return super.tab(ModCreativeModeTab.TAB_ATOMIC_ARCHITECT);
        }
    }
}
