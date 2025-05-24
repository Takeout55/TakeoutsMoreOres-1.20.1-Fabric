package net.takeout.takeoutsmoreores.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.takeout.takeoutsmoreores.TakeoutsMoreOres;
import net.takeout.takeoutsmoreores.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup MORE_ORES_ITEMS = Registry.register(Registries.ITEM_GROUP, new Identifier(TakeoutsMoreOres.MOD_ID, "more_ores_items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.more_ores_items"))
            .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                entries.add(ModItems.RUBY);
                entries.add(ModItems.REFINED_DIAMOND);
                entries.add(ModItems.REFINED_DIAMOND_SHARD);
                entries.add(ModItems.ZIRCON);
                entries.add(ModItems.SAPPHIRE);
                entries.add(ModItems.RAW_SAPPHIRE);
                entries.add(ModItems.RAW_ZIRCON);
                entries.add(ModItems.RAW_RUBY);
                entries.add(ModItems.GASNITE);
                entries.add(ModItems.COAL_BRIQUETTE);
                entries.add(ModItems.METAL_DETECTOR);
            }).build());


    public static final ItemGroup MORE_ORES_BLOCKS = Registry.register(Registries.ITEM_GROUP, new Identifier(TakeoutsMoreOres.MOD_ID, "more_ores_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.more_ores_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.RUBY_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.GASNITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_GASNITE_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_GASNITE_ORE);
                        entries.add(ModBlocks.END_STONE_RUBY_ORE);
                        entries.add(ModBlocks.END_STONE_GASNITE_ORE);
                    }).build());


    public static void registerItemGroups() {
        TakeoutsMoreOres.LOGGER.info("Registering Item Groups for " + TakeoutsMoreOres.MOD_ID);
    }
}
