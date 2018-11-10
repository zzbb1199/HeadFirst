package chapter3.coffee;

public class MochaDecorator extends CondimentDecorator {

    Beverage beverage;

    public MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",mocha";
    }

    @Override
    public CoffeeSize getSize() {
        return beverage.getSize();
    }

    public double cost(){
        //针对不同的size设定不同的价格
        return beverage.cost() + 12;
    }
}
