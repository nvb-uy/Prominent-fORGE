package elocindev.prominent.forge.registry;

import elocindev.prominent.forge.ProminentLoader;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundRegistry {
    public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ProminentLoader.MODID);

    public static RegistryObject<SoundEvent> CONIFERUS_FOREST = 
        REGISTRY.register("music_disc.coniferus_forest", () -> new SoundEvent(new ResourceLocation(ProminentLoader.MODID, "music_disc.coniferus_forest")));

    public static void register() {}
}
