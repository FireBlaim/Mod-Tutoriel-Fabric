package fr.fireblaim.mccommunity.registers;

import fr.fireblaim.mccommunity.ModTutoriel;
import fr.fireblaim.mccommunity.items.ItemTutoriel;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegister {

    public void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(ModTutoriel.MODID, "item_tutoriel"), new ItemTutoriel());
    }

}
