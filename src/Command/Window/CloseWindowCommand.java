package Command.Window;

import Command.Command;

public class CloseWindowCommand implements Command {
    private final Window window;

    public CloseWindowCommand(Window window) {
        this.window = window;
    }

    public void execute() {
        window.close();
    }
}
