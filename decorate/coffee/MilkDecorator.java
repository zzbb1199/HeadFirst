package chapter3.coffee;

public class MilkDecorator extends CondimentDecorator {

    Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",milk";
    }

    @Override
    public CoffeeSize getSize() {
        return beverage.getSize();
    }

    public double cost(){
        //针对不同的size设置不同的价格
        return beverage.cost() + 3;
    }
}
