package chapter1.duckbehaviour.right;

public class Duck3 extends Duck {
    public Duck3() {
        flybehavior = new FlyNoWay();
        quackbehavior = new Squeak();
    }
}
