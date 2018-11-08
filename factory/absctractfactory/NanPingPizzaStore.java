package factory.absctractfactory;

public class NanPingPizzaStore extends PizzaStore {
    PizzaIngredientFactory factory = new NanPingFactory();
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("a")){
            pizza = new PizzaA(factory);
        }else if(type.equals("b")){
            pizza = new PizzaB(factory);
        }
        return pizza;
    }
}
