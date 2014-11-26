package com.zaniacvids.firstmod;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemSkyBerryGreenFood extends ItemFood {

	private String name = "SkyBerryGreen";
	
	public ItemSkyBerryGreenFood(int food, float saturation, boolean wolfFood)
	{
		super(food, saturation, wolfFood);
		setUnlocalizedName(FirstMod.MODID + "_" + name);
		setTextureName(FirstMod.MODID + ":" + name);
		setPotionEffect(Potion.hunger.id, 15, 10, 1F);
		setAlwaysEdible();
	}
	
}
