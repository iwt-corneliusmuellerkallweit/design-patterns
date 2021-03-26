package AbstractFactoryMethod.Markets;

import AbstractFactoryMethod.Products.Meat.Meat;
import AbstractFactoryMethod.Products.Milk.Milk;

public interface Market {
    Milk createMilk();
    Meat createMeat();
}
