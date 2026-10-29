package net.maxon.oceanbound.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.maxon.oceanbound.Oceanbound;
import net.maxon.oceanbound.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup OCEANBOUND_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Oceanbound.MOD_ID, "oceanbound"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CINNAMON))
                    .displayName(Text.translatable("itemgroup.oceanbound.oceanbound"))
                    .entries((displayContext, entries) -> {


                        entries.add(ModItems.DETERMINATION);
                        entries.add(ModItems.CINNAMON);


                        entries.add(ModBlocks.DREAM_GRASS);

                        entries.add(ModBlocks.DREAM_STONE);
                        entries.add(ModBlocks.DREAM_STONE_STAIRS);
                        entries.add(ModBlocks.DREAM_STONE_SLAB);
                        entries.add(ModBlocks.DREAM_STONE_WALL);

                        entries.add(ModBlocks.DREAM_LOG);
                        entries.add(ModBlocks.DREAM_WOOD);
                        entries.add(ModBlocks.STRIPPED_DREAM_LOG);
                        entries.add(ModBlocks.STRIPPED_DREAM_WOOD);
                        entries.add(ModBlocks.DREAM_PLANKS);
                        entries.add(ModBlocks.DREAM_SAPLING);
                        entries.add(ModBlocks.DREAM_LEAVES);
                    })

                    .build()
            );



    public static void registerItemGroups() {
        Oceanbound.LOGGER.info("Registering Item Groups for " + Oceanbound.MOD_ID);
    }

}
