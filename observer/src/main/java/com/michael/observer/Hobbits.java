package com.michael.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * 霍比特人
 *
 * @author Michael Chu
 * @date 2019-05-20 14:02
 */
@Slf4j
public class Hobbits implements WeatherObserver {
    @Override
    public void update(WeatherType currentWeather) {
        switch (currentWeather) {
            case COLD:
                log.info("The hobbits are shivering in the cold weather.");
                break;
            case RAINY:
                log.info("The hobbits look for cover from the rain.");
                break;
            case SUNNY:
                log.info("The happy hobbits bade in the warm sun.");
                break;
            case WINDY:
                log.info("The hobbits hold their hats tightly in the wind weather.");
                break;
            default:
                break;
        }
    }
}
