package fr.fireblaim.mccommunity;

import net.fabricmc.api.DedicatedServerModInitializer;

public class ModTutorielServer implements DedicatedServerModInitializer {

    @Override
    public void onInitializeServer() {
        //Nous pouvons ensuite mettre un message lors du lancement côté serveur !
        ModTutoriel.LOGGER.info("Mod initialisé côté serveur !");
    }

}
