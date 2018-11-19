package strategy.duckbehaviour.right;

public class Squeak implements Quackbehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
