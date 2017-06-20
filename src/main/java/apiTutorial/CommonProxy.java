package apiTutorial;

import apiTutorial.entity.EntityAIAvoidEntity;
import apiTutorial.entity.EntityImpala;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import obsidianAPI.ObsidianAPIUtil;
import obsidianAPI.animation.wrapper.FunctionAnimationWrapper.IsActiveFunction;
import obsidianAPI.registry.AnimationRegistry;

public class CommonProxy {

	private ResourceLocation ImpalaWalk = new ResourceLocation("mod_api_tutorial:animations/impala/Impala_walk.oba");
	private ResourceLocation impalaIdle = new ResourceLocation("mod_api_tutorial:animations/impala/Impala_idle.oba");

	public void init() 
	{	
		ModEntities.registerEntities();
		registerRendering();
		registerAnimations();
	}

	public void registerRendering() {}
	
	
	public void registerAnimations() {
		AnimationRegistry.init();
		
		IsActiveFunction isWalking = (entity) -> {
			return ObsidianAPIUtil.isEntityMoving(entity);
		};
		
		IsActiveFunction returnTrue = (entity) -> {
			return true;
		};
		
		

		
		AnimationRegistry.registerEntity(EntityImpala.class, "saiga");
		AnimationRegistry.registerAnimation("saiga", "walk", ImpalaWalk, 0, true, isWalking);
		AnimationRegistry.registerAnimation("saiga", "idle", impalaIdle, 50, true, returnTrue);
	}
	
}
