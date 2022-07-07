package com.angxd.enhancedcraft.sound;

import com.angxd.enhancedcraft.EnhancedCraft;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModdedSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, EnhancedCraft.MOD_ID);
    public static final RegistryObject<SoundEvent> ZAP = registerSound("zap");
    public static final RegistryObject<SoundEvent> DRIDER_SCREECH = registerSound("drider_screech");
    public static final RegistryObject<SoundEvent> DRIDER_DEATH = registerSound("drider_death");
    public static final RegistryObject<SoundEvent> DRIDER_BREATH = registerSound("drider_breath");

    public static final RegistryObject<SoundEvent> MACHINE_POWER = registerSound("machine_power");
    private static RegistryObject<SoundEvent> registerSound(String name)
    {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(EnhancedCraft.MOD_ID, name)));
    }
    public static void register(IEventBus bus) {
        SOUNDS.register(bus);
    }
}
