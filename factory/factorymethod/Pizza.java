package factory.factorymethod;

public abstract class Pizza {
    protected String name;

    public Pizza() {
        this.name = this.getClass().getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    abstract void prepare();

    abstract void cut();

    abstract void box();

}
