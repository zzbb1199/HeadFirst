package chapter3.coffee;

public abstract class Beverage {
    protected String description;

    protected CoffeeSize size = CoffeeSize.TALL;


    public CoffeeSize getSize(){
        return size;
    }

    public void setSize(CoffeeSize size){
        this.size = size;
    }


    public abstract String getDescription();

    public abstract double cost();

}
