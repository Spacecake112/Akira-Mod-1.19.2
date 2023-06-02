package net.space.akiramod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.space.akiramod.AkiraMod;
import net.space.akiramod.entity.custom.TokayGeckoEntity;
import net.space.akiramod.entity.custom.LeopardGeckoEntity;

public class ModEntities {
    public static final EntityType<LeopardGeckoEntity> LEOPARDGECKO = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(AkiraMod.MOD_ID, "leopardgecko"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, LeopardGeckoEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build());

    public static final EntityType<TokayGeckoEntity> TOKAYGECKO = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(AkiraMod.MOD_ID, "tokaygecko"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, TokayGeckoEntity::new)
                    .dimensions(EntityDimensions.fixed(0.7f, 2.625f)).build());

}
