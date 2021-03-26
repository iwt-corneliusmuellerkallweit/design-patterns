package Command._Variants.WithUndoButton.Table;

import Command._Variants.WithUndoButton.Command;

public class StopCleaningCommand implements Command {
    Table table;

    public StopCleaningCommand(Table table) {
        this.table = table;
    }

    public void execute() {
        table.stopClean();
    }

    public void undo() {
        table.startClean();
    }
}
