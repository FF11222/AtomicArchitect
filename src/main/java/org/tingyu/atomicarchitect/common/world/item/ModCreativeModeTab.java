package org.tingyu.atomicarchitect.common.world.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {
    public static final CreativeModeTab TAB_ATOMIC_ARCHITECT = new CreativeModeTab("AtomicArchitect") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(Items.DIAMOND_SWORD);
        }
    };
}
