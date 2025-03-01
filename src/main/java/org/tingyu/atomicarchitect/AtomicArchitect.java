package org.tingyu.atomicarchitect;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.server.packs.resources.ReloadableResourceManager;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.tingyu.atomicarchitect.common.handler.AtomElementBuilder;
import org.tingyu.atomicarchitect.common.world.item.ModItems;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AtomicArchitect.MOD_ID)
public class AtomicArchitect {
    // Directly reference a slf4j logger
    public static final String MOD_ID = "atomic_architect";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AtomicArchitect() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(eventBus);
        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

        event.enqueueWork(() -> {
            ResourceManager resourceManager = Minecraft.getInstance().getResourceManager();
            if (resourceManager instanceof ReloadableResourceManager) {
                ((ReloadableResourceManager) resourceManager).registerReloadListener(new AtomElementBuilder());
                LOGGER.info("Successfully registered ElementBuildHandler!");
            } else {
                LOGGER.warn("Unable to register ElementBuildHandler, ResourceManager is not reloadable!");
            }
        });
    }
}
