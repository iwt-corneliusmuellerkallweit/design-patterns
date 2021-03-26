package Command._Variants.WithUndoButton.Window;

import Command._Variants.WithUndoButton.Command;

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
