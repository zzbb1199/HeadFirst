package chapter1.duckbehaviour.wrong;

public class Main {
    public static void main(String[] args){
        Duck d1 = new Duck1();
        d1.display();
        d1.fly();
        d1.quack();

        System.out.println();

        Duck d2 = new Duck2();
        d2.display();
        d2.fly();
        d2.quack();

    }
}
