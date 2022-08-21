package dev.proxyfox.mod.expedition.feature;

public interface FeatureInitializer {
	void initBlocks(String modid);
	void initItems(String modid);
	void initBiomes(String modid);
	void initOther(String modid);
}
