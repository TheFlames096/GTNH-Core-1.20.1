package com.theflames096.extratech.data.materials;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.theflames096.extratech.data.ETMaterials.*;
import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.FluidState;
import com.gregtechceu.gtceu.api.fluids.attribute.FluidAttributes;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKeys;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
public class FirstDegreeMaterials {
    public static void register()
    {
        Alumina =  new Material.Builder(GTCEu.id("alumina"))
                .dust()
                .color(0xd4ecf9).secondaryColor(0xa6b9b6).iconSet(DULL)
                .components(Aluminium, 2, Oxygen, 3)
                .buildAndRegister();

        Cryolite = new Material.Builder(GTCEu.id("cryolite"))
                .dust().ore()
                .color(0xdbfeff).secondaryColor(0xa0c4d7).iconSet(DULL)
                .flags(DECOMPOSITION_BY_ELECTROLYZING)
                .components(Sodium,3,Aluminium,1,Fluorine,6)
                .buildAndRegister();

        SiliconCarbide = new Material.Builder(GTCEu.id("silicon_carbide"))
                .dust()
                .color(0x6b6478).secondaryColor(0x392e44).iconSet(METALLIC)
                .components(Silicon, 1, Carbon, 1)
                .buildAndRegister();
    }
}
