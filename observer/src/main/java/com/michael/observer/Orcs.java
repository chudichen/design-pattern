package com.michael.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * 兽人
 *
 * @author Michael Chu
 * @date 2019-05-20 14:02
 */
@Slf4j
public class Orcs implements WeatherObserver {

    @Override
    public void update(WeatherType currentWeather) {
        switch (currentWeather) {
            case COLD:
                log.info("The orcs are freezing cold.");
                break;
            case RAINY:
                log.info("The orcs are dripping wet.");
                break;
            case SUNNY:
                log.info("The sun hurts the orcs's eye.");
                break;
            case WINDY:
                log.info("The orc smell almost vanishes in the wind.");
                break;
            default:
                break;
        }
    }
}
