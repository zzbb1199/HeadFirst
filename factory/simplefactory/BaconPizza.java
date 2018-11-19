package factory.simplefactory;

public class BaconPizza extends Pizza{

    public BaconPizza() {
        this.name = "BaconPizza";
    }

    @Override
    protected void prepare() {
        System.out.println("prepare");
    }

    @Override
    protected void cut() {
        System.out.println("cut");
    }

    @Override
    protected void box() {
        System.out.println("box");
    }
}
