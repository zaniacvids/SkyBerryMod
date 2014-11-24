package com.swatkins.firstmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemKey extends Item {

	public ItemKey(String itemName)
	{
		setUnlocalizedName(FirstMod.MODID + "_" + itemName);
		setTextureName(FirstMod.MODID + ":" + itemName);
		setCreativeTab(CreativeTabs.tabMisc);
	}
}