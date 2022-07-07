package com.angxd.enhancedcraft.entity;

import com.angxd.enhancedcraft.EnhancedCraft;
import com.angxd.enhancedcraft.block.entity.custom.PrimedUraniumTNT;
import com.angxd.enhancedcraft.entity.custom.DriderEntity;
import com.angxd.enhancedcraft.entity.custom.EnderkingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModdedEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, EnhancedCraft.MOD_ID);

    public static final RegistryObject<EntityType<PrimedUraniumTNT>> URANIUM_TNT = ENTITY_TYPES.register("uranium_tnt",
            () -> register("uranium_tnt", EntityType.Builder.<PrimedUraniumTNT>of(PrimedUraniumTNT::new, MobCategory.MISC)
                    .fireImmune().sized(0.98F, 0.98F).clientTrackingRange(10).updateInterval(10)));
    public static final RegistryObject<EntityType<EnderkingEntity>> ENDERKING =
            ENTITY_TYPES.register("enderking",
                    () -> EntityType.Builder.of(EnderkingEntity::new, MobCategory.MONSTER)
                            .sized(1f, 3f)
                            .build(new ResourceLocation(EnhancedCraft.MOD_ID, "enderking").toString()));

    public static final RegistryObject<EntityType<DriderEntity>> DRIDER =
            ENTITY_TYPES.register("drider",
                    () -> EntityType.Builder.of(DriderEntity::new, MobCategory.MONSTER)
                            .sized(1f, 3f)
                            .fireImmune()
                            .build(new ResourceLocation(EnhancedCraft.MOD_ID, "drider").toString()));

    private static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> builder) {
        return builder.build(id);
    }
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
