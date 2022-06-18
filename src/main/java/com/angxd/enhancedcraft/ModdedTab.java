package com.angxd.enhancedcraft;

import com.angxd.enhancedcraft.item.ModdedItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModdedTab {
    public static final CreativeModeTab ENHANCEDCRAFT_TAB = new CreativeModeTab("enhancedcraft_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModdedItems.TITANIUM_INGOT.get());
        }
    };
}
