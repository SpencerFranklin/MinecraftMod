package net.spencer.test.proxy;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.spencer.test.entity.EntityBomb;
import net.spencer.test.init.ModBlocks;
import net.spencer.test.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void preInit(){
		
	}
	
	@Override
	public void init(){
		EntityRegistry.registerModEntity(new ResourceLocation("cs4850_project_mod:items/bomb"), EntityBomb.class, "Bomb", 0, this, 64, 10, true);		
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
	
	@Override
	public void postInit(){
		
	}
	
}
