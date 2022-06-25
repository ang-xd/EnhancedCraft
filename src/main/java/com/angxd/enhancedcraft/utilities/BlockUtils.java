package com.angxd.enhancedcraft.utilities;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class BlockUtils {
    public static List<Mob> getEntitiesWithin(LevelAccessor level, int x, int y, int z, int radius) {
        return level.getEntitiesOfClass(Mob.class, new AABB(x, y, z, (x + 1),(y + 1),(z + 1)).inflate(radius));
    }

    public static List<BlockState> getNearBlocks(Level level, int x, int y, int z, float radius) {
        return level.getBlockStates(new AABB(x, y, z, (x + 1),(y + 1),(z + 1)).inflate(radius)).toList();
    }
}
