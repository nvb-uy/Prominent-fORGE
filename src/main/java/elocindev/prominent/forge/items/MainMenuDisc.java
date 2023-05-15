package elocindev.prominent.forge.items;

import java.util.function.Supplier;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.RecordItem;

public class MainMenuDisc extends RecordItem {
    public MainMenuDisc(Supplier<SoundEvent> soundSupplier, Properties builder) {
        super(15, soundSupplier, builder, 120);
    }
}