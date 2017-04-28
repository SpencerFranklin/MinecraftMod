package net.spencer.test.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.spencer.test.init.ModBlocks;

public class EntityFireball extends EntityThrowable {

	public EntityFireball(World worldIn) {
		super(worldIn);
	}


	public EntityFireball(World worldIn, EntityLivingBase throwerIn)
	    {
	        super(worldIn, throwerIn);
	    }

	public EntityFireball(World worldIn, double x, double y, double z)
	    {
	        super(worldIn, x, y, z);
	    }

	/**
	 * Called when this EntityThrowable hits a block or entity.
	 */
	protected void onImpact(RayTraceResult result) {
		if (result.entityHit != null) {
			int i = 0;
			result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float) i);
			if(result.entityHit.isEntityAlive()) {
				result.entityHit.setFire(10);
			}
		}
		
		else if (!this.world.isRemote) {
			this.world.setEntityState(this, (byte) 3);
			this.setDead();
			BlockPos b = result.getBlockPos();
			BlockPos source = b.up();
			BlockPos w = source.west();
			BlockPos e = source.east();
			BlockPos n = source.north();
			BlockPos s = source.south();
			this.world.setBlockState(source, Blocks.FIRE.getDefaultState(), 3);
			this.world.setBlockState(w, Blocks.FIRE.getDefaultState(), 3);
			this.world.setBlockState(e, Blocks.FIRE.getDefaultState(), 3);
			this.world.setBlockState(s, Blocks.FIRE.getDefaultState(), 3);
			this.world.setBlockState(n, Blocks.FIRE.getDefaultState(), 3);

		}
	}
	
	 @SideOnly(Side.CLIENT)
	    public void handleStatusUpdate(byte id)
	    {
	        if (id == 3)
	        {
	            for (int i = 0; i < 8; ++i)
	            {
	                this.world.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D, new int[0]);
	                this.world.spawnParticle(EnumParticleTypes.LAVA, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D, new int[0]);

	            }
	        }
	    }
	 
	 //public static void registerFixesSnowball(DataFixer fixer)
	 //   {
	 //       EntityThrowable.registerFixesThrowable(fixer, "Snowball");
	 //   }
}
