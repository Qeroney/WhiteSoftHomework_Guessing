package org.example.sout;

public interface GameInteraction {

    void printFreeze();

    void printWarm();

    void printHot();

    void playAgain();

    void printGuessNumberPrompt();

    void greeting();

    int getUserInput();

    String getStringInput();

    void startPlay();

    void success();

    void error();

    void happy();

    void sad();
}

