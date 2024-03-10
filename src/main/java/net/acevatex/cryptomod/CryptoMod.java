package net.acevatex.cryptomod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CryptoMod implements ModInitializer {
	public static final String MOD_ID = "cryptomod";
    public static final Logger LOGGER = LoggerFactory.getLogger("cryptomod");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}