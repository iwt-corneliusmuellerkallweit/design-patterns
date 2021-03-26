package Command._Variants.WithUndoButton;

import Command._Variants.WithUndoButton.Lightbulb.Lightbulb;
import Command._Variants.WithUndoButton.Lightbulb.TurnLightOffCommand;
import Command._Variants.WithUndoButton.Lightbulb.TurnLightOnCommand;
import Command._Variants.WithUndoButton.Table.StartCleaningCommand;
import Command._Variants.WithUndoButton.Table.StopCleaningCommand;
import Command._Variants.WithUndoButton.Table.Table;
import Command._Variants.WithUndoButton.Window.CloseWindowCommand;
import Command._Variants.WithUndoButton.Window.OpenWindowCommand;
import Command._Variants.WithUndoButton.Window.Window;

public class User {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        Remote remote = new Remote();

        Window window = new Window();
        remote.setButtons(0, new OpenWindowCommand(window), new CloseWindowCommand(window));
        remote.onButtonPressed(0);
        remote.offButtonPressed(0);
        remote.undoButtonPressed();

        System.out.println();

        Table table = new Table();
        remote.setButtons(1, new StartCleaningCommand(table), new StopCleaningCommand(table));
        remote.onButtonPressed(1);
        remote.offButtonPressed(1);
        remote.onButtonPressed(1);
        remote.undoButtonPressed();

        System.out.println();

        Lightbulb lightbulb = new Lightbulb();
        remote.setButtons(2, new TurnLightOnCommand(lightbulb), new TurnLightOffCommand(lightbulb));
        remote.onButtonPressed(2);
        remote.onButtonPressed(2);
        remote.onButtonPressed(2);
        remote.onButtonPressed(2);
        remote.offButtonPressed(2);
        remote.undoButtonPressed();
        remote.onButtonPressed(2);
        remote.undoButtonPressed();
    }
}
