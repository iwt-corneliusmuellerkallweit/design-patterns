package Command._Variants.WithMacros.Table;

import Command._Variants.WithMacros.Command;

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
