package com.angxd.enhancedcraft.item;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.ModdedTabs;
import com.angxd.enhancedcraft.block.ModdedBlocks;
import com.angxd.enhancedcraft.item.custom.EpicItem;
import com.angxd.enhancedcraft.entity.ModdedEntities;
import com.angxd.enhancedcraft.item.custom.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
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
            () -> new TitaniumTrapItem(ModdedBlocks.TITANIUM_TRAP.get(), new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_MISC_TAB)));

    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_ORES_TAB)));

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_ORES_TAB)));

    public static final RegistryObject<Item> ENDZITE_SCRAP = ITEMS.register("endzite_scrap",
            () -> new EpicItem(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_ORES_TAB)));

    public static final RegistryObject<Item> ENDZITE_INGOT = ITEMS.register("endzite_ingot",
            () -> new EpicItem(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_ORES_TAB)));

    public static final RegistryObject<Item> END_STICK = ITEMS.register("end_stick",
            () -> new EpicItem(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_MISC_TAB)));

    public static final RegistryObject<Item> ICE_STICK = ITEMS.register("ice_stick",
            () -> new Item(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_MISC_TAB)));

    public static final RegistryObject<Item> DULL_FIREITE = ITEMS.register("dull_fireite",
            () -> new Item(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_ORES_TAB)));

    public static final RegistryObject<Item> FIREITE = ITEMS.register("fireite",
            () -> new Item(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_ORES_TAB)));

    public static final RegistryObject<Item> DULL_FROZENITE = ITEMS.register("dull_frozenite",
            () -> new Item(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_ORES_TAB)));

    public static final RegistryObject<Item> FROZENITE = ITEMS.register("frozenite",
            () -> new Item(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_ORES_TAB)));


    public static final RegistryObject<Item> ENDERKING_SPAWN_EGG = ITEMS.register("enderking_spawn_egg",
            () -> new ForgeSpawnEggItem(ModdedEntities.ENDERKING,0x111111, 0xFF0000,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_MISC_TAB)));

    public static final RegistryObject<Item> IRON_GOLEM_SPAWN_EGG = ITEMS.register("iron_golem_spawn_egg",
            () -> new SpawnEggItem(EntityType.IRON_GOLEM,0xEDEDED, 0x808080,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_MISC_TAB)));

    public static final RegistryObject<Item> DRIDER_SPAWN_EGG = ITEMS.register("drider_spawn_egg",
            () -> new ForgeSpawnEggItem(ModdedEntities.DRIDER,0xFF0000, 0x111111,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_MISC_TAB)));


    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(ModdedTiers.TITANIUM, 3, -3.5F, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe",
            () -> new HoeItem(ModdedTiers.TITANIUM, 2, -3F, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModdedTiers.TITANIUM, 3, -3F, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new AxeItem(ModdedTiers.TITANIUM, 2, -2.5F, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new ShovelItem(ModdedTiers.TITANIUM, 1F, -3.5F, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet",
            () -> new ArmorItem(ModdedArmorMaterials.TITANIUM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",
            () -> new ArmorItem(ModdedArmorMaterials.TITANIUM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings",
            () -> new ArmorItem(ModdedArmorMaterials.TITANIUM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots",
            () -> new ArmorItem(ModdedArmorMaterials.TITANIUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));



    public static final RegistryObject<Item> FROZENITE_SWORD = ITEMS.register("frozenite_sword",
            () -> new FrozeniteSword(ModdedTiers.FROZENITE, 3, -0.5F, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> FROZENITE_HOE = ITEMS.register("frozenite_hoe",
            () -> new HoeItem(ModdedTiers.FROZENITE, 2, -0.5F, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> FROZENITE_PICKAXE = ITEMS.register("frozenite_pickaxe",
            () -> new PickaxeItem(ModdedTiers.FROZENITE, 2, -0.5F, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> FROZENITE_AXE = ITEMS.register("frozenite_axe",
            () -> new AxeItem(ModdedTiers.FROZENITE, 2F, -2.5F, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> FROZENITE_SHOVEL = ITEMS.register("frozenite_shovel",
            () -> new ShovelItem(ModdedTiers.FROZENITE, 2.2F, -0.5F, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));


    public static final RegistryObject<Item> FROZENITE_HELMET = ITEMS.register("frozenite_helmet",
            () -> new ArmorItem(ModdedArmorMaterials.FROZENITE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> FROZENITE_CHESTPLATE = ITEMS.register("frozenite_chestplate",
            () -> new ArmorItem(ModdedArmorMaterials.FROZENITE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> FROZENITE_LEGGINGS = ITEMS.register("frozenite_leggings",
            () -> new ArmorItem(ModdedArmorMaterials.FROZENITE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> FROZENITE_BOOTS = ITEMS.register("frozenite_boots",
            () -> new ArmorItem(ModdedArmorMaterials.FROZENITE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> ENDZITE_SWORD = ITEMS.register("endzite_sword",
            () -> new EpicSwordItem(ModdedTiers.ENDZITE, 5, 3, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> ENDZITE_HOE = ITEMS.register("endzite_hoe",
            () -> new EpicHoeItem(ModdedTiers.ENDZITE, 3, 3, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> ENDZITE_PICKAXE = ITEMS.register("endzite_pickaxe",
            () -> new EpicPickaxeItem(ModdedTiers.ENDZITE, 3, 3, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> ENDZITE_AXE = ITEMS.register("endzite_axe",
            () -> new EpicAxeItem(ModdedTiers.ENDZITE, 3, 3, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> ENDZITE_SHOVEL = ITEMS.register("endzite_shovel",
            () -> new EpicShovelItem(ModdedTiers.ENDZITE, 3, 3, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> ENDZITE_HELMET = ITEMS.register("endzite_helmet",
            () -> new EpicArmorItem(ModdedArmorMaterials.ENDZITE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));
    public static final RegistryObject<Item> ENDZITE_CHESTPLATE = ITEMS.register("endzite_chestplate",
            () -> new EpicArmorItem(ModdedArmorMaterials.ENDZITE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> ENDZITE_LEGGINGS = ITEMS.register("endzite_leggings",
            () -> new EpicArmorItem(ModdedArmorMaterials.ENDZITE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> ENDZITE_BOOTS = ITEMS.register("endzite_boots",
            () -> new EpicArmorItem(ModdedArmorMaterials.ENDZITE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));



    public static final RegistryObject<Item> FIREITE_SWORD = ITEMS.register("fireite_sword",
            () -> new FireiteSword(ModdedTiers.FIREITE, 3, -0.5F, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> FIREITE_HOE = ITEMS.register("fireite_hoe",
            () -> new HoeItem(ModdedTiers.FIREITE, 2, -0.5F, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> FIREITE_PICKAXE = ITEMS.register("fireite_pickaxe",
            () -> new PickaxeItem(ModdedTiers.FIREITE, 2, -0.5F, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> FIREITE_AXE = ITEMS.register("fireite_axe",
            () -> new AxeItem(ModdedTiers.FIREITE, 2, -0.5F, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> FIREITE_SHOVEL = ITEMS.register("fireite_shovel",
            () -> new ShovelItem(ModdedTiers.FIREITE, 2, -0.5F, new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> FIREITE_HELMET = ITEMS.register("fireite_helmet",
            () -> new ArmorItem(ModdedArmorMaterials.FIREITE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> FIREITE_CHESTPLATE = ITEMS.register("fireite_chestplate",
            () -> new ArmorItem(ModdedArmorMaterials.FIREITE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> FIREITE_LEGGINGS = ITEMS.register("fireite_leggings",
            () -> new ArmorItem(ModdedArmorMaterials.FIREITE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));

    public static final RegistryObject<Item> FIREITE_BOOTS = ITEMS.register("fireite_boots",
            () -> new ArmorItem(ModdedArmorMaterials.FIREITE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_TOOLS_TAB)));



    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_ORES_TAB)));

    public static final RegistryObject<Item> URANIUM_BAR = ITEMS.register("uranium_bar",
            () -> new UraniumBarItem(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_ORES_TAB)));

    public static final RegistryObject<Item> GOLDEN_POTATO = ITEMS.register("golden_potato",
            () -> new Item(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_MISC_TAB).rarity(Rarity.RARE).food(ModdedFoods.GOLDEN_POTATO)));

    public static final RegistryObject<Item> GOLDEN_BREAD = ITEMS.register("golden_bread",
            () -> new Item(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_MISC_TAB).rarity(Rarity.RARE).food(ModdedFoods.GOLDEN_BREAD)));

    public static final RegistryObject<Item> GOLDEN_CHICKEN = ITEMS.register("golden_chicken",
            () -> new Item(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_MISC_TAB).rarity(Rarity.RARE).food(ModdedFoods.GOLDEN_CHICKEN)));

    public static final RegistryObject<Item> GOLDEN_COOKIE = ITEMS.register("golden_cookie",
            () -> new Item(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_MISC_TAB).rarity(Rarity.RARE).food(ModdedFoods.GOLDEN_COOKIE)));

    public static final RegistryObject<Item> GOLDEN_PORKCHOP = ITEMS.register("golden_porkchop",
            () -> new Item(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_MISC_TAB).rarity(Rarity.RARE).food(ModdedFoods.GOLDEN_PORKCHOP)));

    public static final RegistryObject<Item> GOLDEN_STEAK = ITEMS.register("golden_steak",
            () -> new Item(new Item.Properties().tab(ModdedTabs.ENHANCEDCRAFT_MISC_TAB).rarity(Rarity.RARE).food(ModdedFoods.GOLDEN_STEAK)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
