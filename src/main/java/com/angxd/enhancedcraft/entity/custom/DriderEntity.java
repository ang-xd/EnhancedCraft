package com.angxd.enhancedcraft.entity.custom;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.entity.custom.ai.goals.DriderAttack;
import com.angxd.enhancedcraft.item.ModdedItems;
import com.angxd.enhancedcraft.sound.ModdedSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.Difficulty;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.AbstractSkeleton;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.pathfinder.Path;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.MixinEnvironment;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.EnumSet;
import java.util.TimerTask;
import java.util.function.Predicate;

public class DriderEntity extends Monster implements IAnimatable {

    private AnimationFactory factory = new AnimationFactory(this);
    public static boolean ROARING;

    public static final EntityDataAccessor<Boolean> ROARINGDATA =
            SynchedEntityData.defineId(DriderEntity.class, EntityDataSerializers.BOOLEAN);
    public static AnimationBuilder WALK_ANIM = new AnimationBuilder().addAnimation("animation.drider.walk", true);
    public static AnimationBuilder IDLE_ANIM = new AnimationBuilder().addAnimation("animation.drider.idle", true);
    public static AnimationBuilder ROAR = new AnimationBuilder().addAnimation("animation.drider.roar");
    public DriderEntity(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
    }

    private static final Predicate<Difficulty> DOOR_BREAKING_PREDICATE = (p_34284_) -> {
        return p_34284_ == Difficulty.NORMAL;
    };

    public static AttributeSupplier setAttributes() {
        return Monster.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 200)
                .add(Attributes.MOVEMENT_SPEED, (double)0.2f)
                .add(Attributes.ATTACK_DAMAGE, 12D)
                .add(Attributes.FOLLOW_RANGE, 20D).build();
    }



    @Override
    protected void dropAllDeathLoot(DamageSource pDamageSource) {
        Level world = this.level;
        Entity pTarget = this;
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
                    pTarget.playSound(SoundEvents.LIGHTNING_BOLT_IMPACT, 20, 0);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        };

        thread.start();
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(2, new SunPainGoal(this));
        this.goalSelector.addGoal(2, new BreakDoorGoal(this, DOOR_BREAKING_PREDICATE));
        this.goalSelector.addGoal(2, new DriderAttack(this, 1.7f, true));
        this.goalSelector.addGoal(3, new RandomStrollGoal(this, 2));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<LivingEntity>(this, LivingEntity.class, true));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(ROARINGDATA, false);
    }

    public void setRoaring(boolean value) {
        this.ROARING = value;
        if(this.ROARING == true) {
            playSound(ModdedSounds.DRIDER_SCREECH.get(), 1.5F, 0);
        }
    }

    public boolean getRoaring() {
        return this.ROARING;
    }

    @Nullable
    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor p_21434_, DifficultyInstance p_21435_, MobSpawnType p_21436_, @Nullable SpawnGroupData p_21437_, @Nullable CompoundTag p_21438_) {
        setRoaring(true);
        return super.finalizeSpawn(p_21434_, p_21435_, p_21436_, p_21437_, p_21438_);
    }

    public <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving() && !getRoaring()) {
            event.getController().setAnimation(WALK_ANIM);
            return PlayState.CONTINUE;
        }

        if (getRoaring()) {
            event.getController().setAnimation(ROAR);
            if(event.getController().getAnimationState() == AnimationState.Stopped)
                setRoaring(false);
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(IDLE_ANIM);
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller",
                3, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    protected SoundEvent getAmbientSound() {
        return ModdedSounds.DRIDER_BREATH.get();
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return ModdedSounds.DRIDER_SCREECH.get();
    }

    protected SoundEvent getDeathSound() {
        return ModdedSounds.DRIDER_DEATH.get();
    }

    protected float getSoundVolume() {
        return 0.4F;
    }
}




