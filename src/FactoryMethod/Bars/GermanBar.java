package FactoryMethod.Bars;

import FactoryMethod.Items.Item;
import FactoryMethod.Items.ItemGermanBeer;
import FactoryMethod.Items.ItemGermanCola;
import FactoryMethod.Items.ItemGermanPeanuts;

public class GermanBar extends Bar {

    public Item create(String type)  {
        Item item = switch (type) {
            case "beer" -> new ItemGermanBeer();
            case "peanuts" -> new ItemGermanPeanuts();
            case "cola" -> new ItemGermanCola();
            default -> null;
        };

        return item;
    }

}
