package patterns.template.example1.Models;

import patterns.template.example1.Game;

public class FootballGame extends Game {

    public void initialize() {
        System.out.println("Football initializing...");
    }

    public void startPlay() {
        System.out.println("Football starting...");
    }

    public void endPlay() {
        System.out.println("Football ending...");
    }

    protected void addNewGameCharacterToTheGame() {

    }
}
