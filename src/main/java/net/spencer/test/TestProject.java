package net.spencer.test;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.spencer.test.init.ModBlocks;
import net.spencer.test.init.ModItems;
import net.spencer.test.init.ModRecepies;
import net.spencer.test.proxy.CommonProxy;
import net.spencer.test.proxy.ServerProxy;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, dependencies = Reference.DEPENDECIES)
public class TestProject {
	
	//Variables
	public static Random random = new Random();
	
	@Instance(Reference.MOD_ID)
	public static TestProject instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		System.out.println(Reference.MOD_NAME + ": PRE-INIT");
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		ModRecepies.addRecepies();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		System.out.println(Reference.MOD_NAME + ": INIT");
		proxy.init();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		System.out.println(Reference.MOD_NAME + ": POST-INIT");
	}
	
}
