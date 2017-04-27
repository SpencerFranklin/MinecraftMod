package net.spencer.test.blocks;

import java.util.Random;

import akka.actor.FSM.Timer;
import akka.actor.LightArrayRevolverScheduler.TimerTask;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.spencer.test.Reference;
import net.spencer.test.init.ModBlocks;

public class BlockSpread extends Block {

	public BlockSpread() {
		super(Material.CACTUS);

		setUnlocalizedName(Reference.ModBlocks.SPREAD.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.SPREAD.getRegistryName());
		setHardness(1.0f);
		this.setTickRandomly(true);
	}

	@Override
	public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
		double d = Math.random();
		BlockPos p = pos;
		Random r = new Random();
		int res = r.nextInt(5 - 1) + 1;
		
		switch (res) {
			case 1:	 p = pos.east();

			case 2:	 p = pos.west();
			
			case 3:	 p = pos.north();			

			case 4:	 p = pos.south();
		}
		 
		if (d < 1) {
			if (worldIn.getBlockState(p).getBlock() != ModBlocks.spread) {
				worldIn.setBlockState(p, ModBlocks.spread.getDefaultState(), 3);
				worldIn.scheduleUpdate(p, worldIn.getBlockState(p).getBlock(), 0);
			}
		}
		
		if (d < .5) {
			if (d < .25){
				if (worldIn.getBlockState(pos.down()).getBlock() != ModBlocks.spread) {
					worldIn.setBlockState(pos.down(), ModBlocks.spread.getDefaultState(), 3);
					worldIn.scheduleUpdate(pos.down(), worldIn.getBlockState(pos.down()).getBlock(), 0);
				}
			} else {
				if (worldIn.getBlockState(pos.up()).getBlock() != ModBlocks.spread) {
					worldIn.setBlockState(pos.up(), ModBlocks.spread.getDefaultState(), 3);
					worldIn.scheduleUpdate(pos.up(), worldIn.getBlockState(pos.up()).getBlock(), 0);
				}
			}
			
		}

		this.updateTick(worldIn, pos, state, random);
	}

}
