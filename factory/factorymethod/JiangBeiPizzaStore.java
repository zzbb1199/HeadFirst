package factory.factorymethod;

public class JiangBeiPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("a") || type.equals("A")){
            pizza = new JiangBeiPizzaA();
        }else if(type.equals("b") || type.equals("B")){
            pizza = new JiangBeiPizzaB();
        }
        return pizza;
    }
}
