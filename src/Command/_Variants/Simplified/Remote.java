package Command._Variants.Simplified;


public class Remote {
    Command[] onCommands;
    Command[] offCommands;

    public Remote(int rows) {
        onCommands = new Command[rows];
        offCommands = new Command[rows];

        for (int i = 0; i < rows; i++) {
            onCommands[i] = () -> { };
            offCommands[i] = () -> { };
        }
    }

    public void setButtons(int i, Command onCommand, Command offCommand) {
        onCommands[i] = onCommand;
        offCommands[i] = offCommand;
    }

    public void onButtonPressed(int i) {
        onCommands[i].execute();
    }

    public void offButtonPressed(int i) {
        offCommands[i].execute();
    }
}
