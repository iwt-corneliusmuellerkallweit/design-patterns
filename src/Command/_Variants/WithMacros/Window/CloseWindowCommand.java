package Command._Variants.WithMacros.Window;

import Command._Variants.WithMacros.Command;

public class CloseWindowCommand implements Command {
    private final Window window;

    public CloseWindowCommand(Window window) {
        this.window = window;
    }

    public void execute() {
        window.close();
    }

    public void undo() {
        window.open();
    }
}
