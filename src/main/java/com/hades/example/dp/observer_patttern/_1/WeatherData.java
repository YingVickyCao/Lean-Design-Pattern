package com.hades.example.dp.observer_patttern._1;

public class WeatherData {
    private CurrentConditionDisplay mCurrentConditionDisplay;
    private ForecastDisplay mForecastDisplay;
    private StatisticsDisplay mStatisticsDisplay;

    public WeatherData() {
        mCurrentConditionDisplay = new CurrentConditionDisplay();
        mForecastDisplay = new ForecastDisplay();
        mStatisticsDisplay = new StatisticsDisplay();
    }

    /**
     * 温度
     *
     * @return
     */
    int getTemperature() {
        return (int) (Math.random() * 30) ;
    }

    /**
     * 湿度
     */
    int getHumidity() {
        return (int) (Math.random() * 30) ;
    }

    /**
     * 压力
     */
    int getPressure() {
        return (int) (Math.random() * 30) ;
    }

    public void measurementsChanged() {
        int temperature = getTemperature();
        int humidity = getHumidity();
        int pressure = getPressure();

        mCurrentConditionDisplay.update(temperature, humidity, pressure);
        System.out.println();

        mForecastDisplay.update(temperature, humidity, pressure);
        System.out.println();

        mStatisticsDisplay.update(temperature, humidity, pressure);
        System.out.println();
    }
}
