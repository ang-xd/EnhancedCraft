package com.angxd.enhancedcraft.entity;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.entity.custom.EnderkingEntity;
import com.angxd.enhancedcraft.entity.custom.IceMonster;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModdedEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, EnhancedCraft.MOD_ID);

    public static final RegistryObject<EntityType<EnderkingEntity>> ENDERKING =
            ENTITY_TYPES.register("enderking",
                    () -> EntityType.Builder.of(EnderkingEntity::new, MobCategory.MONSTER)
                            .sized(1f, 3f)
                            .build(new ResourceLocation(EnhancedCraft.MOD_ID, "enderking").toString()));

    public static final RegistryObject<EntityType<IceMonster>> ICE_MONSTER =
            ENTITY_TYPES.register("ice_monster",
                    () -> EntityType.Builder.of(IceMonster::new, MobCategory.MONSTER)
                            .sized(1f, 3f)
                            .build(new ResourceLocation(EnhancedCraft.MOD_ID, "ice_monster").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
