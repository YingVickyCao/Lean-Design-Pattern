package com.hades.example.dp.observer_patttern._3_observer_patttern_java;

import java.util.Observable;
import java.util.Observer;

/**
 * 天气预报
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    private Observable mObservable;

    public ForecastDisplay(Observable subject) {
        mObservable = subject;
        mObservable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;

            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
        }
    }

    @Override
    public void display() {
        System.out.println("天气预报：");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
