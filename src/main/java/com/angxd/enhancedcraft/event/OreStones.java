package com.angxd.enhancedcraft.event;

import com.angxd.enhancedcraft.EnhancedCraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = EnhancedCraft.MOD_ID)
public class OreStones {

    public static List<String> stoneOres = List.of(
            Blocks.COAL_ORE.getRegistryName().toString(),
            Blocks.COPPER_ORE.getRegistryName().toString(),
            Blocks.IRON_ORE.getRegistryName().toString(),
            Blocks.DIAMOND_ORE.getRegistryName().toString(),
            Blocks.GOLD_ORE.getRegistryName().toString(),
            Blocks.LAPIS_ORE.getRegistryName().toString(),
            Blocks.REDSTONE_ORE.getRegistryName().toString(),
            Blocks.EMERALD_ORE.getRegistryName().toString(),
            "enhancedcraft:titanium_ore"
    );

    public static List<String> endStones = List.of(
            "enhancedcraft:endzite_ore"
    );

    public static List<String> netherStones = List.of(
            "enhancedcraft:fireite_ore"
    );


    public static List<String> deepslateOres = List.of(
            Blocks.DEEPSLATE_COAL_ORE.getRegistryName().toString(),
            Blocks.DEEPSLATE_COPPER_ORE.getRegistryName().toString(),
            Blocks.DEEPSLATE_IRON_ORE.getRegistryName().toString(),
            Blocks.DEEPSLATE_DIAMOND_ORE.getRegistryName().toString(),
            Blocks.DEEPSLATE_GOLD_ORE.getRegistryName().toString(),
            Blocks.DEEPSLATE_LAPIS_ORE.getRegistryName().toString(),
            Blocks.DEEPSLATE_REDSTONE_ORE.getRegistryName().toString(),
            Blocks.DEEPSLATE_EMERALD_ORE.getRegistryName().toString(),
            "enhancedcraft:deepslate_titanium_ore"
    );

    public static void onCall(BlockEvent.BreakEvent e)
    {
        Player plr = e.getPlayer();
        if(plr.isCreative()) return;

        Block block = e.getState().getBlock();
        BlockPos pos = e.getPos();
        LevelAccessor world = e.getWorld();

        if (stoneOres.contains(block.getRegistryName().toString()))
        {
            e.setCanceled(true);
            world.setBlock(pos, Blocks.STONE.defaultBlockState(), 3);
            block.dropResources(block.defaultBlockState(), (Level)world, pos);
        }

        if(endStones.contains(block.getRegistryName().toString()))
        {
            e.setCanceled(true);
            world.setBlock(pos, Blocks.END_STONE.defaultBlockState(), 3);
            block.dropResources(block.defaultBlockState(), (Level)world, pos);
        }

        if(netherStones.contains(block.getRegistryName().toString()))
        {
            e.setCanceled(true);
            world.setBlock(pos, Blocks.NETHERRACK.defaultBlockState(), 3);
            block.dropResources(block.defaultBlockState(), (Level)world, pos);
        }

        if (deepslateOres.contains(block.getRegistryName().toString()))
        {
            e.setCanceled(true);
            world.setBlock(pos, Blocks.DEEPSLATE.defaultBlockState(), 3);
            block.dropResources(block.defaultBlockState(), (Level)world, pos);
        }

        EnhancedCraft.LOGGER.info("Broke block: " + block.getRegistryName());
    }

}
