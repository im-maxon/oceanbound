package net.maxon.oceanbound.world.tree;

import net.maxon.oceanbound.Oceanbound;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import java.util.Optional;

import static net.maxon.oceanbound.world.ModConfiguredFeatures.DREAM_KEY;

public class ModSaplingGenerators {


    public static final SaplingGenerator DREAM = new SaplingGenerator(Oceanbound.MOD_ID + ":dream_tree.json",
            Optional.empty(), Optional.of(DREAM_KEY), Optional.empty()
    );
}
