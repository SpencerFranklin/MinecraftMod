package net.spencer.test.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import net.spencer.test.Reference;
import net.spencer.test.entity.EntityBomb;
import net.spencer.test.items.ItemBomb;
import net.spencer.test.items.ItemCheese;
import net.spencer.test.items.ItemCheeseStick;
import net.spencer.test.items.ItemMCBowl;
import net.spencer.test.items.ItemMagicStick;

public class ModItems {

	public static Item cheese, magic_stick, bomb, mcbowl, cheese_stick;

	public static void init () {
		cheese = new ItemCheese(5, 1, false).setAlwaysEdible();
		mcbowl = new ItemMCBowl(8, 1.5f, false).setAlwaysEdible();
		magic_stick = new ItemMagicStick();
		cheese_stick = new ItemCheeseStick();
		bomb = new ItemBomb();
	}
	
	public static void register () {
		GameRegistry.register(cheese);
		GameRegistry.register(magic_stick);
		GameRegistry.register(bomb);
		GameRegistry.register(mcbowl);
		GameRegistry.register(cheese_stick);

	}
	
	public static void registerRenders () {
		registerRender (cheese);
		registerRender (magic_stick);
		registerRender (bomb);
		registerRender (mcbowl);
		registerRender (cheese_stick);
		//RenderingRegistry.registerEntityRenderingHandler(entityClass, RenderSnowball());

	}
	
	private static void registerRender (Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
