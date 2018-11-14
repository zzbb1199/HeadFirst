package iterator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        BreakfastMenu breakfastMenu  = new BreakfastMenu();
        LunchMenu lunchMenu = new LunchMenu();
        Waitress alice = new Waitress(breakfastMenu,lunchMenu);
        //use self-make iterator
        alice.printAllMenuItems();
        //use java api iterator
        alice.printAllMenuWithJava();

        ArrayList list  = new ArrayList();
        list.listIterator();
    }
}
