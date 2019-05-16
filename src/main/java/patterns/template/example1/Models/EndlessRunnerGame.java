package patterns.template.example1.Models;

import patterns.template.example1.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EndlessRunnerGame extends Game {

    public void initialize() {
        System.out.println("Endless Runner initializing...");
    }

    public void startPlay() {
        System.out.println("Endless Runner starting...");
        playerWantsNewCharacter();
    }

    public void endPlay() {
        System.out.println("Endless Runner ending...");
    }

    protected void addNewGameCharacterToTheGame() {
        System.out.println("Adding new character to the game");
    }

    public boolean playerWantsNewCharacter() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like to add a new character to the game? (y/n) ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ex) {
            System.out.println("IO Error");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
