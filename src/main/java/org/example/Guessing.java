package org.example;

import org.example.start.StartGame;

/**
 * todo: DRY, KISS, SOLID (точно можно на ООП-шить), и опечатки по мелочи
 */
public class Guessing {

    public static void main(String[] args) {

        StartGame game = new StartGame();

        game.start();

    }
}
