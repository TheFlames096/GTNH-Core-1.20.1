package com.theflames096.extratech.data;


import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.MarkerMaterial;
import com.gregtechceu.gtceu.api.data.chemical.material.MarkerMaterials;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.MaterialStack;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.theflames096.extratech.data.materials.FirstDegreeMaterials;
import com.theflames096.extratech.data.materials.MaterialFlagAddition;

public class ETMaterials {
    public static void init()
    {
        FirstDegreeMaterials.register();
        MaterialFlagAddition.initOre();
    }
    //Basic Material
    public static Material Alumina;
    public static Material Cryolite;

    public static Material SiliconCarbide;
}
