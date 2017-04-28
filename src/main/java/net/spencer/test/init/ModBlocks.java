package net.spencer.test.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import net.spencer.test.Reference;
import net.spencer.test.blocks.BlockCheese;
import net.spencer.test.blocks.BlockEat;
import net.spencer.test.blocks.MPB;
import net.spencer.test.blocks.BlockSpread;
import net.spencer.test.items.ItemCheese;

public class ModBlocks {
	public static Block cheese, mpb, spread, eat;
	
	public static void init () {
		cheese = new BlockCheese(ModItems.cheese, 1, 6);
		mpb = new MPB(ModItems.cheese, 1, 6);
		spread = new BlockSpread();
		eat = new BlockEat();
	}

	public static void register () {
		registerBlock (cheese);
		registerBlock(mpb);
		registerBlock (spread);
		registerBlock (eat);
	}
	
	public static void registerBlock (Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock (block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders () {
		registerRender (cheese);
		registerRender (mpb);
		registerRender (spread);
		registerRender (eat);
	}
	
	private static void registerRender (Block block) {
		System.out.println(block.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
