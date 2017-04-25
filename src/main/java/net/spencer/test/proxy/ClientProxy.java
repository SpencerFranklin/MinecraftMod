package net.spencer.test.proxy;

import net.spencer.test.init.ModBlocks;
import net.spencer.test.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void preInit(){
		
	}
	
	@Override
	public void init(){
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
	
	@Override
	public void postInit(){
		
	}
	
}
