package com.safaricraft.init;

import com.safaricraft.animal.EntityAfricanBushElephant;
import com.safaricraft.animal.EntityAfricanLionFemale;
import com.safaricraft.animal.EntityAfricanLionMale;
import com.safaricraft.animal.EntityAfricanWildDog;
import com.safaricraft.animal.EntityBlackRhino;
import com.safaricraft.animal.EntityBlueWildebeest;
import com.safaricraft.animal.EntityCommonEland;
import com.safaricraft.animal.EntityDeBrazzaMonkey;
import com.safaricraft.animal.EntityGemsbok;
import com.safaricraft.animal.EntityHippopotamus;
import com.safaricraft.animal.EntityHoneyBadger;
import com.safaricraft.animal.EntityImpala;
import com.safaricraft.animal.EntityIndianBlackBuck;
import com.safaricraft.animal.EntityKirkDikDik;
import com.safaricraft.animal.EntityMountainGorilla;
import com.safaricraft.animal.EntityMountainGorillaFemale;
import com.safaricraft.animal.EntityPlainsZebra;
import com.safaricraft.animal.EntityReticulatedGiraffe;
import com.safaricraft.animal.EntityScimitarHornedOryx;
import com.safaricraft.animal.EntityThomsonsGazelle;
import com.safaricraft.animal.EntityWhiteRhino;
import com.safaricraft.animal.ModelAfricanBushElephant;
import com.safaricraft.animal.ModelAfricanLionFemale;
import com.safaricraft.animal.ModelAfricanLionMale;
import com.safaricraft.animal.ModelAfricanWildDog;
import com.safaricraft.animal.ModelBlackBuckMale;
import com.safaricraft.animal.ModelBlackRhino;
import com.safaricraft.animal.ModelBlueWildebeest;
import com.safaricraft.animal.ModelCommonEland;
import com.safaricraft.animal.ModelDeBrazzaMonkey;
import com.safaricraft.animal.ModelGemsbok;
import com.safaricraft.animal.ModelHippopotamus;
import com.safaricraft.animal.ModelImpala;
import com.safaricraft.animal.ModelKirksDikDik;
import com.safaricraft.animal.ModelMountainGorillaFemale;
import com.safaricraft.animal.ModelMoutainGorillaMale;
import com.safaricraft.animal.ModelPlainsZebra;
import com.safaricraft.animal.ModelRatel;
import com.safaricraft.animal.ModelReticulatedGiraffe;
import com.safaricraft.animal.ModelScimitarHornedOryx;
import com.safaricraft.animal.ModelThomsonsGazelle;
import com.safaricraft.animal.ModelWhiteRhino;
import com.safaricraft.animal.RenderAfricanBushElephant;
import com.safaricraft.animal.RenderAfricanLionFemale;
import com.safaricraft.animal.RenderAfricanLionMale;
import com.safaricraft.animal.RenderAfricanWildDog;
import com.safaricraft.animal.RenderBlackBuck;
import com.safaricraft.animal.RenderBlackRhino;
import com.safaricraft.animal.RenderBlueWildebeest;
import com.safaricraft.animal.RenderCommonEland;
import com.safaricraft.animal.RenderDebrazzasGuenon;
import com.safaricraft.animal.RenderGemsbok;
import com.safaricraft.animal.RenderHippo;
import com.safaricraft.animal.RenderHoneyBadger;
import com.safaricraft.animal.RenderImpala;
import com.safaricraft.animal.RenderKirksDikDik;
import com.safaricraft.animal.RenderMountainGorilla;
import com.safaricraft.animal.RenderMountainGorillaFemale;
import com.safaricraft.animal.RenderPlainsZebra;
import com.safaricraft.animal.RenderReticulatedGiraffe;
import com.safaricraft.animal.RenderScimitarHornedOryx;
import com.safaricraft.animal.RenderThomsonsGazelle;
import com.safaricraft.animal.RenderWhiteRhino;
import com.safaricraft.main.SafariCraft;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {

    public static void init() {
        // Every entity in our mod has an ID (local to this mod)
        int id = 1;
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombie"), EntityAfricanBushElephant.class, "African Bush Elephant", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombi1e"), EntityAfricanLionMale.class, "African Lion Male", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombi2e"), EntityAfricanLionFemale.class, "African Lion Female", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombi3e"), EntityHoneyBadger.class, "Honey Badger", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombi4e"), EntityBlueWildebeest.class, "Blue Wildebeest", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombi5e"), EntityPlainsZebra.class, "Plains Zebra", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombi6e"), EntityThomsonsGazelle.class, "Thompson's Gazelle", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombie7"), EntityGemsbok.class, "Gemsbok", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombie8"), EntityReticulatedGiraffe.class, "Reticulated Giraffe", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombie9"), EntityHippopotamus.class, "Nile Hippo", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombie10"), EntityCommonEland.class, "Common  Eland", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombie11"), EntityAfricanWildDog.class, "African Wild Dog", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombie12"), EntityImpala.class, "Impala", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombie13"), EntityBlackRhino.class, "Black Rhino", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombie14"), EntityWhiteRhino.class, "White Rhino", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombie15"), EntityMountainGorilla.class, "Mountain Gorilla Male", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombie16"), EntityMountainGorillaFemale.class, "Mountain Gorilla Female", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombie17"), EntityDeBrazzaMonkey.class, "DeBrazza's Guenon", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombie18"), EntityScimitarHornedOryx.class, "Scimitar Horned Oryx", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombie19"), EntityKirkDikDik.class, "Kirk's Dik Dik", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity(new ResourceLocation(SafariCraft.MODID, "weirdzombie20"), EntityIndianBlackBuck.class, "Indian BlackBuck", id++, SafariCraft.instance, 64, 3, true, 0x996600, 0x00ff00);

        // We want our mob to spawn in Plains and ice plains biomes. If you don't add this then it will not spawn automatically
        // but you can of course still make it spawn manually

        // This is the loot table for our mob
    }

}