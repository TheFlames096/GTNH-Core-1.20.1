package com.theflames096.extratech.data.items;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.theflames096.extratech.Config;
import com.theflames096.extratech.ETCore;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent.Finish;

public class ETRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        if (Config.easyRecipes) { 
            initEasy(provider); 
        } else { 
            initNormal(provider); 
        }
    }
    
    public static void initEasy(Consumer<FinishedRecipe> provider) {

    }

    public static void initNormal(Consumer<FinishedRecipe> provider) {
    }
}
