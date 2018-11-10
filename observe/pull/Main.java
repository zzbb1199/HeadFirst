package chapter2.pull;

public class Main {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentStatDashBorad currentStatDashBorad = new CurrentStatDashBorad(weatherData);
        weatherData.setWeather(10,321);
        weatherData.deleteObserver(currentStatDashBorad);
        weatherData.setWeather(12,312);
    }
}
