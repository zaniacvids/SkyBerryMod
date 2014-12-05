package com.zaniacvids.firstmod.items;

import com.zaniacvids.firstmod.FirstMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBow;
import net.minecraft.util.IIcon;

public class DiamondBow extends ItemBow {
	
	public static final String[] bowPullIconNameArray = new String[] {"diamond_bow_pulling_0", "diamond_bow_pulling_1", "diamond_bow_pulling_2"};
    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;
    
	public DiamondBow()
	{
		setUnlocalizedName(FirstMod.MODID + "_" + "diamond_bow");
		//setTextureName(FirstMod.MODID + ":" + "diamond_bow");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister p_94581_1_)
    {
        this.itemIcon = p_94581_1_.registerIcon(FirstMod.MODID + ":" + "diamond_bow_standby");
        this.iconArray = new IIcon[bowPullIconNameArray.length];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = p_94581_1_.registerIcon(FirstMod.MODID + ":" + bowPullIconNameArray[i]);
        }
    }
}
