package FactoryMethod.Items;

public class ItemEnglishCola implements Item {
    public final String name = "Coca Cola";

    public void deliver() {
        System.out.println("Here's a " + name + " for you!");
    }
}
