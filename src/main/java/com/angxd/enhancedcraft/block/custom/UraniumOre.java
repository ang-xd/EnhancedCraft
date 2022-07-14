package com.angxd.enhancedcraft.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;

public class UraniumOre extends OreBlock {
    public UraniumOre(Properties p_55140_) {
        super(p_55140_);
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        player.addEffect(new MobEffectInstance(MobEffects.POISON, 80));
        return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }
}
