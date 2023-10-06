package org.example.start;

import org.example.service.GuessingService;
import org.example.service.GuessingServiceImpl;

public class GameController {
    private final GuessingService guessingService = new GuessingServiceImpl();

    public void start() {
        guessingService.startGuessing();
    }
}

