package patterns.strategy.example1;

import patterns.strategy.example1.controler.scoreBoard;
import patterns.strategy.example1.model.balloon;
import patterns.strategy.example1.model.clown;
import patterns.strategy.example1.model.squareBalloon;

public class demo {
    public static void main(String[] args) {
        scoreBoard scoreBoard = new scoreBoard();

        System.out.print("Balloon tap score: ");
        scoreBoard.algorithmBase = new balloon();
        scoreBoard.showScore(10, 5);

        System.out.print("Clown tap score: ");
        scoreBoard.algorithmBase = new clown();
        scoreBoard.showScore(10, 5);

        System.out.print("Square Balloon tap score: ");
        scoreBoard.algorithmBase = new squareBalloon();
        scoreBoard.showScore(10, 5);
    }
}
