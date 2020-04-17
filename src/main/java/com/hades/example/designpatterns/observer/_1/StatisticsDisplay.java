package com.hades.example.designpatterns.observer._1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 气象统计
 */
public class StatisticsDisplay {
    private List<Integer> temperatures = new ArrayList<>();
    public void update(int temperature, int humidity, int pressure){
        temperatures.add(temperature);
        System.out.println("气象统计：");
        System.out.println("最低温度：" + Collections.min(temperatures));
        System.out.println("最高温度：" + Collections.max(temperatures));
        System.out.println("平均温度：" + (int)temperatures.stream().mapToInt(Integer::intValue).average().getAsDouble());
    }
}
