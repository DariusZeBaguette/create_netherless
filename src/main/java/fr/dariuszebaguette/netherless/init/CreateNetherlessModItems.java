
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.dariuszebaguette.netherless.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import fr.dariuszebaguette.netherless.item.NetheriteFragmentItem;
import fr.dariuszebaguette.netherless.item.IncompleteBlazeRodItem;
import fr.dariuszebaguette.netherless.item.EctoplasmItem;
import fr.dariuszebaguette.netherless.item.CoalRodItem;
import fr.dariuszebaguette.netherless.CreateNetherlessMod;

public class CreateNetherlessModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreateNetherlessMod.MODID);
	public static final RegistryObject<Item> COAL_ROD = REGISTRY.register("coal_rod", () -> new CoalRodItem());
	public static final RegistryObject<Item> INCOMPLETE_BLAZE_ROD = REGISTRY.register("incomplete_blaze_rod", () -> new IncompleteBlazeRodItem());
	public static final RegistryObject<Item> ECTOPLASM = REGISTRY.register("ectoplasm", () -> new EctoplasmItem());
	public static final RegistryObject<Item> NETHERITE_FRAGMENT = REGISTRY.register("netherite_fragment", () -> new NetheriteFragmentItem());
	// Start of user code block custom items
	// End of user code block custom items
}
