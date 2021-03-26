package Command._Variants.WithMacros.Lightbulb;


import Command._Variants.WithMacros.Command;

public class TurnLightOffCommand implements Command {
    Lightbulb lightbulb;

    public TurnLightOffCommand(Lightbulb lightbulb) {
        this.lightbulb = lightbulb;
    }

    public void execute() {
        lightbulb.turnOff();
    }

    public void undo() {
        lightbulb.undoOff();
    }
}
