package com.angxd.enhancedcraft.item.custom;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;

public class EpicSwordItem extends SwordItem {

    public EpicSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public Rarity getRarity(ItemStack pStack) {
        return Rarity.EPIC;
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        return true;
    }
}
