package com.angxd.enhancedcraft.entity.client.model;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.entity.custom.EnderkingEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EnderkingModel extends AnimatedGeoModel<EnderkingEntity> {
    @Override
    public ResourceLocation getModelLocation(EnderkingEntity object) {
        return new ResourceLocation(EnhancedCraft.MOD_ID, "geo/enderking.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EnderkingEntity object) {
        return new ResourceLocation(EnhancedCraft.MOD_ID, "textures/entity/enderking.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EnderkingEntity animatable) {
        return new ResourceLocation(EnhancedCraft.MOD_ID, "animations/enderking.animation.json");
    }
}