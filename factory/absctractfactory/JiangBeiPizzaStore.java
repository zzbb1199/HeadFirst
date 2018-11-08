package factory.absctractfactory;

public class JiangBeiPizzaStore extends PizzaStore {

    private PizzaIngredientFactory factory = new JiangBeiFactory();

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
