package com.angxd.enhancedcraft;

import com.angxd.enhancedcraft.biome.ModdedRegion;
import com.angxd.enhancedcraft.biome.ModdedRules;
import com.angxd.enhancedcraft.block.ModdedBlocks;
import com.angxd.enhancedcraft.block.entity.client.renderer.UraniumTNTRenderer;
import com.angxd.enhancedcraft.block.entity.custom.PrimedUraniumTNT;
import com.angxd.enhancedcraft.effect.ModdedEffects;
import com.angxd.enhancedcraft.entity.ModdedEntities;
import com.angxd.enhancedcraft.entity.client.renderer.DriderRenderer;
import com.angxd.enhancedcraft.entity.client.renderer.EnderkingRenderer;
import com.angxd.enhancedcraft.block.entity.ModdedBlockEntities;
import com.angxd.enhancedcraft.item.ModdedItems;
import com.angxd.enhancedcraft.keybinds.ModdedKeybinds;
import com.angxd.enhancedcraft.recipe.ModdedRecipes;
import com.angxd.enhancedcraft.screen.FreezerScreen;
import com.angxd.enhancedcraft.screen.ModdedMenuTypes;
import com.angxd.enhancedcraft.sound.ModdedSounds;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

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
        ModdedRecipes.register(modEventBus);
        ModdedSounds.register(modEventBus);
        ModdedItems.register(modEventBus);
        ModdedBlocks.register(modEventBus);
        ModdedBlockEntities.register(modEventBus);
        ModdedMenuTypes.register(modEventBus);
        ModdedEffects.register(modEventBus);
        ModdedEntities.register(modEventBus);
        
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetup);

        GeckoLib.initialize();
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        ItemBlockRenderTypes.setRenderLayer(ModdedBlocks.TITANIUM_TRAP.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModdedBlocks.CHERRY_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModdedBlocks.CHERRY_SAPLING.get(), RenderType.cutout());
        EntityRenderers.register(ModdedEntities.ENDERKING.get(), EnderkingRenderer::new);
        EntityRenderers.register(ModdedEntities.DRIDER.get(), DriderRenderer::new);
        MenuScreens.register(ModdedMenuTypes.FREEZER_MENU.get(), FreezerScreen::new);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            Regions.register(new ModdedRegion(new ResourceLocation(MOD_ID, "overworld"), 10));
            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, ModdedRules.makeRules());

            SpawnPlacements.register(ModdedEntities.ENDERKING.get(),
                    SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Monster::checkMonsterSpawnRules);
        });

        LOGGER.info("EnhancedCraft loaded!");
    }
}
