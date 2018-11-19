package observe.javaapi_buildinobesrve;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;

    /**
     * 提供给观察者自行get
     * @return
     */
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }


    public void setWeatherData(float temperature,float humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        measureChaned();
    }


    private void measureChaned(){
        // 一定调用setChanged，改变标志位，否则不会通知到观察者
        setChanged();
        notifyObservers();
    }

}
