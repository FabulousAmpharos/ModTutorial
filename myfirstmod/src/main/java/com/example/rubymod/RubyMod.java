package com.example.rubymod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import com.example.rubymod.proxy.CommonProxy;

@Mod(modid = RubyMod.MODID, name = RubyMod.MODNAME, version = RubyMod.MODVERSION, dependencies = "required-after:forge@[11.16.0.1865,)", useMetadata = true)
public class RubyMod
{
	public static final String MODID = "examplemod";
    public static final String MODNAME = "Ruby Mod";
    public static final String MODVERSION= "0.0.0.0.1";

    @SidedProxy(clientSide = "com.example.rubymod.proxy.ClientProxy", serverSide = "com.example.rubymod.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static RubyMod instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}