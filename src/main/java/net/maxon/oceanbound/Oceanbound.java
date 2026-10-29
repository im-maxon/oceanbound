package net.maxon.oceanbound;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.maxon.oceanbound.block.ModBlocks;
import net.maxon.oceanbound.item.ModItemGroups;
import net.maxon.oceanbound.item.ModItems;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Oceanbound implements ModInitializer {
	public static final String MOD_ID = "oceanbound";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();


		StrippableBlockRegistry.register(ModBlocks.DREAM_LOG, ModBlocks.STRIPPED_DREAM_LOG);
		StrippableBlockRegistry.register(ModBlocks.DREAM_WOOD, ModBlocks.STRIPPED_DREAM_WOOD);


	}

}
