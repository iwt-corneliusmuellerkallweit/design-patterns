package FactoryMethod.Items;

public class ItemEnglishPeanuts implements Item {
    public final String name = "Chocolate Treets";

    public void deliver() {
        System.out.println("Here are some " + name + " for you!");
    }
}
