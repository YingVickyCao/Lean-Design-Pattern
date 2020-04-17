package com.hades.example.dp.observer_patttern._1;

/**
 * 天气预报
 */
public class ForecastDisplay {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public void update(int temperature, int humidity, int pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

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
