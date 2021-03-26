package FactoryMethod.Items;

public class ItemGermanPeanuts implements Item {
    public final String name = "Ültje";

    public void deliver() {
        System.out.println("Hier hast du deine " + name + "s!");
    }
}
