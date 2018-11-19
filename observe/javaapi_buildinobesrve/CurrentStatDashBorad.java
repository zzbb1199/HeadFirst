package observe.javaapi_buildinobesrve;

import java.util.Observable;
import java.util.Observer;

public class CurrentStatDashBorad implements Observer,DisplayBehavior {
    private float temperature;
    private float humidity;
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CurrentStatDashBorad{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
