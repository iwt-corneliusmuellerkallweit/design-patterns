package FactoryMethod.Bars;

import FactoryMethod.Items.Item;
import FactoryMethod.Items.ItemEnglishBeer;
import FactoryMethod.Items.ItemEnglishCola;
import FactoryMethod.Items.ItemEnglishPeanuts;

public class EnglishBar extends Bar {

    public Item create(String type)  {
        Item item = switch (type) {
            case "beer" -> new ItemEnglishBeer();
            case "peanuts" -> new ItemEnglishPeanuts();
            case "cola" -> new ItemEnglishCola();
            default -> null;
        };

        return item;
    }
}
