package org.tingyu.atomicarchitect.client.gui.screen.inventory;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;
import org.tingyu.atomicarchitect.AtomicArchitect;
import org.tingyu.atomicarchitect.common.world.inventory.AlchemyTable;
import org.tingyu.atomicarchitect.common.world.inventory.AlchemyTableMenu;
import org.tingyu.atomicarchitect.common.world.item.ElementItem;

public class AlchemyTableScreen extends AbstractContainerScreen<AlchemyTableMenu> {
    private final AlchemyTableMenu menu;
    private static final ResourceLocation ALCHEMY_TABLE_LOCATION = new ResourceLocation(AtomicArchitect.MOD_ID, "textures/gui/container/alchemy_table.png");
    private final int SLOT_HEIGHT = 74;
    private final int SLOT_WIDTH = 55;
    public AlchemyTableScreen(AlchemyTableMenu menu, Inventory inventory, Component title) {
        super(menu, inventory, title);
        this.menu = menu;
    }


    @Override
    public void render(PoseStack poseStack, int mouseX, int mouseY, float delta) {
        this.renderBackground(poseStack);
        super.render(poseStack, mouseX, mouseY, delta);
        this.renderTooltip(poseStack, mouseX, mouseY);

        for (AlchemyTable slot : this.menu.getCraftSlots()) {
            this.blit(poseStack, slot.x, slot.y, 0, 0, 18, 18);
        }
    }

    @Override
    protected void renderBg(PoseStack poseStack, float partialTicks, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, ALCHEMY_TABLE_LOCATION);
        int i = this.leftPos;
        int j = this.topPos;
        this.blit(poseStack, i, j, 0, 0, this.imageWidth, this.imageHeight);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) { // button(0:left click, 1:right click, 2:middle)

        System.out.println("button "+button);//TODO:delete
        ItemStack carried = this.menu.getCarried();
        if (button == 0 && !carried.isEmpty() && carried.getItem() instanceof ElementItem
                && this.isHovering(this.menu.alchemyTable.x, this.menu.alchemyTable.y
                , this.SLOT_HEIGHT, this.SLOT_WIDTH, mouseX, mouseY)) {
            System.out.println("placed");//TODO:delete
            this.menu.addSlotAt((int) mouseX, (int) mouseY, carried);
        }

        return super.mouseClicked(mouseX, mouseY, button);
    }
}
