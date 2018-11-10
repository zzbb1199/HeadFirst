package chapter4.simplefactory;

public class PizzaStore {
    Pizza orderPizza(String type){
        Pizza pizza = SimpleFactory.createPizza(type);
        pizza.prepare();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
