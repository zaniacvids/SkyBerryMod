package com.zaniacvids.firstmod;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemSkyBerryBlueFood extends ItemFood {

	private String name = "SkyBerryBlue";
	
	public ItemSkyBerryBlueFood(int food, float saturation, boolean wolfFood)
	{
		super(food, saturation, wolfFood);
		setUnlocalizedName(FirstMod.MODID + "_" + name);
		setTextureName(FirstMod.MODID + ":" + name);
		setPotionEffect(Potion.jump.id, 20, 4, 1F);
		setAlwaysEdible();
	}
	
}
