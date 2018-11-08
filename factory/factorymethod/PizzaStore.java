package factory.factorymethod;

public abstract class PizzaStore {
    /**
     * 对内封装
     * @param type
     * @return
     */
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
