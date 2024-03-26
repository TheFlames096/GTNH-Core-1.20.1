package com.theflames096.extratech.enums;

import java.util.Set;


import com.gregtechceu.gtceu.api.data.worldgen.IWorldGenLayer;
import com.gregtechceu.gtceu.api.data.worldgen.WorldGeneratorUtils;

import lombok.Getter;
import lombok.NonNull;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class WorldDefinition {
    public static final ResourceLocation TWILIGHT_FOREST = new ResourceLocation("twilightforest", "twilight_forest");
    public static final ResourceLocation MOON = new ResourceLocation("ad_astra", "moon");
    public static final ResourceLocation VENUS = new ResourceLocation("ad_astra", "venus");
    public static final ResourceLocation MARS = new ResourceLocation("ad_astra", "mars");
    public static final ResourceLocation MERCURY = new ResourceLocation("ad_astra", "mercury");
    public static final ResourceLocation GLACIO = new ResourceLocation("ad_astra", "glacio");
}
