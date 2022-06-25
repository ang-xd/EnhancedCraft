package com.angxd.enhancedcraft.block;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.ModdedTab;
import com.angxd.enhancedcraft.block.custom.FlammableRotatedPillarBlock;
import com.angxd.enhancedcraft.block.custom.SleepingBagBlock;
import com.angxd.enhancedcraft.block.custom.TitaniumTrapBlock;
import com.angxd.enhancedcraft.item.ModdedItems;
import com.angxd.enhancedcraft.world.feature.tree.CherryTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModdedBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EnhancedCraft.MOD_ID);

    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(5.5f, 7.0f)), ModdedTab.ENHANCEDCRAFT_TAB);

    public static final RegistryObject<Block> ICEITE_ORE = registerBlock("iceite_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(6.2F)), ModdedTab.ENHANCEDCRAFT_TAB);

    public static final RegistryObject<Block> CRACKED_ICE = registerBlock("cracked_ice",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.ICE, MaterialColor.ICE).strength(5.5f).sound(SoundType.GLASS)), ModdedTab.ENHANCEDCRAFT_TAB);

    public static final RegistryObject<Block> FIREITE_ORE = registerBlock("fireite_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).strength(4f).requiresCorrectToolForDrops().sound(SoundType.NETHER_GOLD_ORE)), ModdedTab.ENHANCEDCRAFT_TAB);
    public static final RegistryObject<Block> ENDZITE_ORE = registerBlock("endzite_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(5.5f)), ModdedTab.ENHANCEDCRAFT_TAB);

    public static final RegistryObject<Block> ENDZITE_BLOCK = registerBlock("endzite_block",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(12f)), ModdedTab.ENHANCEDCRAFT_TAB);
    public static final RegistryObject<Block> CHERRY_LOG = registerBlock("cherry_log", () -> new FlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModdedTab.ENHANCEDCRAFT_TAB);

    public static final RegistryObject<Block> CHERRY_SAPLING = registerBlock("cherry_sapling",
            () -> new SaplingBlock(new CherryTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModdedTab.ENHANCEDCRAFT_TAB);

    public static final RegistryObject<Block> CHERRY_LEAVES = registerBlock("cherry_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModdedTab.ENHANCEDCRAFT_TAB);


    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), ModdedTab.ENHANCEDCRAFT_TAB);

    public static final RegistryObject<Block> FIREITE_BLOCK = registerBlock("fireite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.FIRE).strength(9f).requiresCorrectToolForDrops()), ModdedTab.ENHANCEDCRAFT_TAB);

    public static final RegistryObject<Block> RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModdedTab.ENHANCEDCRAFT_TAB);

    public static final RegistryObject<Block> TITANIUM_TRAP = registerBlockWithoutBlockItem("titanium_trap",
            () -> new TitaniumTrapBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().randomTicks().requiresCorrectToolForDrops().strength(6)));

    public static final RegistryObject<Block> SLEEPING_BAG = registerBlock("sleeping_bag",
            () -> new SleepingBagBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).noOcclusion().strength(1)), ModdedTab.ENHANCEDCRAFT_TAB);

    public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(5.5f, 7.0f)), ModdedTab.ENHANCEDCRAFT_TAB);
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> returnValue = BLOCKS.register(name, block);
        registerBlockItem(name, returnValue, tab);
        return returnValue;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModdedItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
