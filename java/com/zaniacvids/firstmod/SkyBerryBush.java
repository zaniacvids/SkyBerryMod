package com.zaniacvids.firstmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SkyBerryBush extends Block {

	public SkyBerryBush()
	{
		super(Material.plants);
		setBlockName(FirstMod.MODID + "_" + "SkyBerryBush");
		setCreativeTab((CreativeTabs)null);
		setHardness(0.1F);
		setBlockBounds(0F, 0.0F, 0F, 1F, 0.25F, 1F);
		setStepSound(soundTypeGrass);
	}
}
