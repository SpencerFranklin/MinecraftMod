package net.spencer.test.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.spencer.test.Reference;
import net.spencer.test.entity.EntityFireball;

public class ItemFireball extends Item {

	public ItemFireball() {
		super();
		setMaxStackSize(18);
		setUnlocalizedName(Reference.ModItems.FIREBALL.getUnlocalizedName());
		setRegistryName(Reference.ModItems.FIREBALL.getRegistryName());

	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

		ItemStack itemstack = playerIn.getHeldItem(handIn);

		if (!playerIn.capabilities.isCreativeMode) {
			itemstack.shrink(1);
		}

		if (!worldIn.isRemote) {
			EntityFireball entityfireball = new EntityFireball(worldIn, playerIn);
			EntityFireball.setHeadingFromThrower(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F,
					1.0F);
			worldIn.spawnEntity(entityfireball);
		}
		playerIn.addStat(StatList.getObjectUseStats(this));
		return new ActionResult(EnumActionResult.SUCCESS, itemstack);
	}
}
