package net.maxon.oceanbound.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.maxon.oceanbound.world.ModBiomes;
import net.maxon.oceanbound.world.ModPlacedFeatures;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.FOHAD_KEY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.DREAM_PLACED_KEY);
    }
}
