package Command._Variants.WithMacros.Window;

import Command._Variants.WithMacros.Command;

public class OpenWindowCommand implements Command {
    private final Window window;

    public OpenWindowCommand(Window window) {
        this.window = window;
    }

    public void execute() {
        window.open();
    }

    public void undo() {
        window.close();
    }
}
