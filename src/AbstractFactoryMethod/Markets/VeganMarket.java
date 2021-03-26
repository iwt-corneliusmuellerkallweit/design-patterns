package AbstractFactoryMethod.Markets;

import AbstractFactoryMethod.Products.Meat.Meat;
import AbstractFactoryMethod.Products.Meat.Tofu;
import AbstractFactoryMethod.Products.Milk.Milk;
import AbstractFactoryMethod.Products.Milk.OatMilk;

public class VeganMarket implements Market {
    public Milk createMilk() {
        return new OatMilk();
    }

    public Meat createMeat() {
        return new Tofu();
    }
}
