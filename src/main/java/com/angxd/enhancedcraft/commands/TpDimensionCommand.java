package com.angxd.enhancedcraft.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.Level;

import java.util.Collection;

public class TpDimensionCommand {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher){
        dispatcher.register(Commands.literal("tpdimension").requires((p_137800_) -> {
            return p_137800_.hasPermission(3);
        }).then(Commands.argument("targets", EntityArgument.players()).executes((p_137806_) -> {
            return execute(p_137806_.getSource(), EntityArgument.getPlayers(p_137806_, "targets"), 0);
        }).then(Commands.argument("dimension", FloatArgumentType.floatArg()).executes((p_137798_) -> {
            return execute(p_137798_.getSource(), EntityArgument.getPlayers(p_137798_, "targets"), FloatArgumentType.getFloat(p_137798_, "dimension"));
        }))));
    }
    private static int execute(CommandSourceStack pSource, Collection<ServerPlayer> pPlayers, float dimension) {
        for (ServerPlayer plr : pPlayers)
        {

            ServerLevel serverlevel = (ServerLevel) plr.getLevel();
            MinecraftServer minecraftserver = serverlevel.getServer();
            ResourceKey<Level> netherKey = Level.NETHER;
            ResourceKey<Level> endKey = Level.END;
            ResourceKey<Level> overworldKey = Level.OVERWORLD;

            switch ((int) dimension)
            {
                case 0:
                    plr.changeDimension(minecraftserver.getLevel(overworldKey));
                    break;
                case 1:
                    plr.changeDimension(minecraftserver.getLevel(netherKey));
                    break;
                case 2:
                    plr.changeDimension(minecraftserver.getLevel(endKey));
                    break;
            }
        }
        return Command.SINGLE_SUCCESS;
    }
}