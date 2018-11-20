package compound.duck;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable observable) {
        System.out.println("name"+observable);
    }
}
