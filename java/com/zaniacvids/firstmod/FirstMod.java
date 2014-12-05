package com.zaniacvids.firstmod;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.EnumHelper;

import com.zaniacvids.firstmod.blocks.SkyBerryBush;
import com.zaniacvids.firstmod.entities.ZaneMob.EntityZaneMob;
import com.zaniacvids.firstmod.items.DiamondBow;
import com.zaniacvids.firstmod.items.ItemSkyBerryBlueFood;
import com.zaniacvids.firstmod.items.ItemSkyBerryGreenFood;
import com.zaniacvids.firstmod.items.ItemSkyBerryStemFood;
import com.zaniacvids.firstmod.items.SkyBerryBunchFood;
import com.zaniacvids.firstmod.items.SkyBerrySeed;
import com.zaniacvids.firstmod.proxies.CommonProxyZane;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
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
    public static Item SkyBerrySeed;
    public static ItemFood SkyBerryBunch;
    
    public static Item DiamondArrow;
    public static Item DiamondBow;
    
    @SidedProxy(clientSide = "com.zaniacvids.firstmod.proxies.ClientProxyZane", serverSide = "com.zaniacvids.firstmod.proxies.CommonProxyZane")
    public static CommonProxyZane proxy;
    
    static int startEntityId = 300;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.registerRendering();
    	
    	/* ADD THE SKYBERRY ITEMS */
    	SkyBerryGreen = new ItemSkyBerryGreenFood(3, 0.3F, false);
    	SkyBerryBlue = new ItemSkyBerryBlueFood(3, 0.3F, false);
    	SkyBerryStem = new ItemSkyBerryStemFood(3, 0.3F, false);
		SkyBerryBush = new SkyBerryBush();
		SkyBerrySeed = new SkyBerrySeed(SkyBerryBush);
		SkyBerryBunch = new SkyBerryBunchFood(3, 0.3F, false);
		
		GameRegistry.registerItem(SkyBerryGreen, "SkyBerryGreen");
		GameRegistry.registerItem(SkyBerryBlue, "SkyBerryBlue");
		GameRegistry.registerItem(SkyBerryStem, "SkyBerryStem");
		GameRegistry.registerBlock(SkyBerryBush, "SkyBerryBush");
		GameRegistry.registerItem(SkyBerrySeed, "SkyBerrySeed");
		GameRegistry.registerItem(SkyBerryBunch, "SkyBerryBunch");
		
		GameRegistry.addShapelessRecipe(new ItemStack(FirstMod.SkyBerryBunch),
				FirstMod.SkyBerryBlue, FirstMod.SkyBerryGreen, FirstMod.SkyBerryStem
		);	
		
		/* ADD THE SKYBERRY ZOMBIE ENTITY */
		EntityRegistry.registerModEntity(EntityZaneMob.class, "zanemob", 0, this, 80, 3, true);
		registerEntityEgg(EntityZaneMob.class, 0xd8bb9d, 0xa63c1a);
		for (int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++) {
			if (BiomeGenBase.getBiomeGenArray()[i] != null) {
				EntityRegistry.addSpawn(EntityZaneMob.class, 10, 1, 5, EnumCreatureType.monster, BiomeGenBase.getBiomeGenArray()[i]);
			}
		}
		
		
		/* ADD THE DIAMOND BOW AND ARROW */
		//ToolMaterial diamondMaterial = EnumHelper.addToolMaterial("diamondMaterial", 3, 1000, 9.5F, 3.5F, 10);
		//DiamondBow = new DiamondBow();
		
		//GameRegistry.registerItem(DiamondBow, "DiamondBow"); 
    }
    
    @SuppressWarnings("unchecked")
    public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) {
    	int id = getUniqueEntityId();
    	EntityList.IDtoClassMapping.put(id, entity);
    	EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
    }
    
    public static int getUniqueEntityId() {
    	do {
    		startEntityId++;
    	} while (EntityList.getStringFromID(startEntityId) != null);
    	return startEntityId;
    }
}
