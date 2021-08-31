package fr.fireblaim.mccommunity.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemTutoriel extends Item {

    public ItemTutoriel() {
        super(new Settings().maxCount(1).group(ItemGroup.MATERIALS));
    }
}
