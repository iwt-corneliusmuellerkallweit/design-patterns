package FactoryMethod.Items;

public class ItemGermanCola implements Item {
    public final String name = "Fritz Cola";

    public void deliver() {
        System.out.println("Hier hast du deine " + name + "!");
    }
}
