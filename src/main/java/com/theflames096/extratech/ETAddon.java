package com.theflames096.extratech;

import java.util.function.Consumer;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.theflames096.extratech.data.items.ETRecipes;
import com.theflames096.extratech.registry.ETRegistries;

import net.minecraft.data.recipes.FinishedRecipe;

@GTAddon
public class ETAddon implements IGTAddon {

    @Override
    public GTRegistrate getRegistrate() {
        return ETRegistries.REGISTRATE;
    }

    @Override
    public void initializeAddon() {
    }

    @Override
    public String addonModId() {
        return ETCore.MOD_ID;
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        ETRecipes.init(provider);
    }
}
