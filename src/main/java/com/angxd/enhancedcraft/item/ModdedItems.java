package com.angxd.enhancedcraft.item;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.ModdedTab;
import com.angxd.enhancedcraft.block.ModdedBlocks;
import com.angxd.enhancedcraft.entity.ModdedEntities;
import com.angxd.enhancedcraft.item.custom.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModdedItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EnhancedCraft.MOD_ID);

    public static final RegistryObject<Item> TITANIUM_TRAP_ITEM = ITEMS.register("titanium_trap",
            () -> new TitaniumTrapItem(ModdedBlocks.TITANIUM_TRAP.get(), new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> ENDZITE_SCRAP = ITEMS.register("endzite_scrap",
            () -> new Item(new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> ENDZITE_INGOT = ITEMS.register("endzite_ingot",
            () -> new Item(new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> END_STICK = ITEMS.register("end_stick",
            () -> new Item(new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> ICE_STICK = ITEMS.register("ice_stick",
            () -> new Item(new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> DULL_FIREITE = ITEMS.register("dull_fireite",
            () -> new Item(new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> FIREITE = ITEMS.register("fireite",
            () -> new Item(new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> DULL_FROZENITE = ITEMS.register("dull_frozenite",
            () -> new Item(new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> FROZENITE = ITEMS.register("frozenite",
            () -> new Item(new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));


    public static final RegistryObject<Item> ENDERKING_SPAWN_EGG = ITEMS.register("enderking_spawn_egg",
            () -> new ForgeSpawnEggItem(ModdedEntities.ENDERKING,0x111111, 0xFF0000,
                    new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> IRON_GOLEM_SPAWN_EGG = ITEMS.register("iron_golem_spawn_egg",
            () -> new SpawnEggItem(EntityType.IRON_GOLEM,0xEDEDED, 0x808080,
                    new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> DRIDER_SPAWN_EGG = ITEMS.register("drider_spawn_egg",
            () -> new ForgeSpawnEggItem(ModdedEntities.DRIDER,0xFF0000, 0x111111,
                    new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));


    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(ModdedTiers.TITANIUM, 3, -3.5F, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe",
            () -> new HoeItem(ModdedTiers.TITANIUM, 2, -3F, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModdedTiers.TITANIUM, 3, -3F, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new AxeItem(ModdedTiers.TITANIUM, 2, -2.5F, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new ShovelItem(ModdedTiers.TITANIUM, 1F, -3.5F, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> FROZENITE_SWORD = ITEMS.register("frozenite_sword",
            () -> new FrozeniteSword(ModdedTiers.FROZENITE, 3, -0.5F, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> FROZENITE_HOE = ITEMS.register("frozenite_hoe",
            () -> new HoeItem(ModdedTiers.FROZENITE, 2, -0.5F, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> FROZENITE_PICKAXE = ITEMS.register("frozenite_pickaxe",
            () -> new PickaxeItem(ModdedTiers.FROZENITE, 2, -0.5F, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> FROZENITE_AXE = ITEMS.register("frozenite_axe",
            () -> new AxeItem(ModdedTiers.FROZENITE, 2F, -2.5F, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> FROZENITE_SHOVEL = ITEMS.register("frozenite_shovel",
            () -> new ShovelItem(ModdedTiers.FROZENITE, 2.2F, -0.5F, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));


    public static final RegistryObject<Item> ENDZITE_SWORD = ITEMS.register("endzite_sword",
            () -> new EndziteSword(ModdedTiers.ENDZITE, 5, 3, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> ENDZITE_HOE = ITEMS.register("endzite_hoe",
            () -> new HoeItem(ModdedTiers.ENDZITE, 3, 3, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> ENDZITE_PICKAXE = ITEMS.register("endzite_pickaxe",
            () -> new PickaxeItem(ModdedTiers.ENDZITE, 3, 3, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> ENDZITE_AXE = ITEMS.register("endzite_axe",
            () -> new AxeItem(ModdedTiers.ENDZITE, 3, 3, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> ENDZITE_SHOVEL = ITEMS.register("endzite_shovel",
            () -> new ShovelItem(ModdedTiers.ENDZITE, 3, 3, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> FIREITE_SWORD = ITEMS.register("fireite_sword",
            () -> new FireiteSword(ModdedTiers.FIREITE, 3, -0.5F, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> FIREITE_HOE = ITEMS.register("fireite_hoe",
            () -> new HoeItem(ModdedTiers.FIREITE, 2, -0.5F, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> FIREITE_PICKAXE = ITEMS.register("fireite_pickaxe",
            () -> new PickaxeItem(ModdedTiers.FIREITE, 2, -0.5F, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> FIREITE_AXE = ITEMS.register("fireite_axe",
            () -> new AxeItem(ModdedTiers.FIREITE, 2, -0.5F, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> FIREITE_SHOVEL = ITEMS.register("fireite_shovel",
            () -> new ShovelItem(ModdedTiers.FIREITE, 2, -0.5F, new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static final RegistryObject<Item> URANIUM_BAR = ITEMS.register("uranium_bar",
            () -> new UraniumBarItem(new Item.Properties().tab(ModdedTab.ENHANCEDCRAFT_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
