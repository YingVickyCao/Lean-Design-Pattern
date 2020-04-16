package com.hades.example.dp.observer_patttern._2_use_observer_patttern;

/**
 * 目前状况
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private int temperature;
    private int humidity;
    private int pressure;

    private Subject mSubject;

    public CurrentConditionDisplay(Subject subject) {
        mSubject = subject;
        mSubject.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
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
