package com.hades.example.designpatterns.observer._2_use_observer_patttern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 气象统计
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private List<Integer> temperatures = new ArrayList<>();
    private Subject mSubject;

    public StatisticsDisplay(Subject subject) {
        mSubject = subject;
        mSubject.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        temperatures.add(temperature);

        display();
    }

    @Override
    public void display() {
        System.out.println("气象统计：");
        System.out.println("最低温度：" + Collections.min(temperatures));
        System.out.println("最高温度：" + Collections.max(temperatures));
        System.out.println("平均温度：" + (int) temperatures.stream().mapToInt(Integer::intValue).average().getAsDouble());
        System.out.println();
    }
}
