package com.angxd.enhancedcraft.item.client.model;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.item.custom.TitaniumTrapItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TitaniumTrapItemModel extends AnimatedGeoModel<TitaniumTrapItem> {
    @Override
    public ResourceLocation getModelLocation(TitaniumTrapItem object) {
        return new ResourceLocation(EnhancedCraft.MOD_ID, "geo/titanium_trap.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(TitaniumTrapItem object) {
        return new ResourceLocation(EnhancedCraft.MOD_ID, "textures/block/titanium_trap.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(TitaniumTrapItem animatable) {
        return new ResourceLocation(EnhancedCraft.MOD_ID, "animations/titanium_trap.animation.json");
    }
}
