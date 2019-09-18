package com.example.rubymod.items;

import com.example.rubymod.RubyMod;

import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
//import net.minecraft.creativetab.CreativeTabs;	
//import net.minecraftforge.fml.common.registry.GameRegistry;

public class SimpleTexturedItem extends Item {

    public SimpleTexturedItem() {
        setRegistryName("simpletextureditem");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(RubyMod.MODID + ".simpletextureditem");     // Used for localization (en_US.lang)
        //setCreativeTab(CreativeTabs.MISC);
    }
    
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}