package patterns.command.example1.model;

import patterns.command.example1.interfaces.Command;

public class MarioDownCommand implements Command {

    private MarioCharacterReciver marioCharacterReciver;

    public MarioDownCommand(MarioCharacterReciver marioCharacterReciver) {
        this.marioCharacterReciver = marioCharacterReciver;
    }

    public void execute() {
        marioCharacterReciver.moveDown();
    }
}
