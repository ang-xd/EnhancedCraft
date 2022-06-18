package com.angxd.enhancedcraft.item.entity.client.model;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.item.entity.custom.TitaniumTrapEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TitaniumTrapModel extends AnimatedGeoModel<TitaniumTrapEntity> {
    @Override
    public ResourceLocation getModelLocation(TitaniumTrapEntity object) {
        return new ResourceLocation(EnhancedCraft.MOD_ID, "geo/titanium_trap.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(TitaniumTrapEntity object) {
        return new ResourceLocation(EnhancedCraft.MOD_ID, "textures/block/titanium_trap.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(TitaniumTrapEntity animatable) {
        return new ResourceLocation(EnhancedCraft.MOD_ID, "animations/titanium_trap.animation.json");
    }
}
