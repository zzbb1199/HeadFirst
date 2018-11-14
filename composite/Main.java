package composite;

public class Main {
    public static void main(String[] args){
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE  HOUSE MENU","Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU","Lucnch");
        MenuComponent cafeMenu = new Menu("CAFE MENU","dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU","DESSERT OF COURSE");

        MenuComponent allMenu = new Menu("ALL MENUS","all menus combined");

        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinerMenu);
        allMenu.add(cafeMenu);

        dinerMenu.add(new MenuItem("pasta","spaghetti with marinara sauce, and a slice of sourdough bread",
                true,3.89));

        dinerMenu.add(dessertMenu);

        Waitress waitress = new Waitress(allMenu);
//        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
