package Facade.Kitchen;

public class Fridge extends Cabinet {
    public Fridge(String name) {
        super(name);
    }

    public void defrost() {
        System.out.println("All ice is removed from the fridge.");

    }
}
