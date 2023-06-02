package net.space.akiramod.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.space.akiramod.AkiraMod;
import net.space.akiramod.entity.custom.LeopardGeckoEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LeopardGeckoRenderer extends GeoEntityRenderer <LeopardGeckoEntity> {
    public LeopardGeckoRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new LeopardGeckoModel());
        this.shadowRadius = 0.25f;
        this.shadowOpacity = 0.85f;
    }

    @Override
    public Identifier getTextureResource(LeopardGeckoEntity animatable) {
        return new Identifier(AkiraMod.MOD_ID, "textures/entity/leopard_gecko.png");
    }

    @Override
    public RenderLayer getRenderType(LeopardGeckoEntity animatable, float partialTick, MatrixStack poseStack,
                                     VertexConsumerProvider bufferSource, VertexConsumer buffer,
                                     int packedLight, Identifier texture) {
        poseStack.scale(0.5f, 0.5f, 0.5f);


        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
