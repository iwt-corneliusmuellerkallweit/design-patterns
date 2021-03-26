package FactoryMethod.Bars;

import FactoryMethod.Items.Item;

public abstract class Bar {

    public void order(String type) {
        Item item;

        item = create(type);

        item.deliver();
    }

    public abstract Item create(String type);
}
