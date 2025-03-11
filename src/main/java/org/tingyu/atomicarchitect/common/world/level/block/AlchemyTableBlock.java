package org.tingyu.atomicarchitect.common.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import org.tingyu.atomicarchitect.common.world.inventory.AlchemyTableMenu;

public class AlchemyTableBlock extends CraftingTableBlock {
    private static final Component CONTAINER_TITLE = new TextComponent("AlchemyTable");

    public AlchemyTableBlock() {
        super(Properties.of(Material.METAL));
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        if (!world.isClientSide) {
            MenuProvider containerProvider = this.getMenuProvider(state, world, pos);
            if (containerProvider != null) {
                player.openMenu(containerProvider);
                return InteractionResult.CONSUME;
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    public MenuProvider getMenuProvider(BlockState state, Level world, BlockPos pos) {
        return new SimpleMenuProvider((containerId, inventory, player) ->
                new AlchemyTableMenu(containerId, inventory), CONTAINER_TITLE);
    }
}