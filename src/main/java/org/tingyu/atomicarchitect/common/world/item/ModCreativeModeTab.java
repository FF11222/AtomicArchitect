package org.tingyu.atomicarchitect.common.world.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModCreativeModeTab {
    public static final CreativeModeTab TAB_ATOMIC_ARCHITECT = new CreativeModeTab("AtomicArchitect") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.DIAMOND_SWORD);
        }
    };
}
