package patterns.command.example1;

import patterns.command.example1.model.*;

public class demo {

    public static void main(String[] args) {

        MarioCharacterReciver mario = new MarioCharacterReciver();
        mario.setName("Mario");

        KirbyCharacterReciver kirby = new KirbyCharacterReciver();
        kirby.setName("Kirby");

        //Commands
        MarioUpCommand marioUpCommand = new MarioUpCommand(mario);
        MarioDownCommand marioDownCommand = new MarioDownCommand(mario);
        MarioLeftCommand marioLeftCommand = new MarioLeftCommand(mario);
        MarioRightCommand marioRightCommand = new MarioRightCommand(mario);

        KirbyUpCommand kirbyUpCommand = new KirbyUpCommand(kirby);
        KirbyDownCommand kirbyDownCommand = new KirbyDownCommand(kirby);
        KirbyLeftCommand kirbyLeftCommand = new KirbyLeftCommand(kirby);
        KirbyRightCommand kirbyRightCommand = new KirbyRightCommand(kirby);


        //invoker
        GameBoy gameBoyMario = new GameBoy(marioUpCommand, marioDownCommand, marioLeftCommand, marioRightCommand);
        gameBoyMario.arrowUp();

        GameBoy gameBoyKirby = new GameBoy(kirbyUpCommand, kirbyDownCommand, kirbyLeftCommand, kirbyRightCommand);
        gameBoyKirby.arrowDown();
    }
}
