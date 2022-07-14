package com.angxd.enhancedcraft.event;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.item.ModdedItems;
import com.angxd.enhancedcraft.utilities.GenericUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EnhancedCraft.MOD_ID)
public class MiscEvents {
    @SubscribeEvent
    public static void wakeUpEvent(PlayerWakeUpEvent e) {
        e.getPlayer().setHealth(e.getPlayer().getMaxHealth());
    }

    public static Biome lastBiome = null;

    @SubscribeEvent
    public static void onEnterNewBiome(EntityEvent.EnteringSection e)
    {
        if(e.getEntity() instanceof Player)
        {
            Player player = (Player) e.getEntity();
            Biome biome = player.level.getBiome(e.getNewPos().center()).value();
            if(biome == null || biome.getRegistryName() == null) return;

            if(lastBiome != biome)
            {
                player.displayClientMessage(Component.nullToEmpty("Entered " + GenericUtils.convertToRealName(biome.getRegistryName().toString())), true);
                lastBiome = biome;
            }
        }
    }
}
