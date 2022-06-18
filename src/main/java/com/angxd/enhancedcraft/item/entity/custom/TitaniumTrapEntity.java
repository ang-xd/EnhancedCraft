package com.angxd.enhancedcraft.item.entity.custom;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.item.entity.ModdedBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.ArrayList;
import java.util.List;

public class TitaniumTrapEntity extends BlockEntity implements IAnimatable {

    private AnimationFactory factory = new AnimationFactory(this);
    public static List<Mob> capturedMobs = new ArrayList<>();
    public TitaniumTrapEntity(BlockPos pPos, BlockState pState) {
        super(ModdedBlockEntities.TITANIUM_TRAP.get(), pPos, pState);
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController<TitaniumTrapEntity>(this, "controller", 0, this::predicate));
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> e) {
        e.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
        return PlayState.CONTINUE;
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    public void tick() {
        List<Mob> mobs = EnhancedCraft.getEntitiesWithin(getLevel(), getBlockPos().getX(), getBlockPos().getY(), getBlockPos().getZ(), 7);
        for (Mob mob : mobs) {
            capturedMobs.add(mob);
            mob.noCulling = true;
            mob.noPhysics = true;
            MobEffectInstance effect = new MobEffectInstance(MobEffects.LEVITATION, 2);
            mob.addEffect(effect);
        }
    }
}
