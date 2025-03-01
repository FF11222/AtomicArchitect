package org.tingyu.atomicarchitect.common.world.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.tingyu.atomicarchitect.AtomicArchitect;
import org.tingyu.atomicarchitect.common.handler.AtomElementBuilder;

public class ModItems {
    //a register that registry all the items in your mod.
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AtomicArchitect.MOD_ID);


    //items in your mod
    public static final RegistryObject<Item> HYDROGEN = ITEMS.register("hydrogen",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //the method that register items
    public static void register(IEventBus eventBus) {
        AtomElementBuilder.build(ITEMS);
        ITEMS.register(eventBus);
    }
}
