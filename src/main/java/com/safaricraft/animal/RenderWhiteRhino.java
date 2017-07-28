package com.safaricraft.animal;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWhiteRhino extends RenderLiving<EntityWhiteRhino> {

    public RenderWhiteRhino(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		// TODO Auto-generated constructor stub
	}

	private ResourceLocation mobTexture = new ResourceLocation("ec:textures/entity/preyanimal/whiterhino.png");


    public void doRender(EntityWhiteRhino entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    /** 
     * Allows the render to do state modifications necessary before the model is rendered.
     */
    protected void preRenderCallback(EntityWhiteRhino entitylivingbaseIn, float partialTickTime)
    {
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityWhiteRhino entity) {
		return mobTexture;
	}
}