package com.hades.example.dp.observer_patttern._3_observer_patttern_java;

import java.util.Observable;

public class WeatherData extends Observable {
    private int temperature;
    private int humidity;
    private int pressure;

    public WeatherData() {
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
        setChanged();
        notifyObservers();
    }
}
