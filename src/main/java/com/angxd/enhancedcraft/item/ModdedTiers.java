package com.angxd.enhancedcraft.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModdedTiers {
    public static final ForgeTier TITANIUM = new ForgeTier(3, 1200, 4.5F, 2.7F, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModdedItems.TITANIUM_INGOT.get()));

    public static final ForgeTier FROZENITE = new ForgeTier(3, 800, 9.5F, 3.8F, 10, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModdedItems.FROZENITE.get()));

    public static final ForgeTier ENDZITE = new ForgeTier(4, 4500, 12F, 8F, 20, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModdedItems.ENDZITE_INGOT.get()));

    public static final ForgeTier FIREITE = new ForgeTier(3, 850, 8, 3f, 10, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModdedItems.FIREITE.get()));
}
