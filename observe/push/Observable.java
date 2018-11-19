package observe.push;

public interface Observable {
    void registerObserver(Observer o);
    boolean deleteObserver(Observer o);
    void notifyObservers();
}
