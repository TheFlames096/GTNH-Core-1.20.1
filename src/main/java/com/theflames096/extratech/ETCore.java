package com.theflames096.extratech;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialRegistryEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.PostMaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.theflames096.extratech.data.ETDatagen;
import com.theflames096.extratech.data.ETMaterials;
import com.theflames096.extratech.data.items.ETItems;
import com.theflames096.extratech.data.materials.MaterialFlagAddition;
import com.theflames096.extratech.registry.ETCreativeModeTabs;
import com.theflames096.extratech.registry.ETRegistries;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.gregtechceu.gtceu.common.data.GTMaterials.Copper;

import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ETCore.MOD_ID)
public class ETCore {
    public static final String MOD_ID = "extratech";

    private static final Logger LOGGER = LogUtils.getLogger();
    public static MaterialRegistry MATERIAL_REGISTRY;

    public ETCore()
    {
        ETCore.init();
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(ETRegistries.class);
    }

    public static void init() {
        ConfigHolder.init();

        //LOGGER.info("initializing ulv covers modern");
        ETCreativeModeTabs.init();
        ETItems.init();
        ETDatagen.init();

        ETRegistries.REGISTRATE.registerRegistrate();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    public static ResourceLocation id(String name) {
        return new ResourceLocation(MOD_ID, FormattingUtil.toLowerCaseUnder(name));
    }
}
