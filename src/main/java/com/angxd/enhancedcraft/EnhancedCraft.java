package com.angxd.enhancedcraft;

import com.angxd.enhancedcraft.block.ModdedBlocks;
import com.angxd.enhancedcraft.entity.ModdedEntities;
import com.angxd.enhancedcraft.entity.client.renderer.EnderkingRenderer;
import com.angxd.enhancedcraft.item.entity.ModdedBlockEntities;
import com.angxd.enhancedcraft.item.ModdedItems;
import com.angxd.enhancedcraft.sound.ModdedSounds;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

import java.util.List;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(EnhancedCraft.MOD_ID)
public class EnhancedCraft
{
    public static final String MOD_ID = "enhancedcraft";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public EnhancedCraft() {
        // Register the setup method for modloading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register new content
        ModdedItems.register(modEventBus);
        ModdedBlocks.register(modEventBus);
        ModdedBlockEntities.register(modEventBus);
        ModdedSounds.register(modEventBus);

        ModdedEntities.register(modEventBus);

        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientInit);

        GeckoLib.initialize();
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static List<Mob> getEntitiesWithin(LevelAccessor level, int x, int y, int z, int radius)
    {
        return level.getEntitiesOfClass(Mob.class, new AABB(x, y, z, (x + 1),(y + 1),(z + 1)).inflate(radius));
    }

    private void clientInit(final FMLClientSetupEvent event)
    {
        ItemBlockRenderTypes.setRenderLayer(ModdedBlocks.TITANIUM_TRAP.get(), RenderType.translucent());
        EntityRenderers.register(ModdedEntities.ENDERKING.get(), EnderkingRenderer::new);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            SpawnPlacements.register(ModdedEntities.ENDERKING.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Monster::checkMonsterSpawnRules);
        });

        LOGGER.info("EnhancedCraft loaded!");
    }
}
