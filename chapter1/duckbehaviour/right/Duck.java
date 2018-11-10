package chapter1.duckbehaviour.right;

public class Duck {


    Flybehavior flybehavior;

    Quackbehavior quackbehavior;

    /**
     * 每个鸭子都会有的方法，需要覆盖
     */
    void display() {

    }

    void swim() {

    }


    void performFly() {
        flybehavior.fly();
    }

    void performQuack() {
        quackbehavior.quack();
    }

    void setFlybehavior(Flybehavior fb) {
        flybehavior = fb;
    }

    void setQuackbehavior(Quack qb) {
        quackbehavior = qb;
    }
}
