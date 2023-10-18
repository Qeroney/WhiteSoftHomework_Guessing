package org.example.sout;

import java.util.Scanner;

public class UserInteraction implements GameInteraction {
    private static final String GUESS_NUMBER_PROMPT = "угадай число от 1 до 10";
    private static final String GREETING = "Привет!";
    private static final String SUCCESS_MESSAGE = "╰(▔∀▔)╯";
    private static final String PLAY_PROMPT = "Будешь угадывать? (да/нет)";
    private static final String PLAY_AGAIN_PROMPT = "Сыграем еще раз? (да/нет)";
    private static final String ERROR = "Некорректный ответ. Попробуйте снова.";
    private static final String HAPPY = "(⌒‿⌒)";
    private static final String SAD = "(¬_¬ )";
    private static final String FREEZE = "Холодно";
    private static final String HOT = "Жгётся!";
    private static final String WARM = "Тепло";

    private Scanner scanner = new Scanner(System.in);

    public void printGuessNumberPrompt() {
        System.out.println(GUESS_NUMBER_PROMPT);
    }

    public void playAgain() {
        System.out.println(PLAY_AGAIN_PROMPT);
    }

    public void printFreeze() {
        System.out.println(FREEZE);
    }

    public void printHot() {
        System.out.println(HOT);
    }

    public void printWarm() {
        System.out.println(WARM);
    }

    public void greeting() {
        System.out.println(GREETING);
    }

    public int getUserInput() {
        return scanner.nextInt();
    }

    public String getStringInput() {
        return scanner.nextLine().toLowerCase();
    }

    public void startPlay() {
        System.out.println(PLAY_PROMPT);
    }

    public void success() {
        System.out.println(SUCCESS_MESSAGE);
    }

    public void error() {
        System.out.println(ERROR);
    }

    public void happy() {
        System.out.println(HAPPY);
    }

    public void sad() {
        System.out.println(SAD);
    }
}
