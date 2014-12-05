package com.zaniacvids.firstmod.items;

import com.zaniacvids.firstmod.FirstMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SkyBerryBunchFood extends ItemFood {

	private String name = "SkyBerryBunch";
	
	public SkyBerryBunchFood(int food, float saturation, boolean wolfFood)
	{
		super(food, saturation, wolfFood);
		setUnlocalizedName(FirstMod.MODID + "_" + name);
		setCreativeTab((CreativeTabs)null);
		setTextureName(FirstMod.MODID + ":" + name);
		setPotionEffect(Potion.jump.id, 20, 4, 1F);
		setAlwaysEdible();
	}
	
	@Override
	public void onFoodEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_)
	{
		super.onFoodEaten(p_77654_1_, p_77654_2_, p_77654_3_);
		p_77654_3_.addPotionEffect(new PotionEffect(Potion.confusion.id, 15 * 20, 10));
		p_77654_3_.addPotionEffect(new PotionEffect(Potion.hunger.id, 10 * 20, 10));
	}
	
}
