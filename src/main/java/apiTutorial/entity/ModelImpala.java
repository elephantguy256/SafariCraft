package apiTutorial.entity;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.obj.WavefrontObject;
import obsidianAPI.render.ModelAnimated;

public class ModelImpala extends ModelAnimated {

	public ModelImpala(String entityName, WavefrontObject wavefrontObj, ResourceLocation textureLocation) {
		super(entityName, wavefrontObj, textureLocation);
	}

}
