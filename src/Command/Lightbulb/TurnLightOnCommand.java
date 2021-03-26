package Command.Lightbulb;

import Command.Command;

public class TurnLightOnCommand implements Command {
    Lightbulb lightbulb;

    public TurnLightOnCommand(Lightbulb lightbulb) {
        this.lightbulb = lightbulb;
    }

    public void execute() {
        lightbulb.turnOn();
    }
}
