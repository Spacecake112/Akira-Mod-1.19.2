package net.space.akiramod.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.space.akiramod.AkiraMod;
import net.space.akiramod.entity.custom.TokayGeckoEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TokayGeckoRenderer extends GeoEntityRenderer<TokayGeckoEntity> {
    public TokayGeckoRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new TokayGeckoModel());
        this.shadowRadius = 0.4f;
        this.shadowOpacity = 0.85f;
    }

    @Override
    public Identifier getTextureResource(TokayGeckoEntity animatable) {
        return new Identifier(AkiraMod.MOD_ID, "textures/entity/tokaygecko.png");
    }

    @Override
    public RenderLayer getRenderType(TokayGeckoEntity animatable, float partialTick, MatrixStack poseStack,
                                     VertexConsumerProvider bufferSource, VertexConsumer buffer,
                                     int packedLight, Identifier texture) {
            poseStack.scale(0.75f, 0.75f, 0.75f);


        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
