/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mods.immortality_potion.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.mods.immortality_potion.procedures.ImmortalityEffectExpiresProcedure;
import net.mods.immortality_potion.potion.ImmortalityMobEffect;
import net.mods.immortality_potion.ImmortalityPotionMod;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber
public class ImmortalityPotionModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, ImmortalityPotionMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> IMMORTALITY = REGISTRY.register("immortality", ImmortalityMobEffect::new);

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.getEffect().is(IMMORTALITY)) {
			ImmortalityEffectExpiresProcedure.execute(entity);
		}
	}
}