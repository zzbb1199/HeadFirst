package singleton.singleton;

public class Main {
    public static void main(String[] args){
        Thread t1 = new Thread(new SingletonThread());
        Thread t2 = new Thread(new SingletonThread());
        Thread t3 = new Thread(new SingletonThread());
        t1.start();
        t2.start();
        t3.start();

    }
}
