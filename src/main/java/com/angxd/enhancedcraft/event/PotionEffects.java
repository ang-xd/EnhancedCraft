package com.angxd.enhancedcraft.event;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.item.entity.custom.TitaniumTrapEntity;
import com.angxd.enhancedcraft.sound.ModdedSounds;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.entity.living.PotionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EnhancedCraft.MOD_ID)
public class PotionEffects {

    @SubscribeEvent
    public static void potionExpire(PotionEvent.PotionExpiryEvent e) // Kill mobs captured by Titanium Trap
    {
        if(TitaniumTrapEntity.capturedMobs.contains(e.getEntity()))
        {
            e.getEntity().playSound(ModdedSounds.TITANIUM_TRAP_KILL.get(), 5, 0);
            e.getEntity().remove(Entity.RemovalReason.KILLED);

            TitaniumTrapEntity.capturedMobs.remove(e.getEntity());
        }
    }


}
