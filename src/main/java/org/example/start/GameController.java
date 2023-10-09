package org.example.start;

import org.example.service.GuessingService;
import org.example.service.GuessingServiceImpl;
import org.example.sout.GameInteraction;
import org.example.sout.UserInteraction;

import java.util.Scanner;

public class GameController {
    private final GuessingService guessingService = new GuessingServiceImpl();
    private final GameInteraction userInteraction = new UserInteraction();
    private final Scanner scanner = new Scanner(System.in);

    public boolean startGuessing() {
        userInteraction.greeting();
        userInteraction.playAgain();

        while (true) {
            String answer = scanner.nextLine().toLowerCase();

            switch (answer) {
                case "нет":
                    userInteraction.sad();
                    return false;
                case "да":
                    userInteraction.happy();
                    guessingService.askToPlay();
                    userInteraction.playAgain();
                    continue;
                default:
                    userInteraction.error();
            }
        }
    }
}


