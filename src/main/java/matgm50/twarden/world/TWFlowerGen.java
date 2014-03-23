package matgm50.twarden.world;

import java.util.Random;

import matgm50.twarden.blocks.TWBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class TWFlowerGen implements IWorldGenerator {
	
	@Override
	public void generate(Random Random, int ChunkX, int ChunkZ, World World, IChunkProvider ChunkGenerator, IChunkProvider ChunkProvider) {
	    
		int Chance = Random.nextInt(2);
		
		for(int I = 0; I < Chance; I++) {
			
			int X = ChunkX * 16 + Random.nextInt(128);
		    int Z = ChunkZ * 16 + Random.nextInt(128);
		    int Y = World.getHeightValue(X, Z);
		    
			if (World.isAirBlock(X, Y, Z) && TWBlocks.TWFlower.canBlockStay(World, X, Y, Z) && Random.nextInt(100) <= 5) {
				
				World.setBlock(X, Y, Z, TWBlocks.TWFlower, 0, 2);
				
			}
			
		}
		
	}
	
}
