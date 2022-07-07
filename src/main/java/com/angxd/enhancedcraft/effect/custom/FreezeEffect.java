package com.angxd.enhancedcraft.effect.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.common.capabilities.Capability;

public class FreezeEffect extends MobEffect {
    public FreezeEffect(MobEffectCategory effectCategory, int color) {
        super(effectCategory, color);
    }

    @Override
    public boolean isDurationEffectTick(int p_19455_, int p_19456_) {
        return true;
    }
}
