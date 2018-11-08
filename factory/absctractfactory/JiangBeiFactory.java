package factory.absctractfactory;

public class JiangBeiFactory implements PizzaIngredientFactory {
    @Override
    public String getDoube() {
        return "jiangbeidoube";
    }

    @Override
    public String getSauce() {
        return "jiangbeisauce";
    }
}
