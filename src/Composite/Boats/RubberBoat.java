package Composite.Boats;

public class RubberBoat implements Boat {

    public void move() {
        System.out.println("I'm moving slowly and shaky.");
    }

    public String getName() {
        String name = "Rubber Boat";
        return name;
    }
}
