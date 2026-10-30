package net.maxon.oceanbound.world;

import net.maxon.oceanbound.Oceanbound;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModBiomes {
    public static final RegistryKey<Biome> FOHAD_KEY = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(Oceanbound.MOD_ID, "field_of_hopes_and_dreams"));
}
