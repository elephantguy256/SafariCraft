package apiTutorial;

import apiTutorial.entity.EntityImpala;
import apiTutorial.entity.ModelImpala;
import apiTutorial.entity.RenderImpala;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.util.ResourceLocation;
import obsidianAPI.file.importer.FileLoader;

public class ClientProxy extends CommonProxy {

	private ResourceLocation saigaModel = new ResourceLocation("mod_api_tutorial:models/impala/impala.obm");
	private ResourceLocation saigaTexture = new ResourceLocation("mod_api_tutorial:models/impala/texture.png");

	public void registerRendering()
	{
		RenderImpala saigaRenderer = new RenderImpala(FileLoader.loadModelFromResources("saiga", saigaModel, saigaTexture, ModelImpala.class));
		RenderingRegistry.registerEntityRenderingHandler(EntityImpala.class, saigaRenderer);
	}
	
	
}
