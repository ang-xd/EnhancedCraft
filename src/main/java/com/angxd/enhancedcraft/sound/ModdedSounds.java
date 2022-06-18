package com.angxd.enhancedcraft.sound;

import com.angxd.enhancedcraft.EnhancedCraft;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModdedSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, EnhancedCraft.MOD_ID);

    public static final RegistryObject<SoundEvent> TITANIUM_TRAP_KILL = registerSound("titanium_trap_kill");
    private static RegistryObject<SoundEvent> registerSound(String name)
    {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(EnhancedCraft.MOD_ID, name)));
    }
    public static void register(IEventBus bus) {
        SOUNDS.register(bus);
    }
}
