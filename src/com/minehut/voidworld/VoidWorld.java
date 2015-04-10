package com.minehut.voidworld;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Luke on 3/26/15.
 */
public class VoidWorld extends JavaPlugin {
	Generator generator = new Generator(this);
	String[] worlds = new String[1000];
	int count;

	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id)
	{
		this.worlds[this.count] = worldName;
		this.count += 1;
		return this.generator;
	}
}
