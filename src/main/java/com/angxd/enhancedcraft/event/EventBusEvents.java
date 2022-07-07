package com.angxd.enhancedcraft.event;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.entity.ModdedEntities;
import com.angxd.enhancedcraft.entity.custom.DriderEntity;
import com.angxd.enhancedcraft.entity.custom.EnderkingEntity;
import com.angxd.enhancedcraft.recipe.FreezerRecipe;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = EnhancedCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {

    }

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModdedEntities.ENDERKING.get(), EnderkingEntity.setAttributes());
        event.put(ModdedEntities.DRIDER.get(), DriderEntity.setAttributes());
    }

    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, FreezerRecipe.Type.ID, FreezerRecipe.Type.INSTANCE);
    }
}
