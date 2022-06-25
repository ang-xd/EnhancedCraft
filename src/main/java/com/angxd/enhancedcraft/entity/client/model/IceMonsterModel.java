package com.angxd.enhancedcraft.entity.client.model;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.entity.custom.EnderkingEntity;
import com.angxd.enhancedcraft.entity.custom.IceMonster;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IceMonsterModel extends AnimatedGeoModel<IceMonster> {
    @Override
    public ResourceLocation getModelLocation(IceMonster object) {
        return new ResourceLocation(EnhancedCraft.MOD_ID, "geo/ice_monster.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(IceMonster object) {
        return new ResourceLocation(EnhancedCraft.MOD_ID, "textures/entity/ice_monster.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(IceMonster animatable) {
        return new ResourceLocation(EnhancedCraft.MOD_ID, "animations/ice_monster.animation.json");
    }
}