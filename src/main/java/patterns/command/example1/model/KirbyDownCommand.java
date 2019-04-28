package patterns.command.example1.model;

import patterns.command.example1.interfaces.Command;

public class KirbyDownCommand implements Command {

    private KirbyCharacterReciver kirbyCharacterReciver;

    public KirbyDownCommand(KirbyCharacterReciver kirbyCharacterReciver) {
        this.kirbyCharacterReciver = kirbyCharacterReciver;
    }

    public void execute() {
        kirbyCharacterReciver.moveDown();
    }
}
