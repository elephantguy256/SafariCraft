package com.safaricraft.animal;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBlackRhino extends RenderLiving<EntityBlackRhino> {

    public RenderBlackRhino(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		// TODO Auto-generated constructor stub
	}

	private ResourceLocation mobTexture = new ResourceLocation("ec:textures/entity/preyanimal/blackrhino.png");


    public void doRender(EntityBlackRhino entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    /**
     * Allows the render to do state modifications necessary before the model is rendered.
     */
    protected void preRenderCallback(EntityBlackRhino entitylivingbaseIn, float partialTickTime)
    {
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityBlackRhino entity) {
		return mobTexture;
	}
}