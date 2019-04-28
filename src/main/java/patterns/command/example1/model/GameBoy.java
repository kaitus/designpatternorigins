package patterns.command.example1.model;

import patterns.command.example1.interfaces.Command;

public class GameBoy {

    private Command UpCommand, DownCommand, LeftCommand, RightCommand;

    public GameBoy(Command upCommand, Command downCommand, Command leftCommand, Command rightCommand) {
        UpCommand = upCommand;
        DownCommand = downCommand;
        LeftCommand = leftCommand;
        RightCommand = rightCommand;
    }

    public void arrowUp() {
        UpCommand.execute();
    }

    public void arrowDown() {
        DownCommand.execute();
    }

    public void arrowleft() {
        LeftCommand.execute();
    }

    public void arrowRifht() {
        RightCommand.execute();
    }


}
