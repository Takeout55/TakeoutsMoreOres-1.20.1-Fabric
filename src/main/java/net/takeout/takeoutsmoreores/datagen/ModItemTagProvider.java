package net.takeout.takeoutsmoreores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.takeout.takeoutsmoreores.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUBY_BOOTS,
                        ModItems.RUBY_CHESTPLATE,
                        ModItems.RUBY_HELMET,
                        ModItems.RUBY_LEGGINGS,
                        ModItems.SAPPHIRE_HELMET,
                        ModItems.SAPPHIRE_CHESTPLATE,
                        ModItems.SAPPHIRE_LEGGINGS,
                        ModItems.SAPPHIRE_BOOTS,

                        ModItems.REFINED_DIAMOND_HELMET,
                        ModItems.REFINED_DIAMOND_CHESTPLATE,
                        ModItems.REFINED_DIAMOND_LEGGINGS,
                        ModItems.REFINED_DIAMOND_BOOTS,

                        ModItems.OCARITE_HELMET,
                        ModItems.OCARITE_CHESTPLATE,
                        ModItems.OCARITE_LEGGINGS,
                        ModItems.OCARITE_BOOTS,

                        ModItems.ZIRCON_HELMET,
                        ModItems.ZIRCON_CHESTPLATE,
                        ModItems.ZIRCON_LEGGINGS,
                        ModItems.ZIRCON_BOOTS,

                        ModItems.GLITCHITE_HELMET,
                        ModItems.GLITCHITE_CHESTPLATE,
                        ModItems.GLITCHITE_LEGGINGS,
                        ModItems.GLITCHITE_BOOTS
                     );
    }
}