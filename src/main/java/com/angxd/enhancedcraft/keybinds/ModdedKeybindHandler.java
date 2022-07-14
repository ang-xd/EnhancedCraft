package com.angxd.enhancedcraft.keybinds;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.item.ModdedArmorMaterials;
import com.angxd.enhancedcraft.item.ModdedItems;
import com.angxd.enhancedcraft.utilities.GenericUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Mob;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EnhancedCraft.MOD_ID)
public class ModdedKeybindHandler {

    @SubscribeEvent
    public static void tick(TickEvent.PlayerTickEvent e) {
        if(e.player.level.isClientSide() == false) return;

        GenericUtils.damageAllArmor(e.player, 10);

        if(ModdedKeybinds.flyKey.isDown()) {
            if(GenericUtils.hasCorrectArmorOn(ModdedArmorMaterials.ENDZITE, e.player)) {
                if(e.player.hasEffect(MobEffects.LEVITATION))
                {
                    e.player.removeEffect(MobEffects.LEVITATION);
                }
                else
                {
                    e.player.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 0, 10));
                }
            }
        }
    }
}
