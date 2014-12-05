package com.zaniacvids.firstmod.entities.ZaneMob;

import com.zaniacvids.firstmod.FirstMod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderZaneMob extends RenderLiving {

	public RenderZaneMob (ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation(FirstMod.MODID, "textures/models/ZaneMob.png");
	}
}
