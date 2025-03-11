package org.tingyu.atomicarchitect;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.tingyu.atomicarchitect.client.gui.screen.ModMenuScreens;

@Mod(AtomicArchitect.MOD_ID)
public class AtomicArchitect {
    public static final String MOD_ID = "atomic_architect";

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class LifecycleHandler {
        @SubscribeEvent
        public static void onCommonSetup(final FMLCommonSetupEvent event) {
            event.enqueueWork(() -> {

            });
        }

        @SuppressWarnings({"Convert2MethodRef", "CodeBlock2Expr"})
        @OnlyIn(Dist.CLIENT)
        @SubscribeEvent
        public static void onClientSetup(final FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                ModMenuScreens.registerScreens();
            });
        }
    }
}
