package net.takeout.takeoutsmoreores.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.takeout.takeoutsmoreores.TakeoutsMoreOres;

public class ModSounds {
    public static final SoundEvent METAL_DETECTOR_FOUND_ORE = registerSoundEvent("metal_detector_found_ore");

    public static final SoundEvent GOLDEN_ODYSSEY = registerSoundEvent("golden_odyssey");
    public static final SoundEvent BAR_BRAWL = registerSoundEvent("bar_brawl");



    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(TakeoutsMoreOres.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        TakeoutsMoreOres.LOGGER.info("Registering Sounds for " + TakeoutsMoreOres.MOD_ID);
    }
}
