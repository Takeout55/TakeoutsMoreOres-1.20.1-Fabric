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

public class ModItemGroups {
    public static final ItemGroup MORE_ORES_ITEMS = Registry.register(Registries.ITEM_GROUP, new Identifier(TakeoutsMoreOres.MOD_ID, "more_ores_items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.more_ores_items"))
            .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                entries.add(ModItems.RUBY);
                entries.add(ModItems.RAW_RUBY);


            }).build());


    public static void registerItemGroups() {
        TakeoutsMoreOres.LOGGER.info("Registering Item Groups for " + TakeoutsMoreOres.MOD_ID);
    }
}