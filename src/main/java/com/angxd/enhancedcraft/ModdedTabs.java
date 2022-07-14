package com.angxd.enhancedcraft;

import com.angxd.enhancedcraft.item.ModdedItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModdedTabs {
    public static final CreativeModeTab ENHANCEDCRAFT_MISC_TAB = new CreativeModeTab("enhancedcraft_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModdedItems.END_STICK.get());
        }
    };

    public static final CreativeModeTab ENHANCEDCRAFT_TOOLS_TAB = new CreativeModeTab("enhancedcraft_tools_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModdedItems.ENDZITE_SWORD.get());
        }
    };

    public static final CreativeModeTab ENHANCEDCRAFT_ORES_TAB = new CreativeModeTab("enhancedcraft_ores_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModdedItems.TITANIUM_INGOT.get());
        }
    };
}
