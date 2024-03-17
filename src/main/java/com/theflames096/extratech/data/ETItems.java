package com.theflames096.extratech.data;

import com.gregtechceu.gtceu.api.item.ComponentItem;
import com.theflames096.extratech.registry.ETCreativeTabs;

import static com.theflames096.extratech.registry.ETRegistries.*;
import com.tterrag.registrate.util.entry.ItemEntry;

import com.tterrag.registrate.builders.ItemBuilder;
import com.tterrag.registrate.providers.DataGenContext;
import com.tterrag.registrate.providers.ProviderType;
import com.tterrag.registrate.providers.RegistrateLangProvider;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.tterrag.registrate.util.entry.ItemProviderEntry;
import com.tterrag.registrate.util.nullness.NonNullBiConsumer;
import com.tterrag.registrate.util.nullness.NonNullConsumer;
import com.tterrag.registrate.util.nullness.NonNullFunction;

public class ETItems {
    static {
        REGISTRATE.creativeModeTab(() -> ETCreativeTabs.ITEM);
    }
    public static <T extends ComponentItem> NonNullConsumer<T> burnTime(int burnTime) {
        return item -> item.burnTime(burnTime);
    }
    public static ItemEntry<ComponentItem> SUGAR_CHARCOAL = REGISTRATE.item("sugar_charcoal", ComponentItem::create).lang("Sugar Charcoal").onRegister(burnTime(400)).register();
    public static ItemEntry<ComponentItem> SUGAR_COKE = REGISTRATE.item("sugar_coke", ComponentItem::create).lang("Sugar Coke").onRegister(burnTime(800)).register();
    public static ItemEntry<ComponentItem> CACTUS_CHARCOAL = REGISTRATE.item("cactus_charcoal", ComponentItem::create).lang("Cactus Charcoal").onRegister(burnTime(400)).register();
    public static ItemEntry<ComponentItem> CACTUS_COKE = REGISTRATE.item("cactus_coke", ComponentItem::create).lang("Cactus Coke").onRegister(burnTime(800)).register();
    public static void init(){}
}
