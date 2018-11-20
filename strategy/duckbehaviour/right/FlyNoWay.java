package strategy.duckbehaviour.right;

public class FlyNoWay implements Flybehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
