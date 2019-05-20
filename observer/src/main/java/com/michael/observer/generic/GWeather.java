package com.michael.observer.generic;

import com.michael.observer.WeatherType;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Michael Chu
 * @date 2019-05-20 14:36
 */
@Slf4j
public class GWeather extends Observable<GWeather, Race, WeatherType> {

    private WeatherType currentWeather;

    public GWeather() {
        currentWeather = WeatherType.SUNNY;
    }

    /**
     * 时间过去了，天气发生改变
     */
    public void timePasses() {
        WeatherType[] enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        log.info("The weather changed to {}.", currentWeather);
        notifyObservers(currentWeather);
    }
}
