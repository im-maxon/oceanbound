package net.maxon.oceanbound.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.maxon.oceanbound.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DREAM_COBBLESTONE)
                .add(ModBlocks.DREAM_STONE)
                .add(ModBlocks.DREAM_STONE_SLAB)
                .add(ModBlocks.DREAM_STONE_STAIRS)
                .add(ModBlocks.DREAM_STONE_WALL);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.DREAM_LOG)
                .add(ModBlocks.DREAM_WOOD)
                .add(ModBlocks.STRIPPED_DREAM_LOG)
                .add(ModBlocks.STRIPPED_DREAM_WOOD)
                .add(ModBlocks.DREAM_PLANKS);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.DREAM_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.DREAM_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(ModBlocks.DREAM_DOOR);
        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.DREAM_TRAP_DOOR);

        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(ModBlocks.DREAM_STONE)
                .add(ModBlocks.DREAM_GRASS);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.DREAM_PLANKS);

    }
}
