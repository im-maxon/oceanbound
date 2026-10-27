package net.maxon.oceanbound.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maxon.oceanbound.Oceanbound;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //blocks
    public static final Block DREAM_STONE = registerBlock("dream_stone",
            new Block(AbstractBlock.Settings.create().strength(2f, 10f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).requiresTool())
            );
    public static final Block DREAM_GRASS = registerBlock("dream_grass",
            new Block(AbstractBlock.Settings.create().strength(1.6f, 10f).sounds(BlockSoundGroup.ROOTED_DIRT).requiresTool())
    );




    //helper methods
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Oceanbound.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Oceanbound.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    //initialize
    public static void registerModBlocks() {
        Oceanbound.LOGGER.info("Registering Mod Blocks for " + Oceanbound.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(DREAM_STONE);
            entries.add(DREAM_GRASS);
        });
    }

}
