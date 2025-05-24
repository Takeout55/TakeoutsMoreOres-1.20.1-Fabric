package net.takeout.takeoutsmoreores;

import net.fabricmc.api.ModInitializer;

import net.takeout.takeoutsmoreores.item.ModItemGroups;
import net.takeout.takeoutsmoreores.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TakeoutsMoreOres implements ModInitializer {
	public static final String MOD_ID = "takeoutsmoreores";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		LOGGER.info("Hello Fabric world!");
	}
}