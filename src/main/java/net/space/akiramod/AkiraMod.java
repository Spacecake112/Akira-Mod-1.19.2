package net.space.akiramod;


import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.space.akiramod.entity.ModEntities;
import net.space.akiramod.entity.custom.LeopardGeckoEntity;
import net.space.akiramod.entity.custom.TokayGeckoEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class AkiraMod implements ModInitializer {

	public static final String MOD_ID = "akiramod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		GeckoLib.initialize();

		FabricDefaultAttributeRegistry.register(ModEntities.LEOPARDGECKO, LeopardGeckoEntity.setAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.TOKAYGECKO, TokayGeckoEntity.setAttributes());
	}
}
