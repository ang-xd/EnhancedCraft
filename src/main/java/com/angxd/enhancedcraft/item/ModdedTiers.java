package com.angxd.enhancedcraft.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModdedTiers {
    public static final ForgeTier TITANIUM = new ForgeTier(3, 2000, 7F, 4F, 10, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModdedItems.TITANIUM_INGOT.get()));

    public static final ForgeTier ENDZITE = new ForgeTier(4, 4500, 12F, 8F, 20, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModdedItems.ENDZITE_CRYSTAL.get()));

    public static final ForgeTier FIREITE = new ForgeTier(3, 1200, 6F, 3f, 12, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModdedItems.FIREITE.get()));
}
