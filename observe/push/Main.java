package chapter2.push;

public class Main {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentStatDashBorad currentStatDashBorad = new CurrentStatDashBorad(weatherData);
        weatherData.setWeather(100,123);
        weatherData.deleteObserver(currentStatDashBorad);
        weatherData.setWeather(123,321);
    }
}
