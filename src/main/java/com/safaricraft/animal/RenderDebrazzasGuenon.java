package com.safaricraft.animal;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDebrazzasGuenon extends RenderLiving<EntityDeBrazzaMonkey>{
	
    private ResourceLocation mobTexture = new ResourceLocation("ec:textures/entity/primate/dbguenon.png");
    
	public RenderDebrazzasGuenon(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
		super(rendermanagerIn, modelbaseIn, shadowsizeIn);
	}
	
    /**
     * Renders the desired {@code T} type Entity.
     */
    public void doRender(EntityDeBrazzaMonkey entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    /**
     * Allows the render to do state modifications necessary before the model is rendered.
     */
    protected void preRenderCallback(EntityDeBrazzaMonkey entitylivingbaseIn, float partialTickTime)
    {
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityDeBrazzaMonkey entity) {
		return mobTexture;
	}
}