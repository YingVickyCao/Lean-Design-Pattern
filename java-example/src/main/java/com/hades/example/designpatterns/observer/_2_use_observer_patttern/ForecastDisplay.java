package com.hades.example.designpatterns.observer._2_use_observer_patttern;

/**
 * 天气预报
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    private Subject mSubject;

    public ForecastDisplay(Subject subject) {
        mSubject = subject;
        mSubject.registerObserver(this);
    }

    public void update(int temperature, int humidity, int pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
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
