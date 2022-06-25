package com.angxd.enhancedcraft.world;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.world.gen.EntityGen;
import com.angxd.enhancedcraft.world.gen.OreGen;
import com.angxd.enhancedcraft.world.gen.TreeGen;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EnhancedCraft.MOD_ID)
public class WorldGen {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
       OreGen.generateOres(event);
       TreeGen.genTrees(event);
       EntityGen.onEntitySpawn(event);
    }
}