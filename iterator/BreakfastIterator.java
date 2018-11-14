package iterator;

public class BreakfastIterator implements Iterator<MenuItem>{
    private MenuItem[] menuItems;
    private int numberOfItems = 0;
    public BreakfastIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return numberOfItems < menuItems.length && menuItems[numberOfItems] !=null ;
    }

    @Override
    public MenuItem next() {
        return menuItems[numberOfItems++];
    }
}
