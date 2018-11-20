package compound.duck;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

    ArrayList<Quackable> quackables = new ArrayList<Quackable>();


    public void add(Quackable quackable){
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackables.iterator();
        while(iterator.hasNext()){
            Quackable quackable = iterator.next();
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = quackables.iterator();
        while(iterator.hasNext()){
            Quackable quackable = iterator.next();
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        Iterator<Quackable> iterator = quackables.iterator();
        while(iterator.hasNext()){
            Quackable quackable = iterator.next();
            removeObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        Iterator<Quackable> iterator = quackables.iterator();
        while(iterator.hasNext()){
            Quackable quackable = iterator.next();
            quackable.notifyObservers();
        }
    }
}
