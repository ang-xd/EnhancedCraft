package com.angxd.enhancedcraft.biome;

import com.angxd.enhancedcraft.EnhancedCraft;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModdedBiomes {
    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event) {
        IForgeRegistry<Biome> reg = event.getRegistry();
        reg.register(ModdedOverworldBiomes.cherry_blossom_forest().setRegistryName(ModdedBiomes.CHERRY_BLOSSOM_FOREST.location()));
    }

    public static final ResourceKey<Biome> CHERRY_BLOSSOM_FOREST = register("cherry_blossom_forest");

    private static ResourceKey<Biome> register(String name)
    {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(EnhancedCraft   .MOD_ID, name));
    }
}
