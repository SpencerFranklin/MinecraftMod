package net.spencer.test.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.spencer.test.Reference;


public class ItemMCBowl extends ItemFood {
	
	public ItemMCBowl(int healAmount, float saturation, boolean isWolfFood) {
		super(healAmount, saturation, isWolfFood);
		setUnlocalizedName(Reference.ModItems.MCBOWL.getUnlocalizedName());
		setRegistryName(Reference.ModItems.MCBOWL.getRegistryName());
		healAmount = 8;
		saturation = 1.5f;
		setMaxStackSize(1);
	}
	

	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
       super.onFoodEaten(stack, worldIn, player);
    }
}
