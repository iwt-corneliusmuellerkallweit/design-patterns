package Command.Table;

import Command.Command;

public class StartCleaningCommand implements Command {
    Table table;

    public StartCleaningCommand(Table table) {
        this.table = table;
    }

    public void execute() {
        table.startClean();
    }
}
