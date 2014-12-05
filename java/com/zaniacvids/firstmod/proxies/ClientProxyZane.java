package com.zaniacvids.firstmod.proxies;

import com.zaniacvids.firstmod.entities.ZaneMob.EntityZaneMob;
import com.zaniacvids.firstmod.entities.ZaneMob.RenderZaneMob;

import net.minecraft.client.model.ModelZombie;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxyZane extends CommonProxyZane {

	@Override
	public void registerRendering() {
		//RenderingRegistry.registerEntityRenderingHandler(EntityZaneMob.class, new RenderZaneMob(new ModelZaneMob(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityZaneMob.class, new RenderZaneMob(new ModelZombie(), 0.0F));
	}
	
}
