package com.angxd.enhancedcraft.event;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.effect.ModdedEffects;
import com.angxd.enhancedcraft.effect.custom.FreezeEffect;
import com.angxd.enhancedcraft.entity.ModdedEntities;
import com.angxd.enhancedcraft.utilities.GenericUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.profiling.jfr.event.ChunkGenerationEvent;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.IceBlock;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.client.event.MovementInputUpdateEvent;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

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
