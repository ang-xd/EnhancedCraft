package com.angxd.enhancedcraft.entity.client.model;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.entity.custom.DriderEntity;
import com.angxd.enhancedcraft.entity.custom.EnderkingEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DriderModel extends AnimatedGeoModel<DriderEntity> {
    @Override
    public ResourceLocation getModelLocation(DriderEntity object) {
        return new ResourceLocation(EnhancedCraft.MOD_ID, "geo/drider.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(DriderEntity object) {
        return new ResourceLocation(EnhancedCraft.MOD_ID, "textures/entity/drider.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(DriderEntity animatable) {
        return new ResourceLocation(EnhancedCraft.MOD_ID, "animations/drider.animation.json");
    }
}