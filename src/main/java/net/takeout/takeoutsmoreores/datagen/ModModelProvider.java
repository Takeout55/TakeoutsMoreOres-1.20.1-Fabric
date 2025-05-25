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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUBY_BLOCK);
        BlockStateModelGenerator.BlockTexturePool sapphirePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ZIRCON_BLOCK);
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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REFINED_DIAMOND_BLOCK);

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
        itemModelGenerator.regidter(ModItems.GLITCHITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_CHEESIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.THIMEITE, Models.GENERATED);

        
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

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_BOOTS));
    }
}
