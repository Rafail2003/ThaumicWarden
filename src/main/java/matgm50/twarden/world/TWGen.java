package matgm50.twarden.world;

import cpw.mods.fml.common.registry.GameRegistry;

public class TWGen {
	
public static void init() {
		
		GameRegistry.registerWorldGenerator(new TWFlowerGen(), 1);
		
	}
	
}
