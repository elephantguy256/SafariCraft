package com.safaricraft.animal;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHoneyBadger extends RenderLiving<EntityHoneyBadger> {
		
	    private ResourceLocation mobTexture = new ResourceLocation("ec:textures/entity/preyanimal/ratel.png");
	    
		public RenderHoneyBadger(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
			super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		}

	    /**
	     * Renders the desired {@code T} type Entity.
	     */
	    public void doRender(EntityHoneyBadger entity, double x, double y, double z, float entityYaw, float partialTicks)
	    {
	        super.doRender(entity, x, y, z, entityYaw, partialTicks);
	    }

	    /**
	     * Allows the render to do state modifications necessary before the model is rendered.
	     */
	    protected void preRenderCallback(EntityHoneyBadger entitylivingbaseIn, float partialTickTime)
	    {
	        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	    }

		@Override
		protected ResourceLocation getEntityTexture(EntityHoneyBadger entity) {
			return mobTexture;
		}
	}