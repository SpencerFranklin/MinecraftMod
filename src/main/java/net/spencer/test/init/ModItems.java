package net.spencer.test.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import net.spencer.test.Reference;
import net.spencer.test.items.ItemBomb;
import net.spencer.test.items.ItemCheese;
import net.spencer.test.items.ItemMagicStick;

public class ModItems {

	public static Item cheese;
	public static Item magic_stick;
	public static Item bomb;
	
	public static void init () {
		cheese = new ItemCheese(5, 1, false).setAlwaysEdible();
		magic_stick = new ItemMagicStick();
		bomb = new ItemBomb();
	}
	
	public static void register () {
		GameRegistry.register(cheese);
		GameRegistry.register(magic_stick);
		GameRegistry.register(bomb);

	}
	
	public static void registerRenders () {
		registerRender (cheese);
		registerRender (magic_stick);
		registerRender (bomb);

	}
	
	private static void registerRender (Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
