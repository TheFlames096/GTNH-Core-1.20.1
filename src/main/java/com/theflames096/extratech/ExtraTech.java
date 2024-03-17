package com.theflames096.extratech;

import net.minecraft.client.Minecraft;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.level.ExplosionEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.theflames096.extratech.data.ETDataGen;
import com.theflames096.extratech.data.ETItems;
import com.theflames096.extratech.registry.ETCreativeTabs;
import com.theflames096.extratech.registry.ETRegistries;

@Mod("extratech")
public class ExtraTech {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "extratech";
    public ExtraTech() {

        // This is our mod's event bus, used for things like registry or lifecycle events
        IEventBus MOD_BUS = FMLJavaModLoadingContext.get().getModEventBus();

        ExtraTech.init();
        // This listener is fired on both client and server during setup.
        MOD_BUS.addListener(this::commonSetup);
        // This listener is only fired during client setup, so we can use client-side methods here.
        MOD_BUS.addListener(this::clientSetup);

        MOD_BUS.register(this);
    }

    public static void init()
    {
        ETCreativeTabs.init();
        ETDataGen.init();
        ETItems.init();
        ETRegistries.REGISTRATE.registerRegistrate();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ETConfig.SPEC);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Hello from common setup! This is *after* registries are done, so we can do this:");
        LOGGER.info("Look, I found a {}!", Items.DIAMOND);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("Hey, we're on Minecraft version {}!", Minecraft.getInstance().getLaunchedVersion());
    }

    @SubscribeEvent
    public void kaboom(ExplosionEvent.Detonate event) {
        LOGGER.info("Kaboom! Something just blew up in {}!", event.getLevel());
    }
}
