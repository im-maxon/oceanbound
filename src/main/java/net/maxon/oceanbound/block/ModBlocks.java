package net.maxon.oceanbound.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maxon.oceanbound.Oceanbound;
import net.maxon.oceanbound.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //blocks
    public static final Block DREAM_GRASS = registerBlock("dream_grass",
            new Block(AbstractBlock.Settings.create().strength(1.6f, 10f).sounds(BlockSoundGroup.ROOTED_DIRT).requiresTool())
    );


    // dream stone blocks
    public static final Block DREAM_STONE = registerBlock("dream_stone",
            new Block(AbstractBlock.Settings.create().strength(2f, 10f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).requiresTool())
            );

    public static final Block DREAM_STONE_STAIRS = registerBlock("dream_stone_stairs",
            new StairsBlock(ModBlocks.DREAM_STONE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.6f,10f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).requiresTool())
            );

    public static final Block DREAM_STONE_SLAB = registerBlock("dream_stone_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.6f,10f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).requiresTool())
    );

    public static final Block DREAM_STONE_WALL = registerBlock("dream_stone_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.6f,10f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).requiresTool())
    );





    // dream wood
    public static final Block DREAM_LOG = registerBlock("dream_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block DREAM_WOOD = registerBlock("dream_wood", new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_DREAM_LOG = registerBlock("dream_log", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_DREAM_WOOD = registerBlock("stripped_dream_wood", new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block DREAM_PLANKS = registerBlock("dream_planks", new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block DREAM_LEAVES = registerBlock("dream_leaves", new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
    public static final Block DREAM_SAPLING = registerBlock("dream_sapling", new SaplingBlock(ModSaplingGenerators.DREAM, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));





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

    }

}
