package Command._Variants.WithUndoButton.Lightbulb;


public class Lightbulb {
    enum Level {OFF, LOW, MEDIUM, HIGH}
    private Level state = Level.OFF;
    private Level undoState;

    public void toggleLevel() {
        if (state == Level.LOW) {
            undoState = state;
            state = Level.MEDIUM;
        } else if (state == Level.MEDIUM) {
            undoState = state;
            state = Level.HIGH;
        } else if (state == Level.HIGH) {
            undoState = state;
            state = Level.LOW;
        }
        System.out.println("The lightlevel is turned to " + state + ".");
    }

    public void turnOn() {
        if (state == Level.OFF) {
            undoState = state;
            state = Level.LOW;
            System.out.println("The light is turned on. Its lightlevel is " + state + ".");
        } else {
            toggleLevel();
        }
    }

    public void turnOff() {
        if (state != Level.OFF) {
            undoState = state;
            System.out.println("The light is turned off.");
            state = Level.OFF;
        }
    }

    public void undoOn() {
        if (state != undoState) {
            state = undoState;
            System.out.println("The light level is set back to " + state + ".");
        }
    }

    public void undoOff() {
        state = undoState;
        undoState = Level.OFF;
        System.out.println("The light is turned back on again.");
    }
}
