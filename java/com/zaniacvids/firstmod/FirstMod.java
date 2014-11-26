package com.zaniacvids.firstmod;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = FirstMod.MODID, version = FirstMod.VERSION)
public class FirstMod
{
    public static final String MODID = "zaniacvids_firstmod";
    public static final String VERSION = "1.0";
    
    public static ItemFood SkyBerryGreen;
    public static ItemFood SkyBerryBlue;
    public static ItemFood SkyBerryStem;
    public static Block SkyBerryBush;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	SkyBerryGreen = new ItemSkyBerryGreenFood(3, 0.3F, false);
    	SkyBerryBlue = new ItemSkyBerryBlueFood(3, 0.3F, false);
    	SkyBerryStem = new ItemSkyBerryStemFood(3, 0.3F, false);
		SkyBerryBush = new SkyBerryBush();
		
		GameRegistry.registerItem(SkyBerryGreen, "SkyBerryGreen");
		GameRegistry.registerItem(SkyBerryBlue, "SkyBerryBlue");
		GameRegistry.registerItem(SkyBerryStem, "SkyBerryStem");
		GameRegistry.registerBlock(SkyBerryBush, "SkyBerryBush");
    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	
    }
}
