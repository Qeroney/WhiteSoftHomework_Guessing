package org.example.service;

import java.util.Random;
import java.util.Scanner;

public class GuessingServiceImpl implements GuessingService {

    private final Scanner scanner;

    public GuessingServiceImpl() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int randomNumbers(int max) {
        return new Random().nextInt(max) + 1;
    }

    @Override
    public void tips(int number, int rand) {

        if (number < 1 || number > 10) {
            System.out.println("Читать не умеешь?");

        } else if (Math.abs(number - rand) > 5) {
            System.out.println("Холодно");

        } else if (Math.abs(number - rand) > 2) {
            System.out.println("Тепло");

        } else {
            System.out.println("Жгётся!");
        }
    }

    @Override
    public void startGuess() {
        int rand = randomNumbers(10);
        System.out.println("угадай число от 1 до 10");

        while (true) {
            int number = scanner.nextInt();

            if (number == rand) {
                System.out.println("╰(▔∀▔)╯");
                System.out.println("Будешь угадывать? (да/нет)");

                break;
            } else {
                tips(number, rand);
            }
        }
    }
}


