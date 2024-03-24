package com.theflames096.extratech.data.materials;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.OreProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.theflames096.extratech.registry.ETRegistries;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

import static com.theflames096.extratech.data.ETMaterials.*;

public class MaterialFlagAddition {
    public static final MaterialFlag GENERATE_NANITES= new MaterialFlag.Builder("generate_nanites")
            .requireProps(PropertyKey.DUST)
            .build();
    public static final TagPrefix nanites = new TagPrefix("nanites")
            .defaultTagPath("nanites/%s")
            .unformattedTagPath("nanites")
            .materialIconType(new MaterialIconType("nanites"))
            .unificationEnabled(false)
            .generateItem(true)
            .generationCondition(mat -> mat.hasFlag(GENERATE_NANITES));
    public static void initOre()
    {
        OreProperty oreProp = Cryolite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Alumina, Sodium, Cryolite);
    }
    public static void initMat()
    {
        Copper.addFlags(
            MaterialFlags.GENERATE_SMALL_GEAR, 
            MaterialFlags.GENERATE_ROTOR, 
            MaterialFlags.GENERATE_BOLT_SCREW,
            MaterialFlags.FORCE_GENERATE_BLOCK,
            GENERATE_NANITES
        );
        Cocoa.addFlags(GENERATE_NANITES);
    }
}
