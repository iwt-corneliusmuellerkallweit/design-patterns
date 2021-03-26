package Command._Variants.WithMacros;

import Command._Variants.WithMacros.Lightbulb.Lightbulb;
import Command._Variants.WithMacros.Lightbulb.TurnLightOffCommand;
import Command._Variants.WithMacros.Lightbulb.TurnLightOnCommand;
import Command._Variants.WithMacros.Table.StartCleaningCommand;
import Command._Variants.WithMacros.Table.StopCleaningCommand;
import Command._Variants.WithMacros.Table.Table;
import Command._Variants.WithMacros.Window.CloseWindowCommand;
import Command._Variants.WithMacros.Window.OpenWindowCommand;
import Command._Variants.WithMacros.Window.Window;

public class User {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        Remote remote = new Remote(4);

        Window window = new Window();
        remote.setButtons(0, new OpenWindowCommand(window), new CloseWindowCommand(window));
        remote.onButtonPressed(0);
        remote.offButtonPressed(0);
        remote.undoButtonPressed();
        remote.offButtonPressed(0);

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
        remote.offButtonPressed(2);

        System.out.println();

        Command[] allOn = { new OpenWindowCommand(window), new StartCleaningCommand(table), new TurnLightOnCommand(lightbulb) };
        Command[] allOff = { new CloseWindowCommand(window), new StopCleaningCommand(table), new TurnLightOffCommand(lightbulb)};
        MacroCommand allOnMacro = new MacroCommand(allOn);
        MacroCommand allOffMacro = new MacroCommand(allOff);

        remote.setButtons(3, allOnMacro, allOffMacro);
        remote.onButtonPressed(3);
        remote.offButtonPressed(3);
        remote.undoButtonPressed();
    }
}
