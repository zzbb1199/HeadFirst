package chapter3.coffee;

public class HouseBlend extends Beverage{


    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        switch(size){
            case TALL:  return 1;
            case GRANDE: return 2;
            case VENTI: return 3;
            default: return 0;
        }
    }

}
