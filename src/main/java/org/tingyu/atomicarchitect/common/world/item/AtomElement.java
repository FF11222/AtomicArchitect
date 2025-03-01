package org.tingyu.atomicarchitect.common.world.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import java.util.List;

public class AtomElement extends Item {
    private final int atomicNumber;
    private final String name;
    private final String symbol;
    private final List<Isotope> isotopes;
    public AtomElement(AtomElement.Properties properties) {
        super(properties);
        this.atomicNumber = properties.atomicNumber;
        this.name = properties.name;
        this.symbol = properties.symbol;
        this.isotopes = properties.isotopes;
    }

    public static class Properties extends Item.Properties{
        int atomicNumber;
        String name;
        String symbol;
        List<Isotope> isotopes;
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

        public AtomElement.Properties isotopes(List<Isotope> isotopes) {
            this.isotopes = isotopes;
            return this;
        }

        @Override
        public Item.Properties tab(CreativeModeTab tab) {
            return super.tab(CreativeModeTab.TAB_MISC);
        }
    }

    public static class Isotope {
        int massNumber;
        boolean radioactive;
        float abundance;

        public Isotope(int massNumber, boolean radioactive, float abundance) {
            this.massNumber = massNumber;
            this.radioactive = radioactive;
            this.abundance = abundance;
        }
    }
}
