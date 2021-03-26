package Command.Window;

import Command.Command;

public class OpenWindowCommand implements Command {
    private final Window window;

    public OpenWindowCommand(Window window) {
        this.window = window;
    }

    public void execute() {
        window.open();
    }
}
