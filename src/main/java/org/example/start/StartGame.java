package org.example.start;

import org.example.service.GuessingService;
import org.example.service.GuessingServiceImpl;

import java.util.Scanner;

public class StartGame {
    private final Scanner scanner;
    private final GuessingService guessingService;

    public StartGame() {
        this.scanner = new Scanner(System.in);
        this.guessingService = new GuessingServiceImpl();
    }

    public void start() {
        System.out.println("Привет!\nБудешь угадывать? (да/нет)");

        while (true) {
            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals("нет")) {
                System.out.println("(¬_¬ )");
                break;
            } else if (answer.equals("да")) {
                System.out.println("(⌒‿⌒)");
                guessingService.startGuess();
            } else {
                System.out.println("Некорректный ответ. Попробуйте снова.");
            }
        }
    }
}
