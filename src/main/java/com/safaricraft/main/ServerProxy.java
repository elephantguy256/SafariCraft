package com.safaricraft.main;

import com.safaricraft.init.SoundEvents2;

import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy
  extends CommonProxy
{
  public ModelBiped getArmorModel(int id)
  {
    return null;
  }
  
  public void preInit(FMLPreInitializationEvent e)
  {
    super.preInit(e);
  }
  
  public void init(FMLInitializationEvent e)
  {
    super.init(e);
  }
  
  public void postInit(FMLPostInitializationEvent e)
  {
    super.postInit(e);
  }
}