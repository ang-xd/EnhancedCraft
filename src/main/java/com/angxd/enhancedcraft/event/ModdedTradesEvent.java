package com.angxd.enhancedcraft.event;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.item.ModdedItems;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.MendingEnchantment;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = EnhancedCraft.MOD_ID)
public class ModdedTradesEvent {

    @SubscribeEvent
    public static void addModdedTrades(VillagerTradesEvent event) {
        if (event.getType().equals(VillagerProfession.ARMORER)) {
            armorerTrades(event);
        } else if (event.getType().equals(VillagerProfession.FARMER)) {
            farmerTrades(event);
        } else if(event.getType().equals(VillagerProfession.WEAPONSMITH)) {

        } else if(event.getType().equals(VillagerProfession.LIBRARIAN)) {
            librarianTrades(event);
        }
    }

    public static void librarianTrades(VillagerTradesEvent event) {
        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

        ItemStack mendingBook = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.MENDING, Enchantments.MENDING.getMaxLevel()));

        trades.get(1).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 45),
                mendingBook,25,6,0.04F));
    }
    public static void farmerTrades(VillagerTradesEvent event) {
        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

        trades.get(2).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 4),
                new ItemStack(ModdedItems.GOLDEN_BREAD.get()),25,6,0.04F));

        trades.get(3).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 6),
                new ItemStack(ModdedItems.GOLDEN_COOKIE.get()),25,6,0.04F));

        trades.get(1).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 5),
                new ItemStack(ModdedItems.GOLDEN_POTATO.get()),25,6,0.04F));

        trades.get(4).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 4),
                new ItemStack(ModdedItems.GOLDEN_CHICKEN.get()),25,6,0.04F));

        trades.get(4).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 5),
                new ItemStack(ModdedItems.GOLDEN_PORKCHOP.get()),25,6,0.04F));

        trades.get(5).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 9),
                new ItemStack(ModdedItems.GOLDEN_STEAK.get()),25,12,0.07F));
    }
    public static void armorerTrades(VillagerTradesEvent event) {
        Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

        trades.get(4).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 4),
                new ItemStack(Items.EMERALD, 1  ),25,3,0.03F));

        trades.get(5).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 8),
                new ItemStack(Items.DIAMOND, 1),20,4,0.04F));

        trades.get(3).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 20),
                new ItemStack(Items.GOLDEN_CHESTPLATE, 1),3,6,0.06F));

        trades.get(3).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 20),
                new ItemStack(Items.GOLDEN_LEGGINGS, 1),3,6,0.06F));

        trades.get(3).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 14),
                new ItemStack(Items.GOLDEN_HELMET, 1),4,6,0.06F));

        trades.get(3).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 15),
                new ItemStack(Items.GOLDEN_BOOTS, 1),4,6,0.06F));

        trades.get(3).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 21),
                new ItemStack(Items.GOLDEN_HORSE_ARMOR, 1),3,6,0.06F));

        trades.get(2).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 22),
                new ItemStack(Items.IRON_HELMET, 1),2,8,0.08F));

        trades.get(2).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 21),
                new ItemStack(Items.IRON_BOOTS, 1),3,8,0.08F));

        trades.get(2).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 32),
                new ItemStack(Items.IRON_LEGGINGS, 1),3,8,0.08F));

        trades.get(2).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 34),
                new ItemStack(Items.IRON_CHESTPLATE, 1),2,8,0.08F));

        trades.get(2).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 28),
                new ItemStack(Items.IRON_HORSE_ARMOR, 1),2,8,0.08F));

        trades.get(1).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 4),
                new ItemStack(Items.LEATHER_HELMET, 1),5,2,0.02F));

        trades.get(1).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 8),
                new ItemStack(Items.CHAINMAIL_BOOTS, 1),3,3,0.02F));

        trades.get(1).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 8),
                new ItemStack(Items.CHAINMAIL_HELMET, 1),3,3,0.02F));

        trades.get(1).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 12),
                new ItemStack(Items.CHAINMAIL_CHESTPLATE, 1),3,3,0.02F));

        trades.get(1).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 10),
                new ItemStack(Items.LEATHER_HORSE_ARMOR, 1),3,3,0.02F));

        trades.get(1).add((trader, rand) -> new MerchantOffer(
                new ItemStack(ModdedItems.AMBER.get(), 13),
                new ItemStack(Items.LEATHER_CHESTPLATE, 1),3,3,0.02F));
    }
}
