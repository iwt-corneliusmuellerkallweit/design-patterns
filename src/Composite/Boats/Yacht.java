package Composite.Boats;

public class Yacht implements Boat {

    public void move() {
        System.out.println("I'm moving luxuriously but not quickly.");
    }

    public String getName() {
        String name = "Yacht";
        return name;
    }
}
