package com.angxd.enhancedcraft.recipe;

import com.angxd.enhancedcraft.EnhancedCraft;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModdedRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, EnhancedCraft.MOD_ID);

    public static final RegistryObject<RecipeSerializer<FreezerRecipe>> FREEZER_SERIALIZER =
            SERIALIZERS.register("freeze", () -> FreezerRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
