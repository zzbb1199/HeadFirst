package chapter3.coffee;


public class Main {
    public static void main(String[] args){
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDescription()+" "+beverage.cost());

        //装饰器,可以在不修改Beverage的情况下，增加Beverage的行为
        Beverage beverage1 = new HouseBlend();
        beverage1 = new MilkDecorator(beverage1);
        beverage1 = new MochaDecorator(beverage1);
        System.out.println(beverage1.getDescription()+" "+beverage.cost());

    }
}
