package com.angxd.enhancedcraft.block.entity;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.block.ModdedBlocks;
import com.angxd.enhancedcraft.block.entity.custom.FreezerBlockEntity;
import com.angxd.enhancedcraft.block.entity.custom.TitaniumTrapEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModdedBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, EnhancedCraft.MOD_ID);

    public static final RegistryObject<BlockEntityType<FreezerBlockEntity>> FREEZER = BLOCK_ENTITIES.register(
            "freezer", () -> BlockEntityType.Builder.of(FreezerBlockEntity::new, ModdedBlocks.FREEZER.get()).build(null));
    public static final RegistryObject<BlockEntityType<TitaniumTrapEntity>> TITANIUM_TRAP = BLOCK_ENTITIES.register(
            "titanium_trap", () -> BlockEntityType.Builder.of(TitaniumTrapEntity::new, ModdedBlocks.TITANIUM_TRAP.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
