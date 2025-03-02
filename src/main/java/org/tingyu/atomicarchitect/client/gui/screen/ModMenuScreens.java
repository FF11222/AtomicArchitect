package org.tingyu.atomicarchitect.client.gui.screen;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.tingyu.atomicarchitect.client.gui.screen.inventory.AlchemyTableScreen;
import org.tingyu.atomicarchitect.common.world.inventory.ModMenuTypes;

@OnlyIn(Dist.CLIENT)
public class ModMenuScreens {
    public static void registerScreens() {
        MenuScreens.register(ModMenuTypes.ALCHEMY_TABLE, AlchemyTableScreen::new);
    }
}
