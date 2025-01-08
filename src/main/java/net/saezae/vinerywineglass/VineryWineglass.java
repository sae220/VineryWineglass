package net.saezae.vinerywineglass;

import net.fabricmc.api.ModInitializer;
import net.saezae.vinerywineglass.block.ModBlocks;
import net.saezae.vinerywineglass.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VineryWineglass implements ModInitializer {
	public static final String MODID = "vinerywineglass";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ModBlocks.initialize();
		ModItems.initialize();
	}
}
