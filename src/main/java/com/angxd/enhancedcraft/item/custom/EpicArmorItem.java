package com.angxd.enhancedcraft.item.custom;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;

public class EpicArmorItem extends ArmorItem {
    public EpicArmorItem(ArmorMaterial pMaterial, EquipmentSlot pSlot, Properties pProperties) {
        super(pMaterial, pSlot, pProperties);
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
