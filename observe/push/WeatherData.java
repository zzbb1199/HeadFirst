package observe.push;

import java.util.ArrayList;

public class WeatherData implements Observable{

    private float temperature;

    private float humidity;

    private ArrayList<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
            observers.add(o);
    }

    @Override
    public boolean deleteObserver(Observer o) {
        int observerIndex = observers.indexOf(o);
        if(observerIndex >= 0){
            observers.remove(observerIndex);
            return true;
        }
        return false;
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temperature,humidity);
        }
    }

    public void setWeather(float temperature,float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        measureChanged();
    }

    public void measureChanged(){
        notifyObservers();
    }
}
