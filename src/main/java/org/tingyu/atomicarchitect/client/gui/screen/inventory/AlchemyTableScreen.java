package org.tingyu.atomicarchitect.client.gui.screen.inventory;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import org.tingyu.atomicarchitect.common.world.inventory.AlchemyTableMenu;

public class AlchemyTableScreen extends AbstractContainerScreen<AlchemyTableMenu> {
    public AlchemyTableScreen(AlchemyTableMenu menu, Inventory inventory, Component title) {
        super(menu, inventory, title);
    }

    @Override
    protected void renderBg(PoseStack poseStack, float partialTicks, int mouseX, int mouseY) {

    }
}
