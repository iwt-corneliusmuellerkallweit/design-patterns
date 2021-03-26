package Command.Table;

import Command.Command;

public class StopCleaningCommand implements Command {
    Table table;

    public StopCleaningCommand(Table table) {
        this.table = table;
    }

    public void execute() {
        table.stopClean();
    }
}
