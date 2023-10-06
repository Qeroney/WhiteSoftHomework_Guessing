package org.example;

import org.example.start.GameController;

/**
 * todo: DRY, KISS, SOLID (точно можно на ООП-шить), и опечатки по мелочи
 */
public class Guessing {

    public static void main(String[] args) {

        GameController game = new GameController();

        game.start();

    }
}
