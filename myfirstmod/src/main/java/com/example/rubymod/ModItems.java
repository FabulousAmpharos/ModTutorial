package com.example.rubymod;

import com.example.rubymod.items.SimpleTexturedItem;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    @GameRegistry.ObjectHolder("rubymod:simpletextureditem")
    public static SimpleTexturedItem simpleTexturedItem;
    
    @SideOnly(Side.CLIENT)
    public static void initModels() {
        simpleTexturedItem.initModel();
    }
}