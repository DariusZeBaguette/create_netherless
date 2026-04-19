
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.dariuszebaguette.netherless.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import fr.dariuszebaguette.netherless.item.NetheriteFragmentItem;
import fr.dariuszebaguette.netherless.item.IncompleteBlazeRodItem;
import fr.dariuszebaguette.netherless.item.EctoplasmItem;
import fr.dariuszebaguette.netherless.item.CoalRodItem;
import fr.dariuszebaguette.netherless.CreateNetherlessMod;

public class CreateNetherlessModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CreateNetherlessMod.MODID);
	public static final DeferredItem<Item> COAL_ROD = REGISTRY.register("coal_rod", CoalRodItem::new);
	public static final DeferredItem<Item> INCOMPLETE_BLAZE_ROD = REGISTRY.register("incomplete_blaze_rod", IncompleteBlazeRodItem::new);
	public static final DeferredItem<Item> ECTOPLASM = REGISTRY.register("ectoplasm", EctoplasmItem::new);
	public static final DeferredItem<Item> NETHERITE_FRAGMENT = REGISTRY.register("netherite_fragment", NetheriteFragmentItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
