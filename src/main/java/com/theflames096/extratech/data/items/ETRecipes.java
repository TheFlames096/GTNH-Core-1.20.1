package com.theflames096.extratech.data.items;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.theflames096.extratech.data.ETMaterials.*;

import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.theflames096.extratech.Config;
import com.theflames096.extratech.ETCore;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent.Finish;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
import static com.gregtechceu.gtceu.api.GTValues.*;

public class ETRecipes {
    public static void initAdd(Consumer<FinishedRecipe> provider) {
        BLAST_RECIPES.recipeBuilder("cryolite_to_aluminium").blastFurnaceTemp(963).EUt(VA[MV]).duration(1600).inputItems(dust,Cryolite,5).inputItems(dust,Alumina,10).outputItems(ingot, Aluminium,4).save(provider);
        BLAST_RECIPES.recipeBuilder("carbon_to_aluminium").blastFurnaceTemp(2054).EUt(VA[MV]).duration(1200).inputItems(dust,Carbon,3).inputItems(dust,Alumina,10).outputItems(ingot, Aluminium,4).outputFluids(CarbonDioxide.getFluid(3000)).save(provider);
        
        COKE_OVEN_RECIPES.recipeBuilder("log_to_charcoal_new").inputItems(ItemTags.LOGS).outputItems(gem, Charcoal).outputFluids(Creosote.getFluid(250)).duration(1800).save(provider);
        COKE_OVEN_RECIPES.recipeBuilder("coal_to_coke_new").inputItems(gem, Coal).outputItems(gem, Coke).outputFluids(Creosote.getFluid(500)).duration(1800).save(provider);
        COKE_OVEN_RECIPES.recipeBuilder("coal_to_coke_block_new").inputItems(block, Coal).outputItems(block, Coke).outputFluids(Creosote.getFluid(4500)).duration(16200).save(provider);
        COKE_OVEN_RECIPES.recipeBuilder("cactus_to_charcoal").inputItems(Items.CACTUS).outputItems(ETItems.CACTUS_CHARCOAL).outputFluids(Creosote.getFluid(30)).duration(500).save(provider);
        COKE_OVEN_RECIPES.recipeBuilder("cactus_to_coke").inputItems(ETItems.CACTUS_CHARCOAL).outputItems(ETItems.CACTUS_COKE).outputFluids(Creosote.getFluid(30)).duration(500).save(provider);
        COKE_OVEN_RECIPES.recipeBuilder("sugar_to_charcoal").inputItems(Items.SUGAR_CANE).outputItems(ETItems.SUGAR_CHARCOAL).outputFluids(Creosote.getFluid(30)).duration(500).save(provider);
        COKE_OVEN_RECIPES.recipeBuilder("sugar_to_coke").inputItems(ETItems.SUGAR_CHARCOAL).outputItems(ETItems.SUGAR_COKE).outputFluids(Creosote.getFluid(30)).duration(500).save(provider);
    }
    public static void initRemove(Consumer<ResourceLocation> consumer) {
    }
}
