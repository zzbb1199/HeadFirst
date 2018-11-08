package singleton.singleton;

public class SingletonThread implements Runnable {

    private Singleton singleton1;


    @Override
    public void run() {
        singleton1 = Singleton.getInstance();
        System.out.println(singleton1);
    }
}
