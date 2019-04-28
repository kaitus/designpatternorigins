package patterns.command.example1.model;

import patterns.command.example1.interfaces.Command;

public class KirbyRightCommand implements Command {

    private KirbyCharacterReciver kirbyCharacterReciver;

    public KirbyRightCommand(KirbyCharacterReciver kirbyCharacterReciver) {
        this.kirbyCharacterReciver = kirbyCharacterReciver;
    }

    public void execute() {
        kirbyCharacterReciver.moveRight();
    }
}
