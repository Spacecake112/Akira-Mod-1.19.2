package net.space.akiramod.entity.client;

import net.minecraft.util.Identifier;
import net.space.akiramod.AkiraMod;
import net.space.akiramod.entity.custom.TokayGeckoEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TokayGeckoModel extends AnimatedGeoModel<TokayGeckoEntity> {
    @Override
    public Identifier getModelResource(TokayGeckoEntity object) {
        return new Identifier(AkiraMod.MOD_ID, "geo/tokaygecko.geo.json");
    }

    @Override
    public Identifier getTextureResource(TokayGeckoEntity object) {
        return new Identifier(AkiraMod.MOD_ID, "textures/entity/tokaygecko.png");
    }

    @Override
    public Identifier getAnimationResource(TokayGeckoEntity animatable) {
        return new Identifier(AkiraMod.MOD_ID, "animations/tokaygecko.animation.json");
    }
}
