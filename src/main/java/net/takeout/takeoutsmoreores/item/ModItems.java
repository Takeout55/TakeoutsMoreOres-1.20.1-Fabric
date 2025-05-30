package net.takeout.takeoutsmoreores.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.takeout.takeoutsmoreores.TakeoutsMoreOres;
import net.takeout.takeoutsmoreores.item.custom.MetalDetectorItem;
import net.takeout.takeoutsmoreores.sound.ModSounds;

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
    public static final Item METAL_ROD = registerItem("metal_rod", new Item(new FabricItemSettings()));
    public static final Item THIMEITE = registerItem("thimeite", new Item(new FabricItemSettings()));
    public static final Item GLITCHITE = registerItem("glitchite", new Item(new FabricItemSettings()));
    public static final Item OCARITE = registerItem("ocarite", new Item(new FabricItemSettings()));
    public static final Item CHEESIUM = registerItem("cheesium", new Item(new FabricItemSettings()));
    public static final Item RAW_CHEESIUM = registerItem("raw_cheesium", new Item(new FabricItemSettings()));
    public static final Item EARIUM = registerItem("earium", new Item(new FabricItemSettings()));
    public static final Item RAW_EARIUM = registerItem("raw_earium", new Item(new FabricItemSettings()));
    public static final Item PINKITE_INGOT = registerItem("pinkite_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_PINKITE = registerItem("raw_pinkite", new Item(new FabricItemSettings()));
    public static final Item ENDITE_INGOT = registerItem("endite_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_ENDITE = registerItem("raw_endite", new Item(new FabricItemSettings()));
    public static final Item VINYL_TEMPLATE = registerItem("vinyl_template", new Item(new FabricItemSettings()));

    public static final Item RUBY_STAFF = registerItem("ruby_staff", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item SAPPHIRE_STAFF = registerItem("sapphire_staff", new Item(new FabricItemSettings().maxCount(1)));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new PickaxeItem(ModToolMaterial.RUBY, 2, 2f,
            new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new AxeItem(ModToolMaterial.RUBY, 2, 2f,
            new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(ModToolMaterial.RUBY, 2, 2f,
            new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterial.RUBY, 2, 2f,
            new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new HoeItem(ModToolMaterial.RUBY, 2, 2f,
            new FabricItemSettings()));

    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe", new PickaxeItem(ModToolMaterial.SAPPHIRE, 2, 2f,
            new FabricItemSettings()));
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe", new AxeItem(ModToolMaterial.RUBY, 2, 2f,
            new FabricItemSettings()));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel", new ShovelItem(ModToolMaterial.SAPPHIRE, 2, 2f,
            new FabricItemSettings()));
    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword", new SwordItem(ModToolMaterial.SAPPHIRE, 2, 2f,
            new FabricItemSettings()));
    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe", new HoeItem(ModToolMaterial.SAPPHIRE, 2, 2f,
            new FabricItemSettings()));

    public static final Item REFINED_DIAMOND_PICKAXE = registerItem("refined_diamond_pickaxe", new PickaxeItem(ModToolMaterial.REFINED_DIAMOND, 2, 2f,
            new FabricItemSettings()));
    public static final Item REFINED_DIAMOND_AXE = registerItem("refined_diamond_axe", new AxeItem(ModToolMaterial.REFINED_DIAMOND, 2, 2f,
            new FabricItemSettings()));
    public static final Item REFINED_DIAMOND_SHOVEL = registerItem("refined_diamond_shovel", new ShovelItem(ModToolMaterial.REFINED_DIAMOND, 2, 2f,
            new FabricItemSettings()));
    public static final Item REFINED_DIAMOND_SWORD = registerItem("refined_diamond_sword", new SwordItem(ModToolMaterial.REFINED_DIAMOND, 2, 2f,
            new FabricItemSettings()));
    public static final Item REFINED_DIAMOND_HOE = registerItem("refined_diamond_hoe", new HoeItem(ModToolMaterial.REFINED_DIAMOND, 2, 2f,
            new FabricItemSettings()));

    public static final Item THIMEITE_SCYTHE = registerItem("thimeite_scythe", new SwordItem(ModToolMaterial.THIMEITE, 2, 2f,
            new FabricItemSettings()));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET,
            new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE,
            new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS,
            new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS,
            new FabricItemSettings()));

    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet", new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET,
            new FabricItemSettings()));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate", new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE,
            new FabricItemSettings()));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings", new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS,
            new FabricItemSettings()));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots", new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS,
            new FabricItemSettings()));

    public static final Item ZIRCON_HELMET = registerItem("zircon_helmet", new ArmorItem(ModArmorMaterials.ZIRCON, ArmorItem.Type.HELMET,
            new FabricItemSettings()));
    public static final Item ZIRCON_CHESTPLATE = registerItem("zircon_chestplate", new ArmorItem(ModArmorMaterials.ZIRCON, ArmorItem.Type.CHESTPLATE,
            new FabricItemSettings()));
    public static final Item ZIRCON_LEGGINGS = registerItem("zircon_leggings", new ArmorItem(ModArmorMaterials.ZIRCON, ArmorItem.Type.LEGGINGS,
            new FabricItemSettings()));
    public static final Item ZIRCON_BOOTS = registerItem("zircon_boots", new ArmorItem(ModArmorMaterials.ZIRCON, ArmorItem.Type.BOOTS,
            new FabricItemSettings()));

    public static final Item REFINED_DIAMOND_HELMET = registerItem("refined_diamond_helmet", new ArmorItem(ModArmorMaterials.REFINED_DIAMOND, ArmorItem.Type.HELMET,
            new FabricItemSettings()));
    public static final Item REFINED_DIAMOND_CHESTPLATE = registerItem("refined_diamond_chestplate", new ArmorItem(ModArmorMaterials.REFINED_DIAMOND, ArmorItem.Type.CHESTPLATE,
            new FabricItemSettings()));
    public static final Item REFINED_DIAMOND_LEGGINGS = registerItem("refined_diamond_leggings", new ArmorItem(ModArmorMaterials.REFINED_DIAMOND, ArmorItem.Type.LEGGINGS,
            new FabricItemSettings()));
    public static final Item REFINED_DIAMOND_BOOTS = registerItem("refined_diamond_boots", new ArmorItem(ModArmorMaterials.REFINED_DIAMOND, ArmorItem.Type.BOOTS,
            new FabricItemSettings()));

    public static final Item OCARITE_HELMET = registerItem("ocarite_helmet", new ArmorItem(ModArmorMaterials.OCARITE, ArmorItem.Type.HELMET,
            new FabricItemSettings()));
    public static final Item OCARITE_CHESTPLATE = registerItem("ocarite_chestplate", new ArmorItem(ModArmorMaterials.OCARITE, ArmorItem.Type.CHESTPLATE,
            new FabricItemSettings()));
    public static final Item OCARITE_LEGGINGS = registerItem("ocarite_leggings", new ArmorItem(ModArmorMaterials.OCARITE, ArmorItem.Type.LEGGINGS,
            new FabricItemSettings()));
    public static final Item OCARITE_BOOTS = registerItem("ocarite_boots", new ArmorItem(ModArmorMaterials.OCARITE, ArmorItem.Type.BOOTS,
            new FabricItemSettings()));

    public static final Item GLITCHITE_HELMET = registerItem("glitchite_helmet", new ArmorItem(ModArmorMaterials.GLITCHITE, ArmorItem.Type.HELMET,
            new FabricItemSettings()));
    public static final Item GLITCHITE_CHESTPLATE = registerItem("glitchite_chestplate", new ArmorItem(ModArmorMaterials.GLITCHITE, ArmorItem.Type.CHESTPLATE,
            new FabricItemSettings()));
    public static final Item GLITCHITE_LEGGINGS = registerItem("glitchite_leggings", new ArmorItem(ModArmorMaterials.GLITCHITE, ArmorItem.Type.LEGGINGS,
            new FabricItemSettings()));
    public static final Item GLITCHITE_BOOTS = registerItem("glitchite_boots", new ArmorItem(ModArmorMaterials.GLITCHITE, ArmorItem.Type.BOOTS,
            new FabricItemSettings()));

    public static final Item BAR_BRAWL_MUSIC_DISC = registerItem("bar_brawl_music_disc",
            new MusicDiscItem(7, ModSounds.BAR_BRAWL, new FabricItemSettings().maxCount(1), 122));
    public static final Item THIMEITE_MUSIC_DISC = registerItem("thimeite_music_disc",
            new MusicDiscItem(7, ModSounds.GOLDEN_ODYSSEY, new FabricItemSettings().maxCount(1), 287));


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
