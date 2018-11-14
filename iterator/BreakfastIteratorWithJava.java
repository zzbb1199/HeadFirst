package iterator;

import java.util.Iterator;

public class BreakfastIteratorWithJava implements Iterator<MenuItem> {
    private MenuItem[] menuItems;
    private int numberOfItems = 0;

    public BreakfastIteratorWithJava(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return numberOfItems < menuItems.length && menuItems[numberOfItems] != null;
    }

    @Override
    public MenuItem next() {
        return menuItems[numberOfItems++];
    }

    public void remove() {
        int currentPos = numberOfItems - 1;
        if (menuItems[currentPos] == null) {
            throw new UnsupportedOperationException("this position's object is empty");
        } else {
            //move to remove the element
            for (int i = currentPos; i < menuItems.length - 1; i++) {
                menuItems[i] = menuItems[i + 1];
            }
            menuItems[menuItems.length - 1] = null;
            //position changed
            numberOfItems--;
        }
    }
}
