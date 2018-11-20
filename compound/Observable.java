package compound;

import java.util.ArrayList;

public class Observable  implements QuackObservable{
    ArrayList<Observer> observers = new ArrayList<Observer>();

    Quackable quackable;

    public Observable(Quackable quackable) {
        this.quackable = quackable;
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int indexOfObserver = observers.indexOf(observer);
        if(indexOfObserver >= 0){
            observers.remove(indexOfObserver);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(quackable);
        }
    }
}
