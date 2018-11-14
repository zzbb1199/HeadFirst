package iterator;

import java.util.ArrayList;

public class LunchIterator implements Iterator<MenuItem> {

    private ArrayList<MenuItem> menuItems;
    private int numberOfItems = 0;

    public LunchIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return numberOfItems < menuItems.size();
    }

    @Override
    public MenuItem next() {
        MenuItem item = menuItems.get(numberOfItems);
        numberOfItems++;
        return item;
    }



}
