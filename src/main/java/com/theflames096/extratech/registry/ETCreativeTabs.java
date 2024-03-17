package com.theflames096.extratech.registry;

import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.theflames096.extratech.ExtraTech;
import com.theflames096.extratech.data.ETItems;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

public class ETCreativeTabs {
    @SuppressWarnings("null")
    public static RegistryEntry<CreativeModeTab> ITEM = ETRegistries.REGISTRATE.defaultCreativeTab(ExtraTech.MOD_ID,
            builder -> builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator(ExtraTech.MOD_ID, ETRegistries.REGISTRATE))
                    .icon(ETItems.SUGAR_COKE::asStack)
                    .title(Component.literal("ULV Covers Modern"))
                    .build())
            .register();

    public static void init() {

    }
}