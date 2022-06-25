package com.angxd.enhancedcraft.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class PlacedFeatures {
    public static final Holder<PlacedFeature> TITANIUM_ORE_PLACED = PlacementUtils.register("titanium_ore_placed",
                ConfiguredFeatures.TITANIUM_ORE, OrePlacement.commonOrePlacement(16, HeightRangePlacement.triangle(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(80))));

    public static final Holder<PlacedFeature> CHERRY_PLACED = PlacementUtils.register("cherry_placed",
            ConfiguredFeatures.CHERRY_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));

    public static final Holder<PlacedFeature> ORE_ICE_UPPER_PLACED = PlacementUtils.register("ore_ice_upper_placed",
            ConfiguredFeatures.ICE_ORE, OrePlacement.rareOrePlacement(6,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(64), VerticalAnchor.absolute(128))));
    public static final Holder<PlacedFeature> ORE_ICE_LOWER_PLACED = PlacementUtils.register("ore_ice_lower_placed",
            ConfiguredFeatures.ICE_ORE, OrePlacement.commonOrePlacement(2,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));

    public static final Holder<PlacedFeature> ENDZITE_ORE_PLACED = PlacementUtils.register("endzite_ore_placed",
            ConfiguredFeatures.ENDZITE_ORE, OrePlacement.commonOrePlacement(30, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(50))));

    public static final Holder<PlacedFeature> FIREITE_ORE_PLACED = PlacementUtils.register("fireite_ore_placed",
            ConfiguredFeatures.FIREITE_ORE, OrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
}
