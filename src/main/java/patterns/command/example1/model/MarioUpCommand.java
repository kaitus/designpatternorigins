package patterns.command.example1.model;

import patterns.command.example1.interfaces.Command;

public class MarioUpCommand implements Command {

    private  MarioCharacterReciver marioCharacterReciver;

    public MarioUpCommand(MarioCharacterReciver marioCharacterReciver) {
        this.marioCharacterReciver = marioCharacterReciver;
    }

    public void execute() {
        marioCharacterReciver.moveUp();
    }
}
