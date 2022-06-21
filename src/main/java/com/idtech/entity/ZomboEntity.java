package com.idtech.entity;

import com.idtech.BaseMod;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;


public class ZomboEntity extends Zombie {

    public static EntityType<ZomboEntity> TYPE = (EntityType<ZomboEntity>)
            EntityType.Builder.of(ZomboEntity::new, MobCategory.MONSTER)
                    .build("zombo")
            .setRegistryName(BaseMod.MODID, "zombo");
    public static Item EGG = EntityUtils.buildEntitySpawnEgg(TYPE, 0xb00101,
            0xacbf1f);


    public ZomboEntity(EntityType<? extends Zombie> type, Level level) {
        super(type, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MOVEMENT_SPEED, (double)0.23f)
                .add(Attributes.MAX_HEALTH, (double)100f)
                .add(Attributes.FOLLOW_RANGE, (double) 1000f)
                .add(Attributes.ATTACK_DAMAGE, (double) 1f)
                .add(Attributes.SPAWN_REINFORCEMENTS_CHANCE, (double)0.5f);
    }

    @Override
    public void registerGoals() {

        this.targetSelector.addGoal(0, new FloatGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, false));
        this.targetSelector.addGoal(3, new MeleeAttackGoal(this, 4f, false));
        this.targetSelector.addGoal(4, (new HurtByTargetGoal(this)).setAlertOthers(ZomboEntity.class));
        this.targetSelector.addGoal(8, new RandomLookAroundGoal(this));

    }







}
