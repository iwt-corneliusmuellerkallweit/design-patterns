package Command.Lightbulb;

import Command.Command;

public class TurnLightOffCommand implements Command {
    Lightbulb lightbulb;

    public TurnLightOffCommand(Lightbulb lightbulb) {
        this.lightbulb = lightbulb;
    }

    public void execute() {
        lightbulb.turnOff();
    }
}
