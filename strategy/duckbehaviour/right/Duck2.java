package strategy.duckbehaviour.right;

public class Duck2 extends Duck {

    public Duck2() {
        flybehavior = new FlyNoWay();
        quackbehavior = new QuackNoWay();
    }
}
