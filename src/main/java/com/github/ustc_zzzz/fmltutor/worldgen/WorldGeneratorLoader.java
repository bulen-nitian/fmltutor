package com.github.ustc_zzzz.fmltutor.worldgen;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldGeneratorLoader
{
    public static IWorldGenerator generatorGlowstone = new WorldGeneratorGlowstone();

    public WorldGeneratorLoader()
    {
        GameRegistry.registerWorldGenerator(generatorGlowstone, 1);
    }
}
