package net.maxon.oceanbound.world.tree;

import net.maxon.oceanbound.Oceanbound;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import java.util.Optional;

public class ModSaplingGenerators {
    public static final RegistryKey<net.minecraft.world.gen.feature.ConfiguredFeature<?, ?>> DREAM_KEY =
            RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Oceanbound.MOD_ID, "dream_tree.json"));

    public static final SaplingGenerator DREAM = new SaplingGenerator(Oceanbound.MOD_ID + ":dream_tree.json",
            Optional.empty(), Optional.of(DREAM_KEY), Optional.empty()
    );
}
