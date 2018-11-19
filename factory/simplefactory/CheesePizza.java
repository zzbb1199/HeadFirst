package factory.simplefactory;

public class CheesePizza extends Pizza {

    public CheesePizza() {
        this.name = "CheesePizza";
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
