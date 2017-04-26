package net.spencer.test.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.spencer.test.Reference;

public class ItemCheese extends ItemFood {

	public ItemCheese(int healAmount, float saturation, boolean isWolfFood) {
		super(healAmount, saturation, isWolfFood);
		setUnlocalizedName(Reference.ModItems.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.CHEESE.getRegistryName());
		healAmount = 5;
		saturation = 1f;
	}
	
	@Override
	public Item setMaxStackSize(int maxStackSize)
    {
        this.maxStackSize = 64;
        return this;
    }
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
       super.onFoodEaten(stack, worldIn, player);
    }
	
}
