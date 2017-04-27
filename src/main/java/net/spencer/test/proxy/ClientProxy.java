package net.spencer.test.proxy;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.spencer.test.entity.EntityBomb;
import net.spencer.test.init.ModBlocks;
import net.spencer.test.init.ModEntity;
import net.spencer.test.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void preInit(){
		
	}
	
	@Override
	public void init(){
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModEntity.register();

	}
	
	@Override
	public void postInit(){
		
	}
	
}
