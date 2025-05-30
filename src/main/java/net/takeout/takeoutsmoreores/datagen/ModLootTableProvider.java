package net.takeout.takeoutsmoreores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.takeout.takeoutsmoreores.block.ModBlocks;
import net.takeout.takeoutsmoreores.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RAW_RUBY_BLOCK);
        addDrop(ModBlocks.ZIRCON_BLOCK);
        addDrop(ModBlocks.RAW_SAPPHIRE_BLOCK);
        addDrop(ModBlocks.SAPPHIRE_BLOCK);
        addDrop(ModBlocks.REFINED_DIAMOND_BLOCK);
        addDrop(ModBlocks.THIMEITE_BLOCK);
        addDrop(ModBlocks.CHEESIUM_BLOCK);
        addDrop(ModBlocks.OCARITE_BLOCK);
        addDrop(ModBlocks.GLITCHITE_BLOCK);

        addDrop(ModBlocks.RUBY_STAIRS);
        addDrop(ModBlocks.RUBY_FENCE);
        addDrop(ModBlocks.RUBY_FENCE_GATE);
        addDrop(ModBlocks.RUBY_WALL);
        addDrop(ModBlocks.RUBY_BUTTON);
        addDrop(ModBlocks.RUBY_PRESSURE_PLATE);
        addDrop(ModBlocks.RUBY_TRAPDOOR);
        addDrop(ModBlocks.RUBY_DOOR, doorDrops(ModBlocks.RUBY_DOOR));
        addDrop(ModBlocks.RUBY_SLAB, slabDrops(ModBlocks.RUBY_SLAB));

        addDrop(ModBlocks.SAPPHIRE_STAIRS);
        addDrop(ModBlocks.SAPPHIRE_FENCE);
        addDrop(ModBlocks.SAPPHIRE_FENCE_GATE);
        addDrop(ModBlocks.SAPPHIRE_WALL);
        addDrop(ModBlocks.SAPPHIRE_BUTTON);
        addDrop(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
        addDrop(ModBlocks.SAPPHIRE_TRAPDOOR);
        addDrop(ModBlocks.SAPPHIRE_DOOR, doorDrops(ModBlocks.SAPPHIRE_DOOR));
        addDrop(ModBlocks.SAPPHIRE_SLAB, slabDrops(ModBlocks.SAPPHIRE_SLAB));

        addDrop(ModBlocks.RUBY_ORE, copperLikeOreDrops(ModBlocks.RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.NETHER_RUBY_ORE, copperLikeOreDrops(ModBlocks.NETHER_RUBY_ORE, ModItems.RAW_RUBY));
        addDrop(ModBlocks.END_STONE_RUBY_ORE, copperLikeOreDrops(ModBlocks.END_STONE_RUBY_ORE, ModItems.RAW_RUBY));

        addDrop(ModBlocks.GASNITE_ORE, copperLikeOreDrops(ModBlocks.GASNITE_ORE, ModItems.GASNITE));
        addDrop(ModBlocks.DEEPSLATE_GASNITE_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_GASNITE_ORE, ModItems.GASNITE));
        addDrop(ModBlocks.NETHER_GASNITE_ORE, copperLikeOreDrops(ModBlocks.NETHER_GASNITE_ORE, ModItems.GASNITE));
        addDrop(ModBlocks.END_STONE_GASNITE_ORE, copperLikeOreDrops(ModBlocks.END_STONE_GASNITE_ORE, ModItems.GASNITE));

        addDrop(ModBlocks.SAPPHIRE_ORE, copperLikeOreDrops(ModBlocks.SAPPHIRE_ORE, ModItems.RAW_SAPPHIRE));
        addDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModItems.RAW_SAPPHIRE));
        addDrop(ModBlocks.NETHER_SAPPHIRE_ORE, copperLikeOreDrops(ModBlocks.NETHER_SAPPHIRE_ORE, ModItems.RAW_SAPPHIRE));
        addDrop(ModBlocks.END_STONE_SAPPHIRE_ORE, copperLikeOreDrops(ModBlocks.END_STONE_SAPPHIRE_ORE, ModItems.RAW_SAPPHIRE));

        addDrop(ModBlocks.ZIRCON_ORE, copperLikeOreDrops(ModBlocks.ZIRCON_ORE, ModItems.RAW_ZIRCON));
        addDrop(ModBlocks.DEEPSLATE_ZIRCON_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_ZIRCON_ORE, ModItems.RAW_ZIRCON));
        addDrop(ModBlocks.NETHER_ZIRCON_ORE, copperLikeOreDrops(ModBlocks.NETHER_ZIRCON_ORE, ModItems.RAW_ZIRCON));
        addDrop(ModBlocks.END_STONE_ZIRCON_ORE, copperLikeOreDrops(ModBlocks.END_STONE_ZIRCON_ORE, ModItems.RAW_ZIRCON));

        addDrop(ModBlocks.GLITCHITE_ORE, copperLikeOreDrops(ModBlocks.GLITCHITE_ORE, ModItems.GLITCHITE));
        addDrop(ModBlocks.DEEPSLATE_GLITCHITE_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_GLITCHITE_ORE, ModItems.GLITCHITE));
        addDrop(ModBlocks.NETHER_GLITCHITE_ORE, copperLikeOreDrops(ModBlocks.NETHER_GLITCHITE_ORE, ModItems.GLITCHITE));
        addDrop(ModBlocks.END_STONE_GLITCHITE_ORE, copperLikeOreDrops(ModBlocks.END_STONE_GLITCHITE_ORE, ModItems.GLITCHITE));

        addDrop(ModBlocks.THIMEITE_ORE, copperLikeOreDrops(ModBlocks.THIMEITE_ORE, ModItems.THIMEITE));
        addDrop(ModBlocks.DEEPSLATE_THIMEITE_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_THIMEITE_ORE, ModItems.THIMEITE));
        addDrop(ModBlocks.NETHER_THIMEITE_ORE, copperLikeOreDrops(ModBlocks.NETHER_THIMEITE_ORE, ModItems.THIMEITE));
        addDrop(ModBlocks.END_STONE_THIMEITE_ORE, copperLikeOreDrops(ModBlocks.END_STONE_THIMEITE_ORE, ModItems.THIMEITE));

        addDrop(ModBlocks.OCARITE_ORE, copperLikeOreDrops(ModBlocks.OCARITE_ORE, ModItems.OCARITE));
        addDrop(ModBlocks.DEEPSLATE_OCARITE_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_OCARITE_ORE, ModItems.OCARITE));
        addDrop(ModBlocks.NETHER_OCARITE_ORE, copperLikeOreDrops(ModBlocks.NETHER_OCARITE_ORE, ModItems.OCARITE));
        addDrop(ModBlocks.END_STONE_OCARITE_ORE, copperLikeOreDrops(ModBlocks.END_STONE_OCARITE_ORE, ModItems.OCARITE));
    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(2.0f, 5.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
