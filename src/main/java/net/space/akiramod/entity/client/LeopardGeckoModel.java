package net.space.akiramod.entity.client;

import net.minecraft.util.Identifier;
import net.space.akiramod.AkiraMod;
import net.space.akiramod.entity.custom.LeopardGeckoEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LeopardGeckoModel extends AnimatedGeoModel <LeopardGeckoEntity> {
    @Override
    public Identifier getModelResource(LeopardGeckoEntity object) {
        return new Identifier(AkiraMod.MOD_ID, "geo/leopardgecko.geo.json");
    }

    @Override
    public Identifier getTextureResource(LeopardGeckoEntity object) {
        return new Identifier(AkiraMod.MOD_ID, "textures/entity/leopard_gecko.png");
    }

    @Override
    public Identifier getAnimationResource(LeopardGeckoEntity animatable) {
        return new Identifier(AkiraMod.MOD_ID, "animations/leopardgecko.animation.json");
    }


}
