package patterns.command.example1.model;

import patterns.command.example1.interfaces.Command;

public class MarioLeftCommand implements Command {

    private MarioCharacterReciver marioCharacterReciver;

    public MarioLeftCommand(MarioCharacterReciver marioCharacterReciver) {
        this.marioCharacterReciver = marioCharacterReciver;
    }

    public void execute() {
        marioCharacterReciver.moveLeft();
    }
}
