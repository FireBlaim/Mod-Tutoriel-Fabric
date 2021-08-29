package fr.fireblaim.mccommunity;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModTutoriel implements ModInitializer {

    public static final String MODID = "modtutoriel";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    @Override
    public void onInitialize() {
        LOGGER.info("Mod initialisé !");
    }

}
