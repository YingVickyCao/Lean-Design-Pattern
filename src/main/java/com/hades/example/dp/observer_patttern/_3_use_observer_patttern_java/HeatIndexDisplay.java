package com.hades.example.dp.observer_patttern._3_use_observer_patttern_java;

import java.util.Observable;
import java.util.Observer;

/**
 * 酷热指数是结合温度和湿度的指数，用来显示人的温度感受
 */
public class HeatIndexDisplay implements Observer, DisplayElement {
    private float heatIndex = 0.0f;
    private Observable mObservable;

    public HeatIndexDisplay(Observable observable) {
        mObservable = observable;
        mObservable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            heatIndex = computeHeatIndex(weatherData.getTemperature(), weatherData.getHumidity());

            display();
        }
    }

    /**
     * 利用温度和响度湿度来计算酷热指数
     *
     * @param t  温度
     * @param rh 相对湿度
     * @return 酷热指数
     */
    private float computeHeatIndex(float t, float rh) {
        return (float) ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
    }

    @Override
    public void display() {
        System.out.println("酷热指数：" + heatIndex);
        System.out.println();
    }
}
