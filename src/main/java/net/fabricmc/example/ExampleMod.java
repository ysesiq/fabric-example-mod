package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;

import java.util.logging.Logger;

public class ExampleMod implements ModInitializer {
	public static Logger LOGGER = Logger.getLogger("modid");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
