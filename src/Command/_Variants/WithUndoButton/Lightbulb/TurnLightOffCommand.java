package Command._Variants.WithUndoButton.Lightbulb;


import Command._Variants.WithUndoButton.Command;

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
