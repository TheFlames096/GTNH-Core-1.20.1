package com.theflames096.extratech.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.OreProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

import static com.theflames096.extratech.data.ETMaterials.*;

public class MaterialFlagAddition {
    public static void init()
    {
        OreProperty oreProp = Cryolite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Alumina, Sodium);
    }
}
