package com.angxd.enhancedcraft.item;

import net.minecraft.world.food.FoodProperties;

public class ModdedFoods {
    public static final FoodProperties CHOCOLATE_BAR = (new FoodProperties.Builder()).fast().nutrition(2).saturationMod(0.2F).build();
    public static final FoodProperties BURGER = (new FoodProperties.Builder()).nutrition(7).saturationMod(0.4F).meat().build();
    public static final FoodProperties HOTDOG = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.3F).meat().build();
}
