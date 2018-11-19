package strategy.duckbehaviour.wrong;

/**
 * Duck2 不能叫
 */
public class Duck2 extends Duck {
    @Override
    void display() {
        System.out.println("I am duck2");
    }

    /**
     * 方法一：覆盖方法
     */

    @Override
    void quack() {
        System.out.println("I cann't quack");
    }
}
