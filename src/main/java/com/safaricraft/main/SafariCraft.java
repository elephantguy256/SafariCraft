package com.safaricraft.main;


import com.safaricraft.init.ModEntities;
import com.safaricraft.init.SoundEvents2;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = SafariCraft.MODID, name = SafariCraft.MODNAME, version = SafariCraft.MODVERSION)


public class SafariCraft {

        public static final String MODID = "ec";
        public static final String MODNAME = "SafariCraft";
        public static final String MODVERSION = "1.0.0";


    	@SidedProxy(clientSide="com.safaricraft.main.ClientProxy", serverSide="com.safaricraft.main.ServerProxy")
        public static CommonProxy proxy;

        @Mod.Instance
        public static SafariCraft instance;

        public static org.apache.logging.log4j.Logger logger;

        @Mod.EventHandler
        public void preInit(FMLPreInitializationEvent e) {
            logger = e.getModLog();
            proxy.preInit(e);
        	ModEntities.init();
        }

        @Mod.EventHandler
        public void init(FMLInitializationEvent e) {
            proxy.init(e);
            proxy.registerRenders();
		    proxy.registerRenders(); 
            SoundEvents2.registerSounds();
        }

        @Mod.EventHandler
        public void postInit(FMLPostInitializationEvent e) {
            proxy.postInit(e);
        }

        public static SafariCraft getInstance(){

        return instance;

        }
}