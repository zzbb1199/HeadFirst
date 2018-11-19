package strategy.duckbehaviour.right;

public class Main {
    public static void main(String[] args){
        Duck d1 = new Duck1();
        Duck d2 = new Duck2();
        Duck d3 = new Duck3();

        d1.performFly();
        d1.performQuack();

        d2.performFly();
        d2.performQuack();


        d3.performFly();
        d3.performQuack();
        d3.setFlybehavior(new FlyWithWings());
        d3.performFly();
    }
}
