package net.takeout.takeoutsmoreores.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.takeout.takeoutsmoreores.TakeoutsMoreOres;
import net.takeout.takeoutsmoreores.item.custom.MetalDetectorItem;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item GASNITE = registerItem("gasnite", new Item(new FabricItemSettings()));
    public static final Item COAL_BRIQUETTE = registerItem("coal_briquette", new Item(new FabricItemSettings()));
    public static final Item REFINED_DIAMOND = registerItem("refined_diamond", new Item(new FabricItemSettings()));
    public static final Item REFINED_DIAMOND_SHARD = registerItem("refined_diamond_shard", new Item(new FabricItemSettings()));
    public static final Item ZIRCON = registerItem("zircon", new Item(new FabricItemSettings()));
    public static final Item RAW_ZIRCON = registerItem("raw_zircon", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item RAW_SAPPHIRE = registerItem("raw_sapphire", new Item(new FabricItemSettings()));

    public static final Item RUBY_STAFF = registerItem("ruby_staff", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item SAPPHIRE_STAFF = registerItem("sapphire_staff", new Item(new FabricItemSettings().maxCount(1)));

    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem
            (new FabricItemSettings().maxDamage(64)));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }

    private static final Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TakeoutsMoreOres.MOD_ID, name), item);
    }


    public static void registerModItems() {
        TakeoutsMoreOres.LOGGER.info("Registring Mod Items for" + TakeoutsMoreOres.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
