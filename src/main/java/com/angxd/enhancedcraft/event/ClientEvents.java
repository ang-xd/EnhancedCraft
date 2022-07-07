package com.angxd.enhancedcraft.event;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.block.entity.ModdedBlockEntities;
import com.angxd.enhancedcraft.block.entity.client.renderer.TitaniumTrapRenderer;
import com.angxd.enhancedcraft.block.entity.client.renderer.UraniumTNTRenderer;
import com.angxd.enhancedcraft.block.entity.custom.PrimedUraniumTNT;
import com.angxd.enhancedcraft.entity.ModdedEntities;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EnhancedCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void registerRend(final EntityRenderersEvent.RegisterRenderers e) {
        e.registerBlockEntityRenderer(ModdedBlockEntities.TITANIUM_TRAP.get(), TitaniumTrapRenderer::new);
        e.registerEntityRenderer(ModdedEntities.URANIUM_TNT.get(), UraniumTNTRenderer::new);
    }
}
