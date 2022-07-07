package com.angxd.enhancedcraft.block.entity.custom;

import com.angxd.enhancedcraft.entity.ModdedEntities;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

public class PrimedUraniumTNT extends PrimedTnt {

    @Nullable
    private LivingEntity owner;

    public PrimedUraniumTNT(EntityType<? extends PrimedTnt> p_32076_, Level p_32077_) {
        super(p_32076_, p_32077_);
        this.blocksBuilding = true;
    }

    public PrimedUraniumTNT(Level p_32079_, double p_32080_, double p_32081_, double p_32082_, @Nullable LivingEntity p_32083_) {
        this(ModdedEntities.URANIUM_TNT.get(), p_32079_);
        this.setPos(p_32080_, p_32081_, p_32082_);
        double d0 = p_32079_.random.nextDouble() * (double)((float)Math.PI * 2F);
        this.setDeltaMovement(-Math.sin(d0) * 0.02D, (double)0.2F, -Math.cos(d0) * 0.02D);
        this.setFuse(80);
        this.xo = p_32080_;
        this.yo = p_32081_;
        this.zo = p_32082_;
        this.owner = p_32083_;
    }


    @Override
    protected void explode() {
        this.level.explode(this, this.getX(), this.getY(0.0625D), this.getZ(), 7.5F, Explosion.BlockInteraction.BREAK);
    }
}
