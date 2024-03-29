package com.example.rubymod.proxy;

//import com.example.rubymod.ModBlocks;
//import com.example.rubymod.ModEntities;
import com.example.rubymod.ModItems;
import com.example.rubymod.RubyMod;

//import com.example.rubymod.ModTut;
//import com.example.rubymod.blocks.bakedmodel.BakedModelLoader;
//import com.example.rubymod.input.InputHandler;
//import com.example.rubymod.input.KeyBindings;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.obj.OBJLoader;
//import net.minecraftforge.client.model.ModelLoaderRegistry;
//import net.minecraftforge.client.model.obj.OBJLoader;
//import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.fml.common.event.FMLInitializationEvent;
//import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        
        OBJLoader.INSTANCE.addDomain(RubyMod.MODID);
        //ModelLoaderRegistry.registerLoader(new BakedModelLoader());
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
    	//ModBlocks.initModels();
        ModItems.initModels();
    }
}