package factory.absctractfactory;

public abstract class Pizza {
    private String name;

    private String dough;

    private String sauce;

    private PizzaIngredientFactory ingredientFactory;

    public Pizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        this.name = this.getClass().getSimpleName();
    }

    void prepare(){
        System.out.println("name:"+ name + ",prepareing");
        dough = ingredientFactory.getDoube();
        sauce = ingredientFactory.getSauce();
    }

    abstract void cut();

    abstract void box();

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredientFactory=" + ingredientFactory +
                '}';
    }
}
