package Iterator;


import java.util.Iterator;

public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private final MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Veggie BLT", "Veggie Bacon Sandwich with tomato and lettuce on whole wheat.", true, 2.99);
        addItem("Hotdog", "A hot dog with mustard, sauerkraut and relish.", false, 1.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Menu full...");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
