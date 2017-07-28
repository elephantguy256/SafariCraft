package com.safaricraft.animal;


import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import scala.tools.nsc.interpreter.IMain.Factory;

public class RenderAfricanBushElephant extends RenderLiving<EntityAfricanBushElephant>{
	
    public static final Factory FACTORY = new Factory();
    
	private ResourceLocation mobTexture = new ResourceLocation("ec:textures/entity/preyanimal/elephant.png");
    
    public RenderAfricanBushElephant(RenderManager rendermanagerIn, ModelAfricanBushElephant modelAfricanBushElephant, float f) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelAfricanBushElephant(), 0.5F);
    }
    /**
     * Renders the desired {@code T} type Entity.
     */
    public void doRender(EntityAfricanBushElephant entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    /**
     * Allows the render to do state modifications necessary before the model is rendered.
     */
    protected void preRenderCallback(EntityAfricanBushElephant entitylivingbaseIn, float partialTickTime)
    {
        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
    }

	@Override
	protected ResourceLocation getEntityTexture(EntityAfricanBushElephant entity) {
		return mobTexture;
	}
}