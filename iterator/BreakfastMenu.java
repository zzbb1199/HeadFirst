package iterator;

/**
 * 早餐采用数组实现
 */
public class BreakfastMenu  implements Menu{
    private static final int MAX_LEN = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public BreakfastMenu(){
        menuItems = new MenuItem[MAX_LEN];

        addItem("Hotdog","fdsafasdf",10.1);
        addItem("Vegetarian BLT","fdsafasdf",10.1);
        addItem("Hamburger","fdsafasdf",10.1);
    }

    public void addItem(String name,String desciption,double price){
        MenuItem item = new MenuItem(name,desciption,price);
        if(numberOfItems >= MAX_LEN){
            throw new IndexOutOfBoundsException("Sorry,menu is full! Can't add item to menu");
        }else{
            menuItems[numberOfItems] = item;
            numberOfItems++;
        }
    }

    /**
     * 1. 如果就这一个菜单类，这样写没什么问题，但是当需要遍历多个菜单类的时候，这样写相当于没有对内封装了。
     * 每一个客户需要用到这个菜单，都需要了解这个菜单的存储方式。
     * @return
     */
    public MenuItem[] getMenuItems(){
        return this.menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator(){
        return new BreakfastIterator(menuItems);
    }

    @Override
    public java.util.Iterator<MenuItem> createIteratorWithJava(){
        return new BreakfastIteratorWithJava(menuItems);
    }

}
