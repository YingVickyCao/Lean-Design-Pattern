package com.hades.example.designpatterns.observer._2_use_observer_patttern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> mObservers;

    private int temperature;
    private int humidity;
    private int pressure;

    public WeatherData() {
        mObservers = new ArrayList<>();
    }

    public int mockTemperature() {
        return (int) (Math.random() * 30);
    }

    public int mockHumidity() {
        return (int) (Math.random() * 30);
    }

    public int mockPressure() {
        return (int) (Math.random() * 30);
    }

    /**
     * 温度
     */
    int getTemperature() {
        return temperature;
    }

    /**
     * 湿度
     */
    int getHumidity() {
        return humidity;
    }

    /**
     * 压力
     */
    int getPressure() {
        return pressure;
    }

    public void setMeasurements(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = mObservers.indexOf(observer);
        if (index >= 0) {
            mObservers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer item : mObservers) {
            item.update(temperature, humidity, pressure);
        }
    }
}
