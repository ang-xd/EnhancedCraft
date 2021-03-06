package com.angxd.enhancedcraft.block.entity.client.renderer;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.block.ModdedBlocks;
import com.angxd.enhancedcraft.block.entity.custom.PrimedUraniumTNT;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.TntMinecartRenderer;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class UraniumTNTRenderer extends EntityRenderer<PrimedUraniumTNT> {
    public UraniumTNTRenderer(EntityRendererProvider.Context p_174008_) {
        super(p_174008_);
        this.shadowRadius = 0.5F;
    }

    public void render(PrimedUraniumTNT pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        pMatrixStack.pushPose();
        pMatrixStack.translate(0.0D, 0.5D, 0.0D);
        int i = pEntity.getFuse();
        if ((float)i - pPartialTicks + 1.0F < 10.0F) {
            float f = 1.0F - ((float)i - pPartialTicks + 1.0F) / 10.0F;
            f = Mth.clamp(f, 0.0F, 1.0F);
            f *= f;
            f *= f;
            float f1 = 1.0F + f * 0.3F;
            pMatrixStack.scale(f1, f1, f1);
        }

        pMatrixStack.mulPose(Vector3f.YP.rotationDegrees(-90.0F));
        pMatrixStack.translate(-0.5D, -0.5D, 0.5D);
        pMatrixStack.mulPose(Vector3f.YP.rotationDegrees(90.0F));
        TntMinecartRenderer.renderWhiteSolidBlock(ModdedBlocks.URANIUM_TNT.get().defaultBlockState(), pMatrixStack, pBuffer, pPackedLight, i / 5 % 2 == 0);
        pMatrixStack.popPose();
    }

    public ResourceLocation getTextureLocation(PrimedUraniumTNT pEntity) {
        return TextureAtlas.LOCATION_BLOCKS;
    }
}
