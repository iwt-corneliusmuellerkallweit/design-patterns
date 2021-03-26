package Command._Variants.WithUndoButton.Lightbulb;

import Command._Variants.WithUndoButton.Command;

public class TurnLightOnCommand implements Command {
    Lightbulb lightbulb;

    public TurnLightOnCommand(Lightbulb lightbulb) {
        this.lightbulb = lightbulb;
    }

    public void execute() {
        lightbulb.turnOn();
    }

    public void undo() {
        lightbulb.undoOn();
    }
}
