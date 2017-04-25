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

public class ItemMagicStick extends Item {
		
	public BlockPos[] posA = {new BlockPos(0,0,0), new BlockPos(0,0,0)};
	public int counter = 0;
	
	@Override
 	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
		if (!worldIn.isRemote){
			if (counter == 0){
				player.sendMessage(new TextComponentString("First Position = X: " + Float.toString(pos.getX()) + " Y: " + Float.toString(pos.getY()) + " Z: " + Float.toString(pos.getZ())));
				posA[0] = pos;
			}
			if (counter == 1){
				player.sendMessage(new TextComponentString("Second Position = X: " + Float.toString(pos.getX()) + " Y: " + Float.toString(pos.getY()) + " Z: " + Float.toString(pos.getZ())));
				posA[1] = pos;
			}
			
			counter++;
			if (counter > 1){
				counter = 0;
				player.sendMessage(new TextComponentString("Replacing Blocks"));
				int sX = 1, sY = 1, sZ = 1;

				if (((int)(posA[1].getX()) - (int)(posA[0].getX())) > 0)
					sX = -1;
				if (((int)(posA[1].getY()) - (int)(posA[0].getY())) > 0)
					sY = -1;
				if (((int)(posA[1].getZ()) - (int)(posA[0].getZ())) > 0)
					sZ = -1;

				for (int i = 0; i <= Math.abs((int)(posA[1].getX()) - (int)(posA[0].getX())); i++ ){	
					for (int j = 0; j <= Math.abs((int)(posA[1].getY()) - (int)(posA[0].getY())); j++ ){
						for (int k = 0; k <= Math.abs((int)(posA[1].getZ()) - (int)(posA[0].getZ())); k++ ){
								worldIn.destroyBlock(new BlockPos(i * sX + posA[1].getX(), j * sY + posA[1].getY(), k * sZ + posA[1].getZ()), true);
								//worldIn.setBlockState(new BlockPos(i * sX + posA[1].getX(), j * sY + posA[1].getY(), k * sZ + posA[1].getZ()), Blocks.AIR.getDefaultState());
								//worldIn.setBlockToAir(new BlockPos(i * sX + posA[1].getX(), j * sY + posA[1].getY(), k * sZ + posA[1].getZ()));
								player.sendMessage(new TextComponentString("rm block " + (i * sX + posA[1].getX()) + " " + (j * sY + posA[1].getY()) + " " + (k * sZ + posA[1].getZ())));
						}
					}
				}
			}
		}
        return EnumActionResult.PASS;
    }
	
	public ItemMagicStick() {
		setUnlocalizedName(Reference.ModItems.MAGICSTICK.getUnlocalizedName());
		setRegistryName(Reference.ModItems.MAGICSTICK.getRegistryName());
		this.setMaxStackSize(1);
	}
	
	
	
	
}
