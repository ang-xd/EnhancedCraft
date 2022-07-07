package com.angxd.enhancedcraft.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.Tags;

public class EndziteSword extends SwordItem {
    public EndziteSword(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 70), pAttacker);

        Level world = pTarget.level;
        BlockPos blockUnderPos = pTarget.getOnPos();
        BlockPos startingPos = new BlockPos(blockUnderPos.getX(), blockUnderPos.getY() + 1, blockUnderPos.getZ());
        Thread thread = new Thread(){
            public void run(){
                try {
                    pTarget.playSound(SoundEvents.NETHERITE_BLOCK_PLACE, 10, 0);
                    world.setBlock(startingPos, Blocks.OBSIDIAN.defaultBlockState(), 3);
                    Thread.sleep(1000);
                    BlockPos one = new BlockPos(startingPos.getX() - 1, startingPos.getY(), startingPos.getZ());
                    BlockPos one22 = new BlockPos(startingPos.getX() - 2, startingPos.getY(), startingPos.getZ());
                    BlockPos two = new BlockPos(startingPos.getX() - 2, startingPos.getY(), startingPos.getZ());
                    BlockPos two22 = new BlockPos(startingPos.getX() + 1, startingPos.getY(), startingPos.getZ());
                    BlockPos two2 = new BlockPos(startingPos.getX() - 2, startingPos.getY() + 1, startingPos.getZ());
                    BlockPos two3 = new BlockPos(startingPos.getX() - 2, startingPos.getY() + 2, startingPos.getZ());
                    BlockPos two4 = new BlockPos(startingPos.getX() - 2, startingPos.getY() + 3, startingPos.getZ());
                    BlockPos one2 = new BlockPos(startingPos.getX() + 1, startingPos.getY() + 1, startingPos.getZ());
                    BlockPos one3 = new BlockPos(startingPos.getX() + 1, startingPos.getY() + 2, startingPos.getZ());
                    BlockPos one4 = new BlockPos(startingPos.getX() + 1, startingPos.getY() + 3, startingPos.getZ());
                    BlockPos one44 = new BlockPos(startingPos.getX() + 1, startingPos.getY() + 4, startingPos.getZ());
                    BlockPos two44 = new BlockPos(startingPos.getX() - 2, startingPos.getY() + 4, startingPos.getZ());
                    BlockPos top1 = new BlockPos(startingPos.getX(), startingPos.getY() + 4, startingPos.getZ());
                    BlockPos top2 = new BlockPos(startingPos.getX() - 1, startingPos.getY() + 4, startingPos.getZ());
                    BlockPos firePos = new BlockPos(startingPos.getX(), startingPos.getY() + 1, startingPos.getZ());
                    world.setBlock(one, Blocks.OBSIDIAN.defaultBlockState(), 3);
                    world.setBlock(one22, Blocks.OBSIDIAN.defaultBlockState(), 3);
                    pTarget.playSound(SoundEvents.NETHERITE_BLOCK_PLACE, 10, 0);
                    Thread.sleep(1000);
                    world.setBlock(two, Blocks.OBSIDIAN.defaultBlockState(), 3);
                    world.setBlock(two22, Blocks.OBSIDIAN.defaultBlockState(), 3);
                    pTarget.playSound(SoundEvents.NETHERITE_BLOCK_PLACE, 10, 0);
                    Thread.sleep(1000);
                    world.setBlock(two2, Blocks.OBSIDIAN.defaultBlockState(), 3);
                    world.setBlock(one2, Blocks.OBSIDIAN.defaultBlockState(), 3);
                    pTarget.playSound(SoundEvents.NETHERITE_BLOCK_PLACE, 10, 0);
                    Thread.sleep(1000);
                    world.setBlock(two3, Blocks.OBSIDIAN.defaultBlockState(), 3);
                    world.setBlock(one3, Blocks.OBSIDIAN.defaultBlockState(), 3);
                    pTarget.playSound(SoundEvents.NETHERITE_BLOCK_PLACE, 10, 0);
                    Thread.sleep(1000);
                    world.setBlock(two4, Blocks.OBSIDIAN.defaultBlockState(), 3);
                    world.setBlock(one4, Blocks.OBSIDIAN.defaultBlockState(), 3);
                    pTarget.playSound(SoundEvents.NETHERITE_BLOCK_PLACE, 10, 0);
                    Thread.sleep(1000);
                    world.setBlock(one44, Blocks.OBSIDIAN.defaultBlockState(), 3);
                    world.setBlock(two44, Blocks.OBSIDIAN.defaultBlockState(), 3);
                    pTarget.playSound(SoundEvents.NETHERITE_BLOCK_PLACE, 10, 0);
                    Thread.sleep(1000);
                    world.setBlock(top1, Blocks.OBSIDIAN.defaultBlockState(), 3);
                    world.setBlock(top2, Blocks.OBSIDIAN.defaultBlockState(), 3);
                    pTarget.playSound(SoundEvents.NETHERITE_BLOCK_PLACE, 10, 0);
                    Thread.sleep(1500);
                    world.setBlock(firePos, Blocks.FIRE.defaultBlockState(), 3);
                    pTarget.playSound(SoundEvents.NETHERITE_BLOCK_BREAK, 10, 0);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        };

        thread.start();
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
