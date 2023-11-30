package com.oskarjohansson.dungeonrun.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GameInitializer implements CommandLineRunner {

    private final MenuControl menuControl;

    @Autowired
    public GameInitializer(MenuControl menuControl){
        this.menuControl = menuControl;
    }

    @Override
    public void run(String... args) throws Exception {
        menuControl.startGame(menuControl);
    }
}
