package compound;

public class RubberDuck implements Quackable {


    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
        notifyObservers();
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observable.removeObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

}
