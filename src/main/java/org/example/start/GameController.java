package org.example.start;

import org.example.service.GuessingService;
import org.example.service.GuessingServiceImpl;
import org.example.sout.GameInteraction;
import org.example.sout.UserInteraction;

public class GameController {
    private final GuessingService guessingService;
    private final GameInteraction userInteraction;

    public GameController() {
        this.guessingService = new GuessingServiceImpl();
        this.userInteraction = new UserInteraction();
    }


    public boolean startGuessing() {
        userInteraction.greeting();
        userInteraction.startPlay();

        while (true) {
            String answer = userInteraction.getStringInput();

            switch (answer) {
                case "нет":
                    userInteraction.sad();
                    return false;
                case "да":
                    userInteraction.happy();
                    guessingService.askToPlay();
                    continue;
                default:
                    userInteraction.error();
            }
        }
    }
}


