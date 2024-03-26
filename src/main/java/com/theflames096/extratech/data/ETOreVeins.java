package com.theflames096.extratech.data;

import com.gregtechceu.gtceu.api.data.worldgen.GTOreDefinition;
import com.gregtechceu.gtceu.api.data.worldgen.WorldGenLayers;
import com.gregtechceu.gtceu.api.data.worldgen.generator.indicators.SurfaceIndicatorGenerator;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTOres;

import com.theflames096.extratech.data.ETMaterials;

import net.minecraft.resources.ResourceLocation;

import static com.theflames096.extratech.enums.WorldDefinition.*;

public class ETOreVeins {
    public static GTOreDefinition CRYOLITE_VEIN_TF = GTOres.create(new ResourceLocation("cryolite_vein_tf"), vein -> vein
            .clusterSize(30)
            .weight(40)
            .layer(WorldGenLayers.getByName("tf"))
            .density(0.25f)
            .dimensions(TWILIGHT_FOREST)
            .heightRangeUniform(-30, 0)
            .discardChanceOnAirExposure(0)
            .layeredVeinGenerator(generator -> generator
                    .buildLayerPattern(pattern -> pattern
                            .layer(l -> l.weight(3).mat(GTMaterials.Galena).size(2, 4))
                            .layer(l -> l.weight(3).mat(GTMaterials.Silver).size(1, 1))
                            .layer(l -> l.weight(2).mat(GTMaterials.Lead).size(1, 1))
                            .layer(l -> l.weight(1).mat(ETMaterials.Cryolite).size(1, 1))
                    ))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(ETMaterials.Cryolite)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)
                    .density(0.4f)
                    .radius(5)));
    public static void init()
    {}
}
