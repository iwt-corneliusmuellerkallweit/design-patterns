package Composite.Boats;

public class Steamship implements Boat {

    public void move() {
        System.out.println("I'm moving quickly and with a lot of noise.");
    }

    public String getName() {
        String name = "Steam Ship";
        return name;
    }
}
