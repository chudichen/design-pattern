package com.michael.observer;

/**
 * 观察者接口
 *
 * @author Michael Chu
 * @date 2019-05-20 14:02
 */
public interface WeatherObserver {

    /**
     * 更新天气
     *
     * @param currentWeather 更新的天气
     */
    void update(WeatherType currentWeather);
}
