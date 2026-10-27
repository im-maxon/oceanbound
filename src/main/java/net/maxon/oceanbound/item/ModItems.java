package net.maxon.oceanbound.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maxon.oceanbound.Oceanbound;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //items
    public static final Item CINNAMON = registerItem("cinnamon", new Item(new Item.Settings()));
    public static final Item DETERMINATION = registerItem("determination", new Item(new Item.Settings()));








    //helper method
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Oceanbound.MOD_ID, name), item);
    }

    // registry!!
    public static void registerModItems() {
        Oceanbound.LOGGER.info("Registering Mod Items for " + Oceanbound.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CINNAMON);
            entries.add(DETERMINATION);
        });
    }


}
