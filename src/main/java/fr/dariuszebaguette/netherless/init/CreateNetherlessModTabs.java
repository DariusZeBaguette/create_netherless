
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.dariuszebaguette.netherless.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import fr.dariuszebaguette.netherless.CreateNetherlessMod;

public class CreateNetherlessModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateNetherlessMod.MODID);
	public static final RegistryObject<CreativeModeTab> CREATE_NETHERLESS_TAB = REGISTRY.register("create_netherless_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.create_netherless.create_netherless_tab")).icon(() -> new ItemStack(CreateNetherlessModItems.NETHERITE_FRAGMENT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreateNetherlessModItems.COAL_ROD.get());
				tabData.accept(CreateNetherlessModItems.NETHERITE_FRAGMENT.get());
			}).build());
}
