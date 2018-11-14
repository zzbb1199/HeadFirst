package iterator;

import java.util.ArrayList;

public class LunchMenu implements Menu{
    ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

    private int numberOfItems = 0;

    public LunchMenu(){
        addItem("Regular pancake","fdaf",10);
        addItem("Regular pancake","fdaf",10);
        addItem("Regular pancake","fdaf",10);
    }

    public void addItem(String name,String desciption,double price){
        MenuItem menuItem = new MenuItem(name,desciption,price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems(){
        return this.menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator(){
        return new LunchIterator(menuItems);
    }

    @Override
    public java.util.Iterator<MenuItem> createIteratorWithJava(){
        return menuItems.iterator();
    }
}
