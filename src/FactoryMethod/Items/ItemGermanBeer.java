package FactoryMethod.Items;

public class ItemGermanBeer implements Item {
    public final String name = "Astra";

    public void deliver() {
        System.out.println("Hier hast du dein " + name + "!");
    }
}
