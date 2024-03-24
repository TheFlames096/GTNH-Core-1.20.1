package com.theflames096.extratech.registry;

import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.theflames096.extratech.ETCore;
import com.theflames096.extratech.data.items.ETItems;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

public class ETCreativeModeTabs {
    @SuppressWarnings("null")
    public static RegistryEntry<CreativeModeTab> ITEM = ETRegistries.REGISTRATE.defaultCreativeTab(ETCore.MOD_ID,
            builder -> builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator(ETCore.MOD_ID, ETRegistries.REGISTRATE))
                    .icon(ETItems.SUGAR_CHARCOAL::asStack)
                    .title(Component.literal("ExtraTech"))
                    .build())
            .register();

    public static void init() {

    }
}