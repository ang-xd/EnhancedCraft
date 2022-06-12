package com.angxd.enhancedcraft.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModdedTiers {
    public static final ForgeTier TITANIUM = new ForgeTier(3, 1750, 0.1f, 12f, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModdedItems.TITANIUM_INGOT.get()));
}
