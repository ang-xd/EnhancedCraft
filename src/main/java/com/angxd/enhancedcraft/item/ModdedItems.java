package com.angxd.enhancedcraft.item;

import com.angxd.enhancedcraft.EnhancedCraft;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModdedItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EnhancedCraft.MOD_ID);

    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(ModdedTiers.TITANIUM, 0, 0, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModdedTiers.TITANIUM, 0, 0, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new AxeItem(ModdedTiers.TITANIUM, 0, 0, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

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
