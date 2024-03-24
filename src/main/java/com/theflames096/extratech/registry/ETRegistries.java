package com.theflames096.extratech.registry;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.theflames096.extratech.data.ETMaterials.*;

import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.MaterialRegistryEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.event.PostMaterialEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlag;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconType;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.theflames096.extratech.data.ETMaterials;
import com.theflames096.extratech.ETCore;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.FilePackResources;
import net.minecraft.server.packs.PackResources;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ETCore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ETRegistries
{
    public static final MaterialFlag GENERATE_NANITES = new MaterialFlag.Builder("generate_nanites")
        .requireProps(PropertyKey.DUST)
        .build();
    public static final TagPrefix nanites = new TagPrefix("nanites")
        .defaultTagPath("nanites/%s")
        .unformattedTagPath("nanites")
        .materialIconType(new MaterialIconType("nanites"))
        .unificationEnabled(false)
        .generateItem(true)
        .generationCondition(mat -> mat.hasFlag(GENERATE_NANITES));
    public static final GTRegistrate REGISTRATE = GTRegistrate.create(ETCore.MOD_ID);
    public static MaterialRegistry MATERIAL_REGISTRY;
    @SubscribeEvent
    public static void registerMaterialRegistryEvent(MaterialRegistryEvent event) {
        MATERIAL_REGISTRY = GTCEuAPI.materialManager.createRegistry(ETCore.MOD_ID);
    }
  
    @SubscribeEvent
    public static void registerMaterials(MaterialEvent event) {
        ETMaterials.init();
    }

    @SubscribeEvent
    public void modifyMaterials(PostMaterialEvent event) {
        Copper.addFlags(
            MaterialFlags.GENERATE_SMALL_GEAR, 
            MaterialFlags.GENERATE_ROTOR, 
            MaterialFlags.GENERATE_BOLT_SCREW,
            GENERATE_NANITES
        );
    }
}