package org.tingyu.atomicarchitect.common.world.item.crafting;

import com.google.gson.JsonObject;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistryEntry;
import org.jetbrains.annotations.Nullable;
import org.tingyu.atomicarchitect.common.world.inventory.AlchemyContainer;
import org.tingyu.atomicarchitect.common.world.item.ModItems;

public class AlchemyRecipe implements Recipe<AlchemyContainer> {
    private final ResourceLocation id;

    public AlchemyRecipe(ResourceLocation id) {
        this.id = id;
    }

    @Override
    public boolean matches(AlchemyContainer p_44002_, Level p_44003_) {
        return true;//TODO:
    }

    @Override
    public ItemStack assemble(AlchemyContainer p_44001_) {
        return new ItemStack(ModItems.HYDROGEN);
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getResultItem() {
        return null;
    }

    @Override
    public ResourceLocation getId() {
        return this.id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipeSerializer.ALCHEMY_RECIPE;
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipeTypes.ALCHEMIZE;
    }

    public static class Serializer extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<AlchemyRecipe> {

        @Override
        public AlchemyRecipe fromJson(ResourceLocation p_44103_, JsonObject p_44104_) {
            return null;
        }

        @Nullable
        @Override
        public AlchemyRecipe fromNetwork(ResourceLocation p_44105_, FriendlyByteBuf p_44106_) {
            return null;
        }

        @Override
        public void toNetwork(FriendlyByteBuf p_44101_, AlchemyRecipe p_44102_) {

        }
    }
}
