package factory.absctractfactory;

public class PizzaB extends Pizza {
    public PizzaB(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    void cut() {

    }

    @Override
    void box() {

    }
}
