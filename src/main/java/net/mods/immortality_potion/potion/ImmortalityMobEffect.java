package net.mods.immortality_potion.potion;

import net.mods.immortality_potion.procedures.ImmortalityEffectStartedappliedProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ImmortalityMobEffect extends MobEffect {
	public ImmortalityMobEffect() {
		super(MobEffectCategory.NEUTRAL, -7722014);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		ImmortalityEffectStartedappliedProcedure.execute(entity);
	}
}