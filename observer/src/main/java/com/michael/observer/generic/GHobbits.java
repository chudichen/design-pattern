package com.michael.observer.generic;

import com.michael.observer.WeatherType;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Michael Chu
 * @date 2019-05-20 14:36
 */
@Slf4j
public class GHobbits implements Race {

    @Override
    public void update(GWeather weather, WeatherType weatherType) {
        switch (weatherType) {
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
                log.info("The hobbits hold their hats tightly in the windy weather.");
                break;
            default:
                break;
        }
    }
}