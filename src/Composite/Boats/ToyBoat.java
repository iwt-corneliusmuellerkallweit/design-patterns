package Composite.Boats;

public class ToyBoat implements Boat {

    public void move() {
        System.out.println("I'm barely moving at all, but I'm very cute.");
    }

    public String getName() {
        String name = "Toy Boat";
        return name;
    }
}
