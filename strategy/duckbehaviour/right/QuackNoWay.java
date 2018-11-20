package strategy.duckbehaviour.right;

public class QuackNoWay implements Quackbehavior {
    @Override
    public void quack() {
        System.out.println("I cann't quack");
    }
}
