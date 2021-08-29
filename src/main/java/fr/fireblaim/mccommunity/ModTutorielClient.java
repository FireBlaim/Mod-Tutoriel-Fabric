package fr.fireblaim.mccommunity;

import net.fabricmc.api.ClientModInitializer;

public class ModTutorielClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModTutoriel.LOGGER.info("Mod initialisé côté client !");
    }

}
