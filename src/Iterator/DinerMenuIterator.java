package Iterator;

import java.util.Iterator;
import Iterator.MenuItem;

public class DinerMenuIterator implements Iterator {
    private final MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an _Item before you've done at least one 'next()'.");
        }
        if (items[position - 1] != null) {
            for (int i = position - 1; i < (items.length - 1); i++) {
                items[i] = items[i+1];
            }
        }
    }
}
