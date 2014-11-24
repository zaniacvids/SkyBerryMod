package com.swatkins.firstmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemKey extends Item {
	
	private String name = "key";

	public ItemKey()
	{
		setUnlocalizedName(FirstMod.MODID + "_" + name);
		setTextureName(FirstMod.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabMisc);
	}
}