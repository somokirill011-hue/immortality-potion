/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mods.immortality_potion.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.mods.immortality_potion.ImmortalityPotionMod;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

public class ImmortalityPotionModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, ImmortalityPotionMod.MODID);
	public static final DeferredHolder<Potion, Potion> IMMORTALITY_POTION = REGISTRY.register("immortality_potion", () -> new Potion(new MobEffectInstance(ImmortalityPotionModMobEffects.IMMORTALITY, 3600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> IMMORTALITY_POTION_1 = REGISTRY.register("immortality_potion_1", () -> new Potion(new MobEffectInstance(ImmortalityPotionModMobEffects.IMMORTALITY, 9600, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> IMMORTALITY_POTION_2 = REGISTRY.register("immortality_potion_2", () -> new Potion(new MobEffectInstance(ImmortalityPotionModMobEffects.IMMORTALITY, -1, 0, false, true)));
}