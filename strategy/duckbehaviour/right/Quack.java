package strategy.duckbehaviour.right;

public class Quack implements Quackbehavior {
    @Override
    public void quack() {
        System.out.println("I can quack");
    }
}
