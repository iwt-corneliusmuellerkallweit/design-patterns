package AbstractFactoryMethod.Markets;

import AbstractFactoryMethod.Products.Meat.Meat;
import AbstractFactoryMethod.Products.Meat.TBoneSteak;
import AbstractFactoryMethod.Products.Milk.CowMilk;
import AbstractFactoryMethod.Products.Milk.Milk;

public class Supermarket implements Market {
    public Milk createMilk() {
        return new CowMilk();
    }

    public Meat createMeat() {
        return new TBoneSteak();
    }
}
