package net.maxon.oceanbound.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.maxon.oceanbound.Oceanbound;
import net.maxon.oceanbound.block.ModBlocks;
import net.maxon.oceanbound.item.ModItems;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        //Dream Wood
        planksRecipe(ModBlocks.DREAM_PLANKS, ModBlocks.DREAM_LOG, exporter, "dream_planks_from_log");  //Planks
        planksRecipe(ModBlocks.DREAM_PLANKS, ModBlocks.DREAM_WOOD, exporter, "dream_planks_from_wood");  //Planks
        planksRecipe(ModBlocks.DREAM_PLANKS, ModBlocks.STRIPPED_DREAM_LOG, exporter, "dream_planks_from_stripped_log");  //Planks
        planksRecipe(ModBlocks.DREAM_PLANKS, ModBlocks.STRIPPED_DREAM_WOOD, exporter, "dream_planks_from_stripped_wood");  //Planks

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DREAM_SLAB, ModBlocks.DREAM_PLANKS);  //Plank Slab
        stairsRecipe(ModBlocks.DREAM_STAIRS, ModBlocks.DREAM_PLANKS, exporter);  //Plank Stairs

        fenceRecipe(ModBlocks.DREAM_FENCE, ModBlocks.DREAM_PLANKS, exporter);  //Plank Fence
        fenceGateRecipe(ModBlocks.DREAM_FENCE_GATE, ModBlocks.DREAM_PLANKS, exporter);  //Plank Fence Gate

        doorRecipe(ModBlocks.DREAM_DOOR, ModBlocks.DREAM_PLANKS, exporter);  //Plank Door
        trapdoorRecipe(ModBlocks.DREAM_TRAP_DOOR, ModBlocks.DREAM_PLANKS, exporter);  //Plank Trapdoor

        //-----------------

        //Dream Stone
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DREAM_STONE_SLAB, ModBlocks.DREAM_STONE);  //Stone Slab
        stairsRecipe(ModBlocks.DREAM_STONE_STAIRS, ModBlocks.DREAM_STONE, exporter);  //Stone Stairs
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DREAM_STONE_WALL, ModBlocks.DREAM_STONE);  //Stone Wall




    }




    public static void stairsRecipe(ItemConvertible output, ItemConvertible input, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .input('#', input)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void fenceRecipe(ItemConvertible output, ItemConvertible input, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 3)
                .input('#', input)
                .input('$', Items.STICK)
                .pattern("   ")
                .pattern("#$#")
                .pattern("#$#")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void fenceGateRecipe(ItemConvertible output, ItemConvertible input, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .input('$', input)
                .input('#', Items.STICK)
                .pattern("   ")
                .pattern("#$#")
                .pattern("#$#")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void doorRecipe(ItemConvertible output, ItemConvertible input, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 3)
                .input('#', input)
                .pattern("## ")
                .pattern("## ")
                .pattern("## ")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void trapdoorRecipe(ItemConvertible output, ItemConvertible input, RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 2)
                .input('#', input)
                .pattern("   ")
                .pattern("###")
                .pattern("###")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    public static void planksRecipe(ItemConvertible planks, ItemConvertible log, RecipeExporter exporter, String recipeid) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, planks, 4).input(log).criterion(hasItem(log), conditionsFromItem(log)).offerTo(exporter, Identifier.of(Oceanbound.MOD_ID, recipeid));
    }
}
