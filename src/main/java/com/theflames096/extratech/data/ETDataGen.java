package com.theflames096.extratech.data;

import com.theflames096.extratech.data.lang.LangHandler;
import com.theflames096.extratech.registry.ETRegistries;
import com.tterrag.registrate.providers.ProviderType;

public class ETDatagen {
    public static void init() {
        ETRegistries.REGISTRATE.addDataGenerator(ProviderType.LANG, LangHandler::init);
    }
}
