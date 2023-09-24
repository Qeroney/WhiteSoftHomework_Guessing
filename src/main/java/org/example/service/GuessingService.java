package org.example.service;

public interface GuessingService {
    int randomNumbers(int max);

    void startGuess();

    void tips(int number, int rand);
}
