package factory.absctractfactory;

public class NanPingFactory implements PizzaIngredientFactory {
    @Override
    public String getDoube() {
        return "nanpingdoube";
    }

    @Override
    public String getSauce() {
        return "nanpingsauce";
    }
}
