package Facade.Kitchen;

import java.util.ArrayList;

public class Cabinet {
    private final String name;

    public Cabinet(String name) {
        this.name = name;
    }

    public void take(ArrayList<String> ingredients) {
        for (String ingredient : ingredients) {
            System.out.println("The " + ingredient + " is taken out of the " + name + ".");
        }
    }

    public void getBowl() {
        System.out.println("A bowl is taken out of the " + name + ".");
    }

    public void getBakingPan() {
        System.out.println("A baking pan is taken out of the " + name + ".");
    }

    public void open() {
        System.out.println("The " + name + " is opened.");
    }

    public void empty() {
        System.out.println("The " + name + " is emptied.");

    }

    public void clean() {
        System.out.println("The " + name + " is cleaned.");

    }

    public void refill() {
        System.out.println("The " + name + " is refilled.");

    }

    public void close() {
        System.out.println("The " + name + " is closed.");

    }
}
