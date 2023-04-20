package behavioral.observer.impl;

import behavioral.observer.Observer;
import behavioral.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> list = new ArrayList<>();
    private float temp;
    private float humidity;
    private float pressure;


    @Override
    public void registerObservers(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

        int index = list.indexOf(o);
        if(index >= 0){
            list.remove(index);
        }
    }

    @Override
    public void notifyObserver() {

        for(Observer o : list){
            o.update(temp, humidity, pressure);
        }
    }

    public void setMessurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure=pressure;
        notifyObserver();
    }
}
