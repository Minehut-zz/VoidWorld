package com.minehut.voidworld;

/**
 * Created by Luke on 3/26/15.
 */

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class Generator extends ChunkGenerator
{
	VoidWorld plugin;

	public Generator(VoidWorld plugin)
	{
		this.plugin = plugin;
	}

	public byte[][] generateBlockSections(World world, Random random, int chunkX, int chunkZ, ChunkGenerator.BiomeGrid biomeGrid) {
		byte[][] result = new byte[world.getMaxHeight() / 16][];

		return result;
	}
	public Location getFixedSpawnLocation(World world, Random random) {
		return new Location(world, 0, 60, 0);
	}
	private void setBlock(byte[][] result, int x, int y, int z, byte blkid) {
		if (result[(y >> 4)] == null) {
			result[(y >> 4)] = new byte[4096];
		}
		result[(y >> 4)][((y & 0xF) << 8 | z << 4 | x)] = blkid;
	}
}
