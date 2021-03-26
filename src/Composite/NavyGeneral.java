package Composite;

import Composite.Boats.*;

public class NavyGeneral {
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        Fleet fleet = new Fleet();
        fleet.add(new Steamship());
        fleet.add(new Yacht());

        Fleet fleetOfToyBoats = new Fleet();
        fleetOfToyBoats.add(new ToyBoat());
        fleetOfToyBoats.add(new ToyBoat());
        fleetOfToyBoats.add(new ToyBoat());

        fleet.add(fleetOfToyBoats);

        fleet.add(new RubberBoat());

        System.out.println("General: \"Everybody, this is not a drill! The whole fleet must sail to the coast as fast as possible!\"\n");
        fleet.move();
    }
}
