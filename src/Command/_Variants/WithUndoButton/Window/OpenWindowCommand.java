package Command._Variants.WithUndoButton.Window;

import Command._Variants.WithUndoButton.Command;

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
