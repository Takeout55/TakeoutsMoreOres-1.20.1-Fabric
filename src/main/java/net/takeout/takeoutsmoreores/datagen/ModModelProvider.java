package net.takeout.takeoutsmoreores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.takeout.takeoutsmoreores.block.ModBlocks;
import net.takeout.takeoutsmoreores.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool rubyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);
        BlockStateModelGenerator.BlockTexturePool refdimPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REFINED_DIAMOND_BLOCK);
        BlockStateModelGenerator.BlockTexturePool glitchitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GLITCHITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool thimeitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.THIMEITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool sapphirePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SAPPHIRE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool zirconPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ZIRCON_BLOCK);
        BlockStateModelGenerator.BlockTexturePool ocaritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OCARITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool cheesiumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHEESIUM_BLOCK);
        BlockStateModelGenerator.BlockTexturePool eariumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EARIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GASNITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_GASNITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_GASNITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_GASNITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ZIRCON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_ZIRCON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_ZIRCON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_ZIRCON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLITCHITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_GLITCHITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_GLITCHITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_GLITCHITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.THIMEITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_THIMEITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_THIMEITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_THIMEITE_ORE);

        rubyPool.stairs(ModBlocks.RUBY_STAIRS);
        rubyPool.slab(ModBlocks.RUBY_SLAB);
        rubyPool.button(ModBlocks.RUBY_BUTTON);
        rubyPool.pressurePlate(ModBlocks.RUBY_PRESSURE_PLATE);
        rubyPool.fence(ModBlocks.RUBY_FENCE);
        rubyPool.fenceGate(ModBlocks.RUBY_FENCE_GATE);
        rubyPool.wall(ModBlocks.RUBY_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.RUBY_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RUBY_TRAPDOOR);

        sapphirePool.stairs(ModBlocks.SAPPHIRE_STAIRS);
        sapphirePool.slab(ModBlocks.SAPPHIRE_SLAB);
        sapphirePool.button(ModBlocks.SAPPHIRE_BUTTON);
        sapphirePool.pressurePlate(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
        sapphirePool.fence(ModBlocks.SAPPHIRE_FENCE);
        sapphirePool.fenceGate(ModBlocks.SAPPHIRE_FENCE_GATE);
        sapphirePool.wall(ModBlocks.SAPPHIRE_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.SAPPHIRE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SAPPHIRE_TRAPDOOR);

        refdimPool.stairs(ModBlocks.REFINED_DIAMOND_STAIRS);
        refdimPool.slab(ModBlocks.REFINED_DIAMOND_SLAB);
        refdimPool.button(ModBlocks.REFINED_DIAMOND_BUTTON);
        refdimPool.pressurePlate(ModBlocks.REFINED_DIAMOND_PRESSURE_PLATE);
        refdimPool.fence(ModBlocks.REFINED_DIAMOND_FENCE);
        refdimPool.fenceGate(ModBlocks.REFINED_DIAMOND_FENCE_GATE);
        refdimPool.wall(ModBlocks.REFINED_DIAMOND_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.REFINED_DIAMOND_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.REFINED_DIAMOND_TRAPDOOR);

        glitchitePool.stairs(ModBlocks.GLITCHITE_STAIRS);
        glitchitePool.slab(ModBlocks.GLITCHITE_SLAB);
        glitchitePool.button(ModBlocks.GLITCHITE_BUTTON);
        glitchitePool.pressurePlate(ModBlocks.GLITCHITE_PRESSURE_PLATE);
        glitchitePool.fence(ModBlocks.GLITCHITE_FENCE);
        glitchitePool.fenceGate(ModBlocks.GLITCHITE_FENCE_GATE);
        glitchitePool.wall(ModBlocks.GLITCHITE_WALL);
        //blockStateModelGenerator.registerDoor(ModBlocks.GLITCHITE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.GLITCHITE_TRAPDOOR);

        thimeitePool.stairs(ModBlocks.THIMEITE_STAIRS);
        thimeitePool.slab(ModBlocks.THIMEITE_SLAB);
        thimeitePool.button(ModBlocks.THIMEITE_BUTTON);
        thimeitePool.pressurePlate(ModBlocks.THIMEITE_PRESSURE_PLATE);
        thimeitePool.fence(ModBlocks.THIMEITE_FENCE);
        thimeitePool.fenceGate(ModBlocks.THIMEITE_FENCE_GATE);
        thimeitePool.wall(ModBlocks.THIMEITE_WALL);
        //blockStateModelGenerator.registerDoor(ModBlocks.THIMEITE_DOOR);
        //blockStateModelGenerator.registerTrapdoor(ModBlocks.THIMEITE_TRAPDOOR);

        zirconPool.stairs(ModBlocks.ZIRCON_STAIRS);
        zirconPool.slab(ModBlocks.ZIRCON_SLAB);
        zirconPool.button(ModBlocks.ZIRCON_BUTTON);
        zirconPool.pressurePlate(ModBlocks.ZIRCON_PRESSURE_PLATE);
        zirconPool.fence(ModBlocks.ZIRCON_FENCE);
        zirconPool.fenceGate(ModBlocks.ZIRCON_FENCE_GATE);
        zirconPool.wall(ModBlocks.ZIRCON_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.ZIRCON_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ZIRCON_TRAPDOOR);

        ocaritePool.stairs(ModBlocks.OCARITE_STAIRS);
        ocaritePool.slab(ModBlocks.OCARITE_SLAB);
        ocaritePool.button(ModBlocks.OCARITE_BUTTON);
        ocaritePool.pressurePlate(ModBlocks.OCARITE_PRESSURE_PLATE);
        ocaritePool.fence(ModBlocks.OCARITE_FENCE);
        ocaritePool.fenceGate(ModBlocks.OCARITE_FENCE_GATE);
        ocaritePool.wall(ModBlocks.OCARITE_WALL);
        //blockStateModelGenerator.registerDoor(ModBlocks.OCARITE_DOOR);
        //blockStateModelGenerator.registerTrapdoor(ModBlocks.OCARITE_TRAPDOOR);

        cheesiumPool.stairs(ModBlocks.CHEESIUM_STAIRS);
        cheesiumPool.slab(ModBlocks.CHEESIUM_SLAB);
        cheesiumPool.button(ModBlocks.CHEESIUM_BUTTON);
        cheesiumPool.pressurePlate(ModBlocks.CHEESIUM_PRESSURE_PLATE);
        cheesiumPool.fence(ModBlocks.CHEESIUM_FENCE);
        cheesiumPool.fenceGate(ModBlocks.CHEESIUM_FENCE_GATE);
        cheesiumPool.wall(ModBlocks.CHEESIUM_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.CHEESIUM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CHEESIUM_TRAPDOOR);

        eariumPool.stairs(ModBlocks.EARIUM_STAIRS);
        eariumPool.slab(ModBlocks.EARIUM_SLAB);
        eariumPool.button(ModBlocks.EARIUM_BUTTON);
        eariumPool.pressurePlate(ModBlocks.EARIUM_PRESSURE_PLATE);
        eariumPool.fence(ModBlocks.EARIUM_FENCE);
        eariumPool.fenceGate(ModBlocks.EARIUM_FENCE_GATE);
        eariumPool.wall(ModBlocks.EARIUM_WALL);
        blockStateModelGenerator.registerDoor(ModBlocks.EARIUM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.EARIUM_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.GASNITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COAL_BRIQUETTE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZIRCON, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ZIRCON, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_DIAMOND_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.EARIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_EARIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLITCHITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_CHEESIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.THIMEITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.OCARITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PINKITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ENDITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINKITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.VINYL_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.BAR_BRAWL_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.THIMEITE_MUSIC_DISC, Models.GENERATED);

        
        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.METAL_ROD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REFINED_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REFINED_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REFINED_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REFINED_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REFINED_DIAMOND_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUBY_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUBY_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUBY_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUBY_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SAPPHIRE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SAPPHIRE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SAPPHIRE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SAPPHIRE_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.REFINED_DIAMOND_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.REFINED_DIAMOND_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.REFINED_DIAMOND_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.REFINED_DIAMOND_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ZIRCON_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ZIRCON_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ZIRCON_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ZIRCON_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.OCARITE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.OCARITE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.OCARITE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.OCARITE_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.GLITCHITE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.GLITCHITE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.GLITCHITE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.GLITCHITE_BOOTS);
    }
}
