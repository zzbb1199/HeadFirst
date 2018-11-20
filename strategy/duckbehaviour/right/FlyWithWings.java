package strategy.duckbehaviour.right;

public class FlyWithWings implements Flybehavior {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
