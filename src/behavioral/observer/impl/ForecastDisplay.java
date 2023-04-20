package behavioral.observer.impl;

import behavioral.observer.Display;
import behavioral.observer.Observer;

public class ForecastDisplay implements Observer, Display {

    private final float currentPressure = 38.5f;
    private float lastPressure;
    WeatherData weatherData = new WeatherData();

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = pressure;
        display();
    }

    @Override
    public void display() {
        if(lastPressure > currentPressure){
            System.out.println("Weather is good");
        }else if(lastPressure < currentPressure){
            System.out.println("weather is not good");
        }else {
            System.out.println("Weather is same as yesterday");
        }
    }

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData= weatherData;
        weatherData.registerObservers(this);
    }
}
