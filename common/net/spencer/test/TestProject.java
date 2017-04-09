package net.spencer.test;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = TestProject.MOD_ID, name = TestProject.MOD_NAME, version = TestProject.VERSION, dependencies = TestProject.DEPENDECIES)
public class TestProject {

	public static final String MOD_ID = "test_mod";
	public static final String MOD_NAME = "My First Mod";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDECIES = "required-after:forge@[13.20.0.2228,)";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
	
	//Variables
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static TestProject instance;
	
	@SidedProxy(clientSide = "net.spencer.test.ClientProxy", serverSide = "net.spencer.test.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		proxy.preInit(event);
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
		proxy.init(event);

		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		proxy.postInit(event);

	}
	
}
