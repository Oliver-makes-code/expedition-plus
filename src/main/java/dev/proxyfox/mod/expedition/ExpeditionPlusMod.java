package dev.proxyfox.mod.expedition;

import dev.proxyfox.mod.expedition.feature.FeatureInitializer;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.QuiltLoader;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExpeditionPlusMod implements ModInitializer {
	public static final String modid = "expedition";
	public static final Logger logger = LoggerFactory.getLogger(modid);

	@Override
	public void onInitialize(ModContainer mod) {
		var entrypoints = QuiltLoader.getEntrypoints("expedition-feature-init", FeatureInitializer.class);
		for (var entrypoint : entrypoints) {
			entrypoint.initBlocks(modid);
			entrypoint.initItems(modid);
			entrypoint.initBiomes(modid);
			entrypoint.initOther(modid);
		}
	}
}
