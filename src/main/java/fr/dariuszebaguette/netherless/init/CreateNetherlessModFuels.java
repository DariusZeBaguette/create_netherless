
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package fr.dariuszebaguette.netherless.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class CreateNetherlessModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == CreateNetherlessModItems.COAL_ROD.get())
			event.setBurnTime(2800);
	}
}
