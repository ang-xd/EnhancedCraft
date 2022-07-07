package com.angxd.enhancedcraft.world.feature;

import com.angxd.enhancedcraft.block.ModdedBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ConfiguredFeatures {
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_TITANIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModdedBlocks.TITANIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModdedBlocks.DEEPSLATE_TITANIUM_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_URANIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModdedBlocks.URANIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModdedBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_FROZENITE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModdedBlocks.ICEITE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModdedBlocks.DEEPSLATE_ICEITE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> CHERRY_TREE =
            FeatureUtils.register("cherry", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(Blocks.BIRCH_LOG),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.simple(ModdedBlocks.CHERRY_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<PlacedFeature> CHERRY_CHECKED = PlacementUtils.register("cherry_checked", CHERRY_TREE,
            PlacementUtils.filteredByBlockSurvival(ModdedBlocks.CHERRY_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> CHERRY_SPAWN =
            FeatureUtils.register("cherry_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(CHERRY_CHECKED,
                            0.5F)), CHERRY_CHECKED));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ICE = List.of(
            OreConfiguration.target(OreFeatures.NATURAL_STONE, Blocks.ICE.defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> ENDZITE_ORES = List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), ModdedBlocks.ENDZITE_ORE.get().defaultBlockState()));

    public static final List<OreConfiguration.TargetBlockState> NETHER_FIREITE_ORES = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModdedBlocks.FIREITE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ENDZITE_ORE = FeatureUtils.register("endzite_ore",
            Feature.ORE, new OreConfiguration(ENDZITE_ORES, 3));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> FIREITE_ORE = FeatureUtils.register("fireite_ore",
            Feature.ORE, new OreConfiguration(NETHER_FIREITE_ORES, 6));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ICE_ORE = FeatureUtils.register("ice_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_ICE, 32));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TITANIUM_ORE = FeatureUtils.register("titanium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_TITANIUM_ORES, 11));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> URANIUM_ORE = FeatureUtils.register("uranium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_URANIUM_ORES, 5));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> FROZENITE_ORE = FeatureUtils.register("iceite_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_FROZENITE_ORES, 8));
}
