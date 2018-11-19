package factory.simplefactory;

public abstract class Pizza {

    String name;

    protected abstract void prepare();

    protected abstract void cut();

    protected abstract void box();

    String getName(){
        return this.name;
    }
}
