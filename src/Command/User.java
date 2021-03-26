package Command;

import Command.Lightbulb.Lightbulb;
import Command.Lightbulb.TurnLightOffCommand;
import Command.Lightbulb.TurnLightOnCommand;
import Command.Table.StartCleaningCommand;
import Command.Table.StopCleaningCommand;
import Command.Table.Table;
import Command.Window.CloseWindowCommand;
import Command.Window.OpenWindowCommand;
import Command.Window.Window;

public class User {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        Remote remote = new Remote();

        Lightbulb lightbulb = new Lightbulb();
        remote.setButtons(0, new TurnLightOnCommand(lightbulb), new TurnLightOffCommand(lightbulb));
        remote.onButtonPressed(0);
        remote.onButtonPressed(0);
        remote.onButtonPressed(0);
        remote.onButtonPressed(0);
        remote.offButtonPressed(0);

        System.out.println();

        Window window = new Window();
        remote.setButtons(1, new OpenWindowCommand(window), new CloseWindowCommand(window));
        remote.onButtonPressed(1);
        remote.offButtonPressed(1);

        System.out.println();

        Table table = new Table();
        remote.setButtons(2, new StartCleaningCommand(table), new StopCleaningCommand(table));
        remote.onButtonPressed(2);
        remote.offButtonPressed(2);
    }
}
