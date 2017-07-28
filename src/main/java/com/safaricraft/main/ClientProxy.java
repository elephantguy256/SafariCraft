package com.safaricraft.main;

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
import com.safaricraft.init.SoundEvents2;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(SafariCraft.MODID + ":" + id, "inventory"));
    }

	
    
    public void preInit(FMLPreInitializationEvent e)
    {
      super.preInit(e);
  	SoundEvents2.registerSounds();
    }
    


    public void registerRenders(){
RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
// RenderingRegistry.registerEntityRenderingHandler(EntityGoldenGoose.class, new RenderGoldenGoose(renderManager, new ModelGoldenGoose(), 0.5F)); // 0.5F is shadow size 
RenderingRegistry.registerEntityRenderingHandler(EntityAfricanBushElephant.class, new RenderAfricanBushElephant(renderManager, new ModelAfricanBushElephant(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityAfricanLionMale.class, new RenderAfricanLionMale(renderManager, new ModelAfricanLionMale(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityAfricanLionFemale.class, new RenderAfricanLionFemale(renderManager, new ModelAfricanLionFemale(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityHoneyBadger.class, new RenderHoneyBadger(renderManager, new ModelRatel(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityBlueWildebeest.class, new RenderBlueWildebeest(renderManager, new ModelBlueWildebeest(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityPlainsZebra.class, new RenderPlainsZebra(renderManager, new ModelPlainsZebra(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityThomsonsGazelle.class, new RenderThomsonsGazelle(renderManager, new ModelThomsonsGazelle(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityGemsbok.class, new RenderGemsbok(renderManager, new ModelGemsbok(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityReticulatedGiraffe.class, new RenderReticulatedGiraffe(renderManager, new ModelReticulatedGiraffe(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityHippopotamus.class, new RenderHippo(renderManager, new ModelHippopotamus(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityAfricanWildDog.class, new RenderAfricanWildDog(renderManager, new ModelAfricanWildDog(), 0.5F));
RenderingRegistry.registerEntityRenderingHandler(EntityCommonEland.class, new RenderCommonEland(renderManager, new ModelCommonEland(), 0.5F)); 
RenderingRegistry.registerEntityRenderingHandler(EntityImpala.class, new RenderImpala(renderManager, new ModelImpala(), 0.5F)); 
RenderingRegistry.registerEntityRenderingHandler(EntityMountainGorilla.class, new RenderMountainGorilla(renderManager, new ModelMoutainGorillaMale(), 0.5F)); 
RenderingRegistry.registerEntityRenderingHandler(EntityMountainGorillaFemale.class, new RenderMountainGorillaFemale(renderManager, new ModelMountainGorillaFemale(), 0.5F)); 
RenderingRegistry.registerEntityRenderingHandler(EntityBlackRhino.class, new RenderBlackRhino(renderManager, new ModelBlackRhino(), 0.5F)); 
RenderingRegistry.registerEntityRenderingHandler(EntityWhiteRhino.class, new RenderWhiteRhino(renderManager, new ModelWhiteRhino(), 0.5F)); 
RenderingRegistry.registerEntityRenderingHandler(EntityScimitarHornedOryx.class, new RenderScimitarHornedOryx(renderManager, new ModelScimitarHornedOryx(), 0.5F)); 
RenderingRegistry.registerEntityRenderingHandler(EntityKirkDikDik.class, new RenderKirksDikDik(renderManager, new ModelKirksDikDik(), 0.5F)); 
RenderingRegistry.registerEntityRenderingHandler(EntityIndianBlackBuck.class, new RenderBlackBuck(renderManager, new ModelBlackBuckMale(), 0.5F)); 
RenderingRegistry.registerEntityRenderingHandler(EntityDeBrazzaMonkey.class, new RenderDebrazzasGuenon(renderManager, new ModelDeBrazzaMonkey(), 0.5F)); 
}
}