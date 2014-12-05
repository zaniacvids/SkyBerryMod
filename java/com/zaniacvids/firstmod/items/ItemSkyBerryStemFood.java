package com.zaniacvids.firstmod.items;

import com.zaniacvids.firstmod.FirstMod;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemSkyBerryStemFood extends ItemFood {

	private String name = "SkyBerryStem";
	
	public ItemSkyBerryStemFood(int food, float saturation, boolean wolfFood)
	{
		super(food, saturation, wolfFood);
		setUnlocalizedName(FirstMod.MODID + "_" + name);
		setTextureName(FirstMod.MODID + ":" + name);
		setPotionEffect(Potion.confusion.id, 15, 10, 1F);
		setAlwaysEdible();
	}
	
}
