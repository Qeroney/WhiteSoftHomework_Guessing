package org.example.service;

import org.example.sout.GameInteraction;
import org.example.sout.UserInteraction;
import org.example.tips.AdviceProvider;
import org.example.tips.GameAdvice;

import java.util.Random;

public class GuessingServiceImpl implements GuessingService {
    private final int MAX = 10;
    private final int MIN = 1;
    private final Random random;
    private final AdviceProvider tips;
    private final GameInteraction userInteraction;

    public GuessingServiceImpl() {
        this.random = new Random();
        this.tips = new GameAdvice();
        this.userInteraction = new UserInteraction();
    }

    @Override
    public int randomNumbers(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    @Override
    public void askToPlay() {
        int target = randomNumbers(MIN, MAX);
        userInteraction.printGuessNumberPrompt();

        while (true) {
            int number = userInteraction.getUserInput();

            if (number == target) {
                userInteraction.success();
                break;
            } else {
                tips.provideAdviceToUser(number, target);
            }
        }
    }
}














