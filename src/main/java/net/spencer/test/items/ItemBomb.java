package net.spencer.test.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.spencer.test.Reference;
import net.spencer.test.entity.EntityBomb;

public class ItemBomb extends Item {

	public ItemBomb(){
		super();
		setMaxStackSize(18);
		setUnlocalizedName(Reference.ModItems.BOMB.getUnlocalizedName());
		setRegistryName(Reference.ModItems.BOMB.getRegistryName());
	}
	
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {

		if (!world.isRemote)
		{
			world.spawnEntity(new EntityBomb(world, player));
		}

	return stack;
}
}
