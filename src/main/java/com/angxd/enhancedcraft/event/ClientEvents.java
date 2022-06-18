package com.angxd.enhancedcraft.event;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.item.entity.ModdedBlockEntities;
import com.angxd.enhancedcraft.item.entity.client.renderer.TitaniumTrapRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EnhancedCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void registerRend(final EntityRenderersEvent.RegisterRenderers e) {
        e.registerBlockEntityRenderer(ModdedBlockEntities.TITANIUM_TRAP.get(), TitaniumTrapRenderer::new);
    }
}
