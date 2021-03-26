package Iterator;


import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseIterator implements Iterator {
    private final ArrayList<MenuItem> items;
    private int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.size() && items.get(position) != null;
    }

    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position += 1;
        return menuItem;
    }

    public void remove() {
        items.remove(position);
    }
}
