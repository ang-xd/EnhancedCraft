package com.angxd.enhancedcraft.block.entity.client.renderer;

import com.angxd.enhancedcraft.block.entity.client.model.TitaniumTrapModel;
import com.angxd.enhancedcraft.block.entity.custom.TitaniumTrapEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import javax.annotation.Nullable;

public class TitaniumTrapRenderer extends GeoBlockRenderer<TitaniumTrapEntity> {
    public TitaniumTrapRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
        super(rendererDispatcherIn, new TitaniumTrapModel());
    }

    @Override
    public RenderType getRenderType(TitaniumTrapEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer, @Nullable VertexConsumer vertexBuilder,
                                    int packedLightIn, ResourceLocation textureLocation) {
        return RenderType.entityTranslucent(getTextureLocation(animatable));
    }
}
