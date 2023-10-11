package org.example.tips;

import org.example.sout.GameInteraction;
import org.example.sout.UserInteraction;

public class GameAdvice implements AdviceProvider {

    private final GameInteraction userInteraction = new UserInteraction();

    int hotUpperBound = 5;
    int warmUpperBound = 2;

    @Override
    public void provideAdviceToUser(int number, int target) {
        int diff = Math.abs(number - target);

        if (diff > hotUpperBound) {
            userInteraction.printFreeze();

        } else if (diff > warmUpperBound) {
            userInteraction.printWarm();

        } else {
            userInteraction.printHot();
        }
    }
}
