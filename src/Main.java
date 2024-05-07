import Displays.CurrentConditionDisplay;
import Displays.ForecastDisplay;
import Displays.HeatIndexDisplay;
import Displays.StatisticsDisplay;
import Services.WeatherData;

public class Main {
    public static void main(String[] args) {
        System.out.println("***** WELCOME TO WEATHER STATION *****");

        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(36, 25.4f, 23.0f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
