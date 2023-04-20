package behavioral.observer;

import behavioral.observer.impl.ForecastDisplay;
import behavioral.observer.impl.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMessurements(12, 13, 30);
    }
}
