package chapter4.simplefactory;

public class SimpleFactory {
    public static Pizza createPizza(String type){
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("bacon")){
            pizza = new BaconPizza();
        }

        return pizza;
    }
}
