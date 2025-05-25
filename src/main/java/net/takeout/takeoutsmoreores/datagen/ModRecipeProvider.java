package net.takeout.takeoutsmoreores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.takeout.takeoutsmoreores.block.ModBlocks;
import net.takeout.takeoutsmoreores.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY,
            ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE, ModBlocks.NETHER_RUBY_ORE, ModBlocks.END_STONE_RUBY_ORE);

    private static final List<ItemConvertible> GASNITE_SMELTABLES = List.of(ModBlocks.GASNITE_ORE,
            ModBlocks.DEEPSLATE_GASNITE_ORE, ModBlocks.NETHER_GASNITE_ORE, ModBlocks.END_STONE_GASNITE_ORE);

    private static final List<ItemConvertible> SAPPHIRE_SMELTABLES = List.of(ModBlocks.SAPPHIRE_ORE,
            ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModBlocks.NETHER_SAPPHIRE_ORE, ModBlocks.END_STONE_SAPPHIRE_ORE, ModItems.RAW_SAPPHIRE);

    private static final List<ItemConvertible> ZIRCON_SMELTABLES = List.of(ModBlocks.ZIRCON_ORE,
            ModBlocks.DEEPSLATE_ZIRCON_ORE, ModBlocks.NETHER_ZIRCON_ORE, ModBlocks.END_STONE_ZIRCON_ORE, ModItems.RAW_ZIRCON);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 100, "ruby");
        offerSmelting(exporter, GASNITE_SMELTABLES, RecipeCategory.MISC, ModItems.GASNITE,
                0.7f, 200, "gasnite");
        offerBlasting(exporter, GASNITE_SMELTABLES, RecipeCategory.MISC, ModItems.GASNITE,
                0.7f, 100, "gasnite");
        offerSmelting(exporter, ZIRCON_SMELTABLES, RecipeCategory.MISC, ModItems.ZIRCON,
                0.7f, 200, "zircon");
        offerBlasting(exporter, ZIRCON_SMELTABLES, RecipeCategory.MISC, ModItems.ZIRCON,
                0.7f, 100, "zircon");
        offerSmelting(exporter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.ZIRCON,
                0.7f, 200, "sapphire");
        offerBlasting(exporter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.ZIRCON,
                0.7f, 100, "sapphire");


        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS,
                ModBlocks.RUBY_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_RUBY, RecipeCategory.DECORATIONS,
                ModBlocks.RAW_RUBY_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ZIRCON, RecipeCategory.DECORATIONS,
                ModBlocks.ZIRCON_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE, RecipeCategory.DECORATIONS,
                ModBlocks.SAPPHIRE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_SAPPHIRE, RecipeCategory.DECORATIONS,
                ModBlocks.RAW_SAPPHIRE_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.REFINED_DIAMOND, RecipeCategory.DECORATIONS,
                ModBlocks.REFINED_DIAMOND_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_RUBY, 1)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('R', ModItems.RUBY)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier("raw_ruby_from_crafting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REFINED_DIAMOND, 1)
                .pattern("DD")
                .pattern("DD")
                .input('D', ModItems.REFINED_DIAMOND_SHARD)
                .criterion(hasItem(ModItems.REFINED_DIAMOND_SHARD), conditionsFromItem(ModItems.REFINED_DIAMOND_SHARD))
                .offerTo(exporter, new Identifier("refined_diamond_from_shards"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.METAL_DETECTOR, 1)
                .pattern("S  ")
                .pattern(" S ")
                .pattern(" II")
                .input('S', Items.STICK)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("metal_detector_from_crafting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.REFINED_DIAMOND_SHARD, 1)
                .pattern("DDD")
                .pattern("DDD")
                .pattern("DDD")
                .input('D', Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier("refined_diamond_from_diamonds"));




        createStairsRecipe(ModBlocks.RUBY_STAIRS, Ingredient.ofItems(ModBlocks.RUBY_BLOCK)).criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.RUBY_STAIRS)));
    }
}
