package org.tingyu.atomicarchitect.common.world.item;

import net.minecraft.world.item.Item;

public class ElementItem extends Item {
    private final int atomicNumber;
    private final String name;
    private final String symbol;

    public ElementItem(ElementItem.Properties properties) {
        super(properties);
        this.atomicNumber = properties.atomicNumber;
        this.name = properties.name;
        this.symbol = properties.symbol;
    }

    public static class Properties extends Item.Properties {
        int atomicNumber;
        String name;
        String symbol;

        public Properties() {
            super.tab(ModCreativeModeTab.TAB_ATOMIC_ARCHITECT);
        }

        public ElementItem.Properties atomicNumber(int atomicNumber) {
            this.atomicNumber = atomicNumber;
            return this;
        }

        public ElementItem.Properties name(String name) {
            this.name = name;
            return this;
        }

        public ElementItem.Properties symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }
    }
}
