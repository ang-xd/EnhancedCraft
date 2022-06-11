package com.angxd.enhancedcraft.item;

import com.angxd.enhancedcraft.EnhancedCraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModdedItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EnhancedCraft.MOD_ID);

    public static final RegistryObject<Item> CHOCOLATE_BAR = ITEMS.register("chocolate_bar",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModdedFoods.CHOCOLATE_BAR).stacksTo(4)));

    public static final RegistryObject<Item> BURGER = ITEMS.register("burger",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModdedFoods.BURGER)));

    public static final RegistryObject<Item> HOTDOG = ITEMS.register("hotdog",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModdedFoods.HOTDOG)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
