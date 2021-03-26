package FactoryMethod.Items;

public class ItemEnglishBeer implements Item {
    public final String name = "Budweiser";

    public void deliver() {
        System.out.println("Here's a " + name + " for you!");
    }
}
