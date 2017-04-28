package net.spencer.test;

public class Reference {
	public static final String MOD_ID = "cs4850_project_mod";
	public static final String MOD_NAME = "Building Game Engines: Final Project";
	public static final String VERSION = "1.0";
	public static final String DEPENDECIES = "required-after:forge@[13.20.0.2228,)";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";

	public static final String CLIENT_PROXY = "net.spencer.test.proxy.ClientProxy";
	public static final String SERVER_PROXY = "net.spencer.test.proxy.ServerProxy";

	public static enum ModItems {
		
		CHEESE("cheese", "cheese"),
		MAGICSTICK("magic_stick", "magic_stick"),
		BOMB("bomb", "bomb"),
		MCBOWL("mcbowl", "mcbowl"),
		CHEESESTICK("cheese_stick", "cheese_stick"),
		FILLSTICK("fill_stick", "fill_stick"),
		FIREBALL("fireball", "fireball");

		private String unlocalizedName;
		private String registryName;
		
		ModItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
	
public static enum ModBlocks {
		
		CHEESE("cheese", "cheese_block"),
		MPB("mpb", "mpb"),
		SPREAD("spread", "spread"), 
		EAT("eat", "eat");

		private String unlocalizedName;
		private String registryName;
		
		ModBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
}
