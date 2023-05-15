package elocindev.prominent.forge;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import elocindev.prominent.forge.config.ConfigBuilder;
import elocindev.prominent.forge.config.ConfigEntries;
import elocindev.prominent.forge.registry.ItemRegistry;
import elocindev.prominent.forge.registry.SoundRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(ProminentLoader.MODID)
public class ProminentLoader {
    public static final String MODID = "prominent";
    private static final Logger LOGGER = LogUtils.getLogger();
    public static ConfigEntries Config = ConfigBuilder.loadConfig();

    public static CreativeModeTab PROMINENT_TAB;

    public ProminentLoader() {
        MinecraftForge.EVENT_BUS.register(this);

        PROMINENT_TAB = new CreativeModeTab("prominent") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ItemRegistry.ICON.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};

        Config = ConfigBuilder.loadConfig();
        LOGGER.info("Loaded Prominent Config");

        ItemRegistry.register();
        SoundRegistry.register();
    }
}
