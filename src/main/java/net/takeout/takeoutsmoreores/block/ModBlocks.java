package net.takeout.takeoutsmoreores.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.takeout.takeoutsmoreores.TakeoutsMoreOres;

public class ModBlocks {

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block ZIRCON_BLOCK = registerBlock("zircon_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block RAW_SAPPHIRE_BLOCK = registerBlock("raw_sapphire_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));

    public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));

    public static final Block END_STONE_RUBY_ORE = registerBlock("end_stone_ruby_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));

    public static final Block GASNITE_ORE = registerBlock("gasnite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

    public static final Block DEEPSLATE_GASNITE_ORE = registerBlock("deepslate_gasnite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));

    public static final Block NETHER_GASNITE_ORE = registerBlock("nether_gasnite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));

    public static final Block END_STONE_GASNITE_ORE = registerBlock("end_stone_gasnite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));

    public static final Block NETHER_SAPPHIRE_ORE = registerBlock("nether_sapphire_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));

    public static final Block END_STONE_SAPPHIRE_ORE = registerBlock("end_stone_sapphire_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));

    public static final Block ZIRCON_ORE = registerBlock("zircon_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

    public static final Block DEEPSLATE_ZIRCON_ORE = registerBlock("deepslate_zircon_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));

    public static final Block NETHER_ZIRCON_ORE = registerBlock("nether_zircon_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));

    public static final Block END_STONE_ZIRCON_ORE = registerBlock("end_stone_zircon_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TakeoutsMoreOres.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TakeoutsMoreOres.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TakeoutsMoreOres.LOGGER.info("Registering Mod Blocks");
    }
}
