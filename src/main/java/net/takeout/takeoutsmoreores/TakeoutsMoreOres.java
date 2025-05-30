package net.takeout.takeoutsmoreores;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.takeout.takeoutsmoreores.block.ModBlocks;
import net.takeout.takeoutsmoreores.item.ModItemGroups;
import net.takeout.takeoutsmoreores.item.ModItems;
import net.takeout.takeoutsmoreores.sound.ModSounds;
import net.takeout.takeoutsmoreores.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TakeoutsMoreOres implements ModInitializer {
	public static final String MOD_ID = "takeoutsmoreores";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
		ModLootTableModifiers.modifyLootTables();
		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
		FuelRegistry.INSTANCE.add(ModItems.GASNITE, 200);
		ModSounds.registerSounds();
	}
}