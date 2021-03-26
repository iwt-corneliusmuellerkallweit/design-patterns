package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();

        addItem("Pancake Breakfast", "Pancakes with scrambled eggs and toast.", true, 2.99);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries.", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return new PancakeHouseIterator(menuItems);
    }
}
