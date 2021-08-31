package fr.fireblaim.mccommunity;

import fr.fireblaim.mccommunity.registers.ItemRegister;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModTutoriel implements ModInitializer {

    public static final String MODID = "modtutoriel";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    private ItemRegister itemRegister;

    @Override
    public void onInitialize() {
        itemRegister = new ItemRegister();
        itemRegister.registerItems();

        LOGGER.info("Mod initialisé !");
    }

}
