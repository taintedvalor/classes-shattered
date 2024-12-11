package shatteredclasses.shatteredclasses.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import shatteredclasses.shatteredclasses.Classesshattered;

public class ModItems {


    //
    public static final Item class_shard = registerItem("class_shard", new Item(new FabricItemSettings().maxCount(16)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Classesshattered.MOD_ID, name), item);
    }

    public static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(class_shard);
    }


    public static void registerModItems() {
        Classesshattered.LOGGER.info("Registering Mod Items for " + Classesshattered.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
