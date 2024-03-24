package com.theflames096.extratech.data.lang;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.tterrag.registrate.providers.RegistrateLangProvider;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.theflames096.extratech.data.ETMaterials;

import java.util.Set;
import java.lang.reflect.Field;
import java.util.HashSet;

public class LangHandler extends com.gregtechceu.gtceu.data.lang.LangHandler {
    private static Set<Material> MATERIALS = new HashSet<Material>();

    public static void init(RegistrateLangProvider provider) {
        initItemTooltips(provider);
    }

    private static void initItemTooltips(RegistrateLangProvider provider){

        for (Field field : ETMaterials.class.getFields()) {
            try {
                if(field.get(null) instanceof Material mat)
                    MATERIALS.add(mat);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        // materials
        for (Material material : MATERIALS) {
            provider.add(material.getUnlocalizedName(), FormattingUtil.toEnglishName(material.getName()));
        }
    }
}
