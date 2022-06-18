package com.angxd.enhancedcraft.world.gen;

import com.angxd.enhancedcraft.world.feature.PlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class OreGen {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(PlacedFeatures.TITANIUM_ORE_PLACED);

        if(event.getCategory() == Biome.BiomeCategory.THEEND) {
            base.add(PlacedFeatures.ENDZITE_ORE_PLACED);
        }
    }
}
