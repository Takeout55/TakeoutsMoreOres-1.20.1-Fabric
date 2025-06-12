package net.takeout.takeoutsmoreores.block;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
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
    public static final Block GLITCHITE_BLOCK = registerBlock("glitchite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block THIMEITE_BLOCK = registerBlock("thimeite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block OCARITE_BLOCK = registerBlock("ocarite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block CHEESIUM_BLOCK = registerBlock("cheesium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block EARIUM_BLOCK = registerBlock("earium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block REFINED_DIAMOND_BLOCK = registerBlock("refined_diamond_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));

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

    public static final Block ANCIENT_VOIDSTONE = registerBlock("ancient_voidstone",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS)));

    public static final Block GLITCHITE_ORE = registerBlock("glitchite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_GLITCHITE_ORE = registerBlock("deepslate_glitchite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block END_STONE_GLITCHITE_ORE = registerBlock("end_stone_glitchite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block NETHER_GLITCHITE_ORE = registerBlock("nether_glitchite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));

    public static final Block THIMEITE_ORE = registerBlock("thimeite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_THIMEITE_ORE = registerBlock("deepslate_thimeite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block END_STONE_THIMEITE_ORE = registerBlock("end_stone_thimeite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block NETHER_THIMEITE_ORE = registerBlock("nether_thimeite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));

    public static final Block OCARITE_ORE = registerBlock("ocarite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_OCARITE_ORE = registerBlock("deepslate_ocarite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block END_STONE_OCARITE_ORE = registerBlock("end_stone_ocarite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block NETHER_OCARITE_ORE = registerBlock("nether_ocarite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));

    public static final Block PLUNGITE_ORE = registerBlock("plungite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_PLUNGITE_ORE = registerBlock("deepslate_plungite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block END_STONE_PLUNGITE_ORE = registerBlock("end_stone_plungite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block NETHER_PLUNGITE_ORE = registerBlock("nether_plungite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));

    public static final Block CHEEKIUM_ORE = registerBlock("cheekium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_CHEEKIUM_ORE = registerBlock("deepslate_cheekium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block END_STONE_CHEEKIUM_ORE = registerBlock("end_stone_cheekium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block NETHER_CHEEKIUM_ORE = registerBlock("nether_cheekium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));

    public static final Block CHEESIUM_ORE = registerBlock("cheesium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_CHEESIUM_ORE = registerBlock("deepslate_cheesium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block END_STONE_CHEESIUM_ORE = registerBlock("end_stone_cheesium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block NETHER_CHEESIUM_ORE = registerBlock("nether_cheesium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE)));

    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
            new StairsBlock(ModBlocks.RUBY_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.RUBY_BLOCK)));
    public static final Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.RUBY_BLOCK)));
    public static final Block RUBY_DOOR = registerBlock("ruby_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.RUBY_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block RUBY_FENCE = registerBlock("ruby_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.RUBY_BLOCK)));
    public static final Block RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.RUBY_BLOCK), WoodType.ACACIA));
    public static final Block RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.RUBY_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block RUBY_BUTTON = registerBlock("ruby_button",
            new ButtonBlock(FabricBlockSettings.copyOf(ModBlocks.RUBY_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(ModBlocks.RUBY_BLOCK), BlockSetType.IRON));
    public static final Block RUBY_WALL = registerBlock("ruby_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.RUBY_BLOCK)));

    public static final Block SAPPHIRE_STAIRS = registerBlock("sapphire_stairs",
            new StairsBlock(ModBlocks.SAPPHIRE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.SAPPHIRE_BLOCK)));
    public static final Block SAPPHIRE_SLAB = registerBlock("sapphire_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.SAPPHIRE_BLOCK)));
    public static final Block SAPPHIRE_DOOR = registerBlock("sapphire_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.SAPPHIRE_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block SAPPHIRE_FENCE = registerBlock("sapphire_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.SAPPHIRE_BLOCK)));
    public static final Block SAPPHIRE_FENCE_GATE = registerBlock("sapphire_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.SAPPHIRE_BLOCK), WoodType.ACACIA));
    public static final Block SAPPHIRE_TRAPDOOR = registerBlock("sapphire_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.SAPPHIRE_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block SAPPHIRE_BUTTON = registerBlock("sapphire_button",
            new ButtonBlock(FabricBlockSettings.copyOf(ModBlocks.SAPPHIRE_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block SAPPHIRE_PRESSURE_PLATE = registerBlock("sapphire_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(ModBlocks.SAPPHIRE_BLOCK), BlockSetType.IRON));
    public static final Block SAPPHIRE_WALL = registerBlock("sapphire_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.SAPPHIRE_BLOCK)));

    public static final Block REFINED_DIAMOND_STAIRS = registerBlock("refined_diamond_stairs",
            new StairsBlock(ModBlocks.REFINED_DIAMOND_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.REFINED_DIAMOND_BLOCK)));
    public static final Block REFINED_DIAMOND_SLAB = registerBlock("refined_diamond_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.REFINED_DIAMOND_BLOCK)));
    public static final Block REFINED_DIAMOND_DOOR = registerBlock("refined_diamond_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.REFINED_DIAMOND_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block REFINED_DIAMOND_FENCE = registerBlock("refined_diamond_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.REFINED_DIAMOND_BLOCK)));
    public static final Block REFINED_DIAMOND_FENCE_GATE = registerBlock("refined_diamond_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.REFINED_DIAMOND_BLOCK), WoodType.ACACIA));
    public static final Block REFINED_DIAMOND_TRAPDOOR = registerBlock("refined_diamond_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.REFINED_DIAMOND_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block REFINED_DIAMOND_BUTTON = registerBlock("refined_diamond_button",
            new ButtonBlock(FabricBlockSettings.copyOf(ModBlocks.REFINED_DIAMOND_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block REFINED_DIAMOND_PRESSURE_PLATE = registerBlock("refined_diamond_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(ModBlocks.REFINED_DIAMOND_BLOCK), BlockSetType.IRON));
    public static final Block REFINED_DIAMOND_WALL = registerBlock("refined_diamond_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.REFINED_DIAMOND_BLOCK)));

    public static final Block GLITCHITE_STAIRS = registerBlock("glitchite_stairs",
            new StairsBlock(ModBlocks.GLITCHITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.GLITCHITE_BLOCK)));
    public static final Block GLITCHITE_SLAB = registerBlock("glitchite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.GLITCHITE_BLOCK)));
    public static final Block GLITCHITE_DOOR = registerBlock("glitchite_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.GLITCHITE_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block GLITCHITE_FENCE = registerBlock("glitchite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.GLITCHITE_BLOCK)));
    public static final Block GLITCHITE_FENCE_GATE = registerBlock("glitchite_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.GLITCHITE_BLOCK), WoodType.ACACIA));
    public static final Block GLITCHITE_TRAPDOOR = registerBlock("glitchite_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.GLITCHITE_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block GLITCHITE_BUTTON = registerBlock("glitchite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(ModBlocks.GLITCHITE_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block GLITCHITE_PRESSURE_PLATE = registerBlock("glitchite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(ModBlocks.GLITCHITE_BLOCK), BlockSetType.IRON));
    public static final Block GLITCHITE_WALL = registerBlock("glitchite_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.GLITCHITE_BLOCK)));

    public static final Block THIMEITE_STAIRS = registerBlock("thimeite_stairs",
            new StairsBlock(ModBlocks.THIMEITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.THIMEITE_BLOCK)));
    public static final Block THIMEITE_SLAB = registerBlock("thimeite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.THIMEITE_BLOCK)));
    public static final Block THIMEITE_DOOR = registerBlock("thimeite_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.THIMEITE_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block THIMEITE_FENCE = registerBlock("thimeite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.THIMEITE_BLOCK)));
    public static final Block THIMEITE_FENCE_GATE = registerBlock("thimeite_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.THIMEITE_BLOCK), WoodType.ACACIA));
    public static final Block THIMEITE_TRAPDOOR = registerBlock("thimeite_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.THIMEITE_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block THIMEITE_BUTTON = registerBlock("thimeite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(ModBlocks.THIMEITE_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block THIMEITE_PRESSURE_PLATE = registerBlock("thimeite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(ModBlocks.THIMEITE_BLOCK), BlockSetType.IRON));
    public static final Block THIMEITE_WALL = registerBlock("thimeite_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.THIMEITE_BLOCK)));

    public static final Block ZIRCON_STAIRS = registerBlock("zircon_stairs",
            new StairsBlock(ModBlocks.ZIRCON_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.ZIRCON_BLOCK)));
    public static final Block ZIRCON_SLAB = registerBlock("zircon_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.ZIRCON_BLOCK)));
    public static final Block ZIRCON_DOOR = registerBlock("zircon_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.ZIRCON_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block ZIRCON_FENCE = registerBlock("zircon_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.ZIRCON_BLOCK)));
    public static final Block ZIRCON_FENCE_GATE = registerBlock("zircon_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.ZIRCON_BLOCK), WoodType.ACACIA));
    public static final Block ZIRCON_TRAPDOOR = registerBlock("zircon_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.ZIRCON_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block ZIRCON_BUTTON = registerBlock("zircon_button",
            new ButtonBlock(FabricBlockSettings.copyOf(ModBlocks.ZIRCON_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block ZIRCON_PRESSURE_PLATE = registerBlock("zircon_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(ModBlocks.ZIRCON_BLOCK), BlockSetType.IRON));
    public static final Block ZIRCON_WALL = registerBlock("zircon_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.ZIRCON_BLOCK)));

    public static final Block OCARITE_STAIRS = registerBlock("ocarite_stairs",
            new StairsBlock(ModBlocks.OCARITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.OCARITE_BLOCK)));
    public static final Block OCARITE_SLAB = registerBlock("ocarite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.OCARITE_BLOCK)));
    public static final Block OCARITE_DOOR = registerBlock("ocarite_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.OCARITE_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block OCARITE_FENCE = registerBlock("ocarite_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.OCARITE_BLOCK)));
    public static final Block OCARITE_FENCE_GATE = registerBlock("ocarite_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.OCARITE_BLOCK), WoodType.ACACIA));
    public static final Block OCARITE_TRAPDOOR = registerBlock("ocarite_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.OCARITE_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block OCARITE_BUTTON = registerBlock("ocarite_button",
            new ButtonBlock(FabricBlockSettings.copyOf(ModBlocks.OCARITE_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block OCARITE_PRESSURE_PLATE = registerBlock("ocarite_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(ModBlocks.CHEESIUM_BLOCK), BlockSetType.IRON));
    public static final Block OCARITE_WALL = registerBlock("ocarite_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.OCARITE_BLOCK)));

    public static final Block CHEESIUM_STAIRS = registerBlock("cheesium_stairs",
            new StairsBlock(ModBlocks.CHEESIUM_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.CHEESIUM_BLOCK)));
    public static final Block CHEESIUM_SLAB = registerBlock("cheesium_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.CHEESIUM_BLOCK)));
    public static final Block CHEESIUM_DOOR = registerBlock("cheesium_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.CHEESIUM_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block CHEESIUM_FENCE = registerBlock("cheesium_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.CHEESIUM_BLOCK)));
    public static final Block CHEESIUM_FENCE_GATE = registerBlock("cheesium_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.CHEESIUM_BLOCK), WoodType.ACACIA));
    public static final Block CHEESIUM_TRAPDOOR = registerBlock("cheesium_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.CHEESIUM_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block CHEESIUM_BUTTON = registerBlock("cheesium_button",
            new ButtonBlock(FabricBlockSettings.copyOf(ModBlocks.CHEESIUM_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block CHEESIUM_PRESSURE_PLATE = registerBlock("cheesium_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(ModBlocks.CHEESIUM_BLOCK), BlockSetType.IRON));
    public static final Block CHEESIUM_WALL = registerBlock("cheesium_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.CHEESIUM_BLOCK)));

    public static final Block EARIUM_STAIRS = registerBlock("earium_stairs",
            new StairsBlock(ModBlocks.EARIUM_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.EARIUM_BLOCK)));
    public static final Block EARIUM_SLAB = registerBlock("earium_slab",
            new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.EARIUM_BLOCK)));
    public static final Block EARIUM_DOOR = registerBlock("earium_door",
            new DoorBlock(FabricBlockSettings.copyOf(ModBlocks.EARIUM_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block EARIUM_FENCE = registerBlock("earium_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ModBlocks.EARIUM_BLOCK)));
    public static final Block EARIUM_FENCE_GATE = registerBlock("earium_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(ModBlocks.EARIUM_BLOCK), WoodType.ACACIA));
    public static final Block EARIUM_TRAPDOOR = registerBlock("earium_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(ModBlocks.EARIUM_BLOCK).nonOpaque(), BlockSetType.IRON));
    public static final Block EARIUM_BUTTON = registerBlock("earium_button",
            new ButtonBlock(FabricBlockSettings.copyOf(ModBlocks.EARIUM_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block EARIUM_PRESSURE_PLATE = registerBlock("earium_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(ModBlocks.EARIUM_BLOCK), BlockSetType.IRON));
    public static final Block EARIUM_WALL = registerBlock("earium_wall",
            new WallBlock(FabricBlockSettings.copyOf(ModBlocks.EARIUM_BLOCK)));

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
