package patterns.command.example1.model;

import patterns.command.example1.interfaces.Command;

public class KirbyLeftCommand implements Command {

    private KirbyCharacterReciver kirbyCharacterReciver;

    public KirbyLeftCommand(KirbyCharacterReciver kirbyCharacterReciver) {
        this.kirbyCharacterReciver = kirbyCharacterReciver;
    }

    public void execute() {
        kirbyCharacterReciver.moveLeft();
    }
}
