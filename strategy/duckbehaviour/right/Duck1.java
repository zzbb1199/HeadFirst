package strategy.duckbehaviour.right;

public class Duck1 extends Duck {
    public Duck1() {
        flybehavior = new FlyWithWings();
        quackbehavior = new Quack();
    }
}
