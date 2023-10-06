package org.example.tips;

public class GameAdvice implements AdviceProvider {

    int hotUpperBound = 5;
    int warmUpperBound = 2;

    @Override
    public void provideAdviceToUser(int number, int target) {
        int diff = Math.abs(number - target);

        if (diff > hotUpperBound) {
            System.out.println("Холодно");

        } else if (diff > warmUpperBound) {
            System.out.println("Тепло");

        } else {
            System.out.println("Жгётся!");
        }
    }
}
