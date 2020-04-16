package com.hades.example.dp.observer_patttern._2_use_observer_patttern;

/**
 * 天气预报
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private Subject mSubject;

    public ForecastDisplay(Subject subject) {
        mSubject = subject;
        mSubject.registerObserver(this);
    }

    public void update(int temperature, int humidity, int pressure) {
        display();
    }

    @Override
    public void display() {
        System.out.println("天气预报：");
        System.out.println();
    }
}
