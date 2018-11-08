package observe.selfmake;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    float temperature;
    float humidity;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }


    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int observerIndex = observers.indexOf(o);
        if(observerIndex >= 0){
            observers.remove(observerIndex);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temperature,humidity);
        }
    }

    private void measureChanged(){
        notifyObservers();
    }

    public void setWeatherData(float temperature, float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        measureChanged();
    }


}
