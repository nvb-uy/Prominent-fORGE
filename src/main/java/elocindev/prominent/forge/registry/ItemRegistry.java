package elocindev.prominent.forge.registry;

import elocindev.prominent.forge.ProminentLoader;
import elocindev.prominent.forge.items.MainMenuDisc;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ProminentLoader.MODID);

    public static final RegistryObject<Item> MAIN_MENU_DISC = 
        REGISTRY.register("music_disc_coniferus_forest", () -> new MainMenuDisc(SoundRegistry.CONIFERUS_FOREST, new Item.Properties().stacksTo(1)
        .tab(ProminentLoader.PROMINENT_TAB)
        .rarity(Rarity.RARE)));

    public static final RegistryObject<Item> ICON = 
        REGISTRY.register("icon", () -> new Item(new Item.Properties().stacksTo(1)));
}