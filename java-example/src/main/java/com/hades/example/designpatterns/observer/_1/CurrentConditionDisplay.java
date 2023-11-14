package com.hades.example.designpatterns.observer._1;

/**
 * 目前状况
 */
public class CurrentConditionDisplay {
    public void update(int temperature, int humidity, int pressure) {
        System.out.println("目前状况：");
        System.out.println("温度：" + temperature + " \u2103");
        System.out.println("湿度：" + humidity);
        System.out.println("压力：" + pressure);
    }
}
