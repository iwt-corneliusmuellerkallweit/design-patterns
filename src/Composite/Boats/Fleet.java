package Composite.Boats;

import java.util.ArrayList;

public class Fleet implements Boat {
    ArrayList<Boat> fleet = new ArrayList<>();

    public void add(Boat boat) {
        fleet.add(boat);
    }

    public void move() {
        for (Boat boat : fleet) {
            System.out.print(boat.getName() + ":\n");
            boat.move();
        }
        System.out.println("------");
    }

    public String getName() {
        String name = "-------\nFleet";
        return name;
    }
}
