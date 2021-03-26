package Command._Variants.WithUndoButton.Table;

import Command._Variants.WithUndoButton.Command;

public class StartCleaningCommand implements Command {
    private final Table table;

    public StartCleaningCommand(Table table) {
        this.table = table;
    }

    public void execute() {
        table.startClean();
    }

    public void undo() {
        table.makeDirty();
    }
}
