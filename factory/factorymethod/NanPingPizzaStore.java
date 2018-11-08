package factory.factorymethod;

public class NanPingPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("a") || type.equals("A")){
            pizza = new NanPingPizzaA();
        }else if(type.equals("b") || type.equals("B")){
            pizza = new NanPingPizzaB();
        }
        return pizza;
    }
}
