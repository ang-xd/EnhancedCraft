package com.angxd.enhancedcraft.entity.client.renderer;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.entity.client.model.DriderModel;
import com.angxd.enhancedcraft.entity.custom.DriderEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DriderRenderer extends GeoEntityRenderer<DriderEntity> {
    public DriderRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DriderModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(DriderEntity instance) {
        return new ResourceLocation(EnhancedCraft.MOD_ID, "textures/entity/drider.png");
    }

    @Override
    public RenderType getRenderType(DriderEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}