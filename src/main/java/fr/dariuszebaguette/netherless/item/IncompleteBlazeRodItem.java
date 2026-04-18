
package fr.dariuszebaguette.netherless.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IncompleteBlazeRodItem extends Item {
	public IncompleteBlazeRodItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
