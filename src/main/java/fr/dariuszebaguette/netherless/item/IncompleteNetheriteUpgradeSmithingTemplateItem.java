
package fr.dariuszebaguette.netherless.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;

public class IncompleteNetheriteUpgradeSmithingTemplateItem extends SequencedAssemblyItem {
	public IncompleteNetheriteUpgradeSmithingTemplateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
