package com.angxd.enhancedcraft.entity.custom;

import com.angxd.enhancedcraft.sound.ModdedSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.util.GoalUtils;

public class SunPainGoal extends Goal {
    private final PathfinderMob mob;

    public SunPainGoal(PathfinderMob mob) {
        this.mob = mob;
    }

    @Override
    public boolean canUse() {
        return this.mob.level.isDay() && this.mob.getItemBySlot(EquipmentSlot.HEAD).isEmpty() && GoalUtils.hasGroundPathNavigation(this.mob);
    }

    @Override
    public void tick() {
        if (this.mob.level.canSeeSky(new BlockPos(this.mob.getX(), this.mob.getY() + 0.5D, this.mob.getZ()))) {
            this.mob.kill();
        }

        super.tick();
    }
}
