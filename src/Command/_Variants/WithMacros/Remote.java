package Command._Variants.WithMacros;


public class Remote {
    private final Command noCommand = new NoCommand();
    private final Command[] onButtons;
    private final Command[] offButtons;
    private Command undoButton = noCommand;

    private final int buttonRows;

    public Remote() {
        buttonRows = 3;
        onButtons = new Command[3];
        offButtons = new Command[3];

        for (Command command : onButtons) {
            command = noCommand;
        }
        for (Command command : offButtons) {
            command = noCommand;
        }

        System.out.println("A remote with " + buttonRows + " buttons was created.");
    }

    public Remote(int rows) {
        if (rows >= 1 && rows <= 10) {
            buttonRows = rows;
            onButtons = new Command[rows];
            offButtons = new Command[rows];

            for (Command command : onButtons) {
                command = noCommand;
            }
            for (Command command : offButtons) {
                command = noCommand;
            }
            System.out.println("A remote with " + buttonRows + " buttons was created.");
        } else {
            System.out.println("The number of buttons was inappropriate. A remote with 3 buttons will be created.");
            buttonRows = 3;
            onButtons = new Command[3];
            offButtons = new Command[3];

            for (Command command : onButtons) {
                command = noCommand;
            }
            for (Command command : offButtons) {
                command = noCommand;
            }

            System.out.println("A remote with " + buttonRows + " buttons was created.");
        }
    }

    public void setButtons(int i, Command onCommand, Command offCommand) {
        onButtons[i] = onCommand;
        offButtons[i] = offCommand;
    }

    public void onButtonPressed(int i) {
        onButtons[i].execute();
        undoButton = onButtons[i];
    }

    public void offButtonPressed(int i) {
        offButtons[i].execute();
        undoButton = offButtons[i];
    }

    public void undoButtonPressed() {
        undoButton.undo();
    }
}
