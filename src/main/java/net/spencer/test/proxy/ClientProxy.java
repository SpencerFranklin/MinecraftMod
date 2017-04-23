package net.spencer.test.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.spencer.test.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void preInit(){
		
	}
	
	@Override
	public void init(){
		ModItems.registerRenders();
	}
	
	@Override
	public void postInit(){
		
	}
	
}
