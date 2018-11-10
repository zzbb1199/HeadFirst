package factory.absctractfactory;

public class PizzaA extends Pizza{

    public PizzaA(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    void cut() {

    }

    @Override
    void box() {

    }
}
