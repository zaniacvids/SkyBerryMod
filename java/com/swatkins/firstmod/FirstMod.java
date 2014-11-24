package com.swatkins.firstmod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = FirstMod.MODID, version = FirstMod.VERSION)
public class FirstMod
{
    public static final String MODID = "swatkins_firstmod";
    public static final String VERSION = "1.0";
    
    public static Item key;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		
    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ItemKey goldKey = new ItemKey("goldKey");
    	ItemKey key = new ItemKey("key");
    	
    	GameRegistry.registerItem(goldKey, "GoldKey");
    	GameRegistry.registerItem(key, "key");
    }
}