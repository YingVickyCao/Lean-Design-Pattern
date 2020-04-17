package com.hades.example.dp.observer_patttern._3_use_observer_patttern_java;

import java.util.Observable;
import java.util.Observer;

/**
 * 目前状况
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private int temperature;
    private int humidity;
    private int pressure;

    private Observable mObservable;

    public CurrentConditionDisplay(Observable subject) {
        mObservable = subject;
        mObservable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();

            display();
        }
    }

    @Override
    public void display() {
        System.out.println("目前状况：");
        System.out.println("温度：" + temperature + " \u2103");
        System.out.println("湿度：" + humidity);
        System.out.println("压力：" + pressure);
        System.out.println();
    }
}