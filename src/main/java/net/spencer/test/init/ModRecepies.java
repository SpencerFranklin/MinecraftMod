package net.spencer.test.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
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
import net.spencer.test.items.ItemMagicStick;

public class ModRecepies {

	public static void addRecepies(){
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cheese, 1), new Object[] {"DDD", "DDD", "DDD", 'D', ModItems.cheese});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.mcbowl, 1), new Object[] {Items.BOWL, ModItems.cheese, Items.WHEAT});	
	}

}
