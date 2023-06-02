package net.space.akiramod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.space.akiramod.entity.ModEntities;
import net.space.akiramod.entity.client.LeopardGeckoRenderer;
import net.space.akiramod.entity.client.TokayGeckoRenderer;

public class AkiraModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.LEOPARDGECKO, LeopardGeckoRenderer::new);
        EntityRendererRegistry.register(ModEntities.TOKAYGECKO, TokayGeckoRenderer::new);
    }
}
