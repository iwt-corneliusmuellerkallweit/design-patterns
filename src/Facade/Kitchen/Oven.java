package Facade.Kitchen;

public class Oven {
    public void heatUp(int i) {
        System.out.println("The oven is heated up to " + i + " degrees celsius.");
    }

    public void open() {
        System.out.println("The oven is opened.");
    }

    public void close() {
        System.out.println("The oven is closed.");
    }

    public void insert(String object) {
        System.out.println("The " + object + "  is put into the oven.");
    }

    public void turnOff() {
        System.out.println("The oven is turned off.");
    }

    public void takeOut(String object) {
        System.out.println("The " + object + "  is taken out of the oven.");
    }

    public void sprayWithCleaner() {
        System.out.println("The oven is sprayed with cleaner.");
    }

    public void clean() {
        System.out.println("The oven is cleaned.");
    }
}
