package patterns.command.example1.model;

import patterns.command.example1.interfaces.Command;

public class MarioRightCommand implements Command {

    private MarioCharacterReciver marioCharacterReciver;

    public MarioRightCommand(MarioCharacterReciver marioCharacterReciver) {
        this.marioCharacterReciver = marioCharacterReciver;
    }

    public void execute() {
        marioCharacterReciver.moveRight();
    }
}
