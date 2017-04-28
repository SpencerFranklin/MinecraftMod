package net.spencer.test.init;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.spencer.test.Reference;
import net.spencer.test.TestProject;
import net.spencer.test.entity.EntityBomb;
import net.spencer.test.entity.EntityFireball;

public class ModEntity {


	
	public static void register(){
		
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + "bomb.png"), EntityBomb.class, "Bomb", 0, TestProject.instance, 64, 10, true);	
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + "fireball.png"), EntityFireball.class, "Fireball", 0, TestProject.instance, 64, 10, true);

	}
}
