package Command.Lightbulb;


public class Lightbulb {
    enum Level {OFF, LOW, MEDIUM, HIGH}

    private Level state = Level.OFF;

    public void toggleLevel() {
        if (state == Level.LOW) {
            state = Level.MEDIUM;
        } else if (state == Level.MEDIUM) {
            state = Level.HIGH;
        } else if (state == Level.HIGH) {
            state = Level.LOW;
        }
        System.out.println("The lightlevel is turned to " + state + ".");
    }

    public void turnOn() {
        if (state == Level.OFF) {
            state = Level.LOW;
            System.out.println("The light is turned on. Its lightlevel is " + state + ".");
        } else {
            toggleLevel();
        }
    }

    public void turnOff() {
        if (state != Level.OFF) {
            System.out.println("The light is turned off.");
            state = Level.OFF;
        }
    }
}
