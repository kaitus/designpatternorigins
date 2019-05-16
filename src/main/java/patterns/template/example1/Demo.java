package patterns.template.example1;

import patterns.template.example1.Models.EndlessRunnerGame;
import patterns.template.example1.Models.FootballGame;

public class Demo {

    public static void main(String[] args) {
        System.out.println("template design pattern");

        Game game = new FootballGame();
//        game.play();

        System.out.println("========");
        game = new EndlessRunnerGame();
        game.play();
    }
}
