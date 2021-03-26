package Command._Variants.WithMacros.Table;

import Command._Variants.WithMacros.Command;

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
