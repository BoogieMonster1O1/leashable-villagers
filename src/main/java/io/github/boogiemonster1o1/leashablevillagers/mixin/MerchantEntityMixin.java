package io.github.boogiemonster1o1.leashablevillagers.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.player.PlayerEntity;

@Mixin(MerchantEntity.class)
public class MerchantEntityMixin {
	/**
	 * @author me
	 * @reason yes
	 */
	@Overwrite
	public boolean canBeLeashedBy(PlayerEntity player) {
		return true; // overwrite go brr
	}
}
