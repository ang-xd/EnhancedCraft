package com.angxd.enhancedcraft.biome;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;

public class ModdedRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.ConditionSource ABOVE_0 = SurfaceRules.yBlockCheck(VerticalAnchor.absolute(0), 5);
    private static final SurfaceRules.ConditionSource AT_OR_ABOVE_WATER = SurfaceRules.waterBlockCheck(-1, 0);
    private static final SurfaceRules.RuleSource IMPURE_CAVES_SURFACE = SurfaceRules.state(Blocks.NETHERRACK.defaultBlockState());
    private static final SurfaceRules.RuleSource IMPURE_CAVES = SurfaceRules.ifTrue(SurfaceRules.isBiome(ModdedBiomes.IMPURE_CAVES), IMPURE_CAVES_SURFACE);

    public static SurfaceRules.RuleSource makeRules()
    {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return SurfaceRules.sequence(

                // Default to a grass and dirt surface
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModdedBiomes.IMPURE_CAVES), IMPURE_CAVES)
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block)
    {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
