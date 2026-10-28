package net.mods.immortality_potion.procedures;

import net.minecraft.world.entity.Entity;

public class ImmortalityEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setInvulnerable(true);
	}
}