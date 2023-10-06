package org.example.service;

import org.example.model.Value;
import org.example.tips.AdviceProvider;
import org.example.tips.GameAdvice;

import java.util.Random;
import java.util.Scanner;

public class GuessingServiceImpl implements GuessingService {
    private final int MAX = Value.MAX.getValue();
    private final int MIN = Value.MIN.getValue();
    private final Random random;
    private final Scanner scanner;
    private final AdviceProvider tips;

    public GuessingServiceImpl() {
        this.random = new Random();
        this.scanner = new Scanner(System.in);
        this.tips = new GameAdvice();
    }

    @Override
    public int randomNumbers(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    @Override
    public void askToPlay() {
        int target = randomNumbers(MIN, MAX);
        System.out.println("угадай число от 1 до 10");

        while (true) {
            int number = scanner.nextInt();

            if (number == target) {
                System.out.println("╰(▔∀▔)╯");
                System.out.println("Будешь угадывать? (да/нет)");

                break;
            } else {
                tips.provideAdviceToUser(number, target);
            }
        }
    }

    @Override
    public Boolean startGuessing() {
        System.out.println("Привет!\nБудешь угадывать? (да/нет)");

        while (true) {
            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals("нет")) {
                System.out.println("(¬_¬ )");
                return false;
            } else if (answer.equals("да")) {
                System.out.println("(⌒‿⌒)");
                askToPlay();
            } else {
                System.out.println("Некорректный ответ. Попробуйте снова.");
            }
        }
    }
}














