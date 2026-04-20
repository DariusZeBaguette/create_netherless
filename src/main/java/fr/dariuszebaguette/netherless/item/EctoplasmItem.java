
package fr.dariuszebaguette.netherless.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EctoplasmItem extends Item {
	public EctoplasmItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
