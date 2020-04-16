package com.hades.example.dp.observer_patttern._2_use_observer_patttern;

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

    /**
     * 温度
     *
     * @return
     */
    int getTemperature() {
        return (int) (Math.random() * 30);
    }

    /**
     * 湿度
     */
    int getHumidity() {
        return (int) (Math.random() * 30);
    }

    /**
     * 压力
     */
    int getPressure() {
        return (int) (Math.random() * 30);
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
