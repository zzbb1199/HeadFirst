package iterator;

public class Waitress {
    private Menu breakfastMenu;
    private Menu lunchMenu;

    public Waitress(BreakfastMenu breakfastMenu, LunchMenu lunchMenu) {
        this.breakfastMenu = breakfastMenu;
        this.lunchMenu = lunchMenu;
    }

    /**
     * 采用这种方式，有两个不好的地方：
     * 1. 依赖两个具体的菜单类，不便于扩展  （抽象菜单类）
     * 2. 不同的菜单类有不同存储方式，每次需要打印的时候就需要了解菜单类内部的存储方式，对内未封装（对菜单类暴露统一的遍历接口）
     */
//    public void printAllMenuItems(){
//        MenuItem[] breakfastMenuItems = breakfastMenu.getMenuItems();
//        ArrayList<MenuItem> lunchMenuItems = lunchMenu.getMenuItems();
//
//        //traverse
//        for(int i = 0;i<breakfastMenu.getIndex();i++){
//            System.out.println(breakfastMenuItems[i].getName());
//        }
//
//        for(int i = 0;i<lunchMenuItems.size();i++){
//            System.out.println(lunchMenuItems.get(i).getName());
//        }
//    }

    public void printAllMenuItems(){
        //create iterator
        Iterator breakfastIterator = breakfastMenu.createIterator();
        Iterator lunchIterator = lunchMenu.createIterator();

        System.out.println("breakfast:");
        print(breakfastIterator);

        System.out.println("lunch:");
        print(lunchIterator);

    }

    private void print(Iterator<MenuItem> iterator){
        while(iterator.hasNext()){
            MenuItem item = iterator.next();
            System.out.println(item.getName());
        }
    }


    public void printAllMenuWithJava(){
        //create iterator
        java.util.Iterator breakfastIter = breakfastMenu.createIteratorWithJava();
        java.util.Iterator lunchIter = lunchMenu.createIteratorWithJava();

        //print
        printWithJava(breakfastIter);
        printWithJava(lunchIter);
    }

    private void printWithJava(java.util.Iterator<MenuItem> iterator){
        while(iterator.hasNext()){
            MenuItem item = iterator.next();
            if(item.getName().equals("Hotdog")){
                iterator.remove();
            }
            System.out.println(item.getName());
        }
    }
}
