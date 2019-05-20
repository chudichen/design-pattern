package com.michael.observer.generic;

import com.michael.observer.WeatherType;
import lombok.extern.slf4j.Slf4j;

/**
 * 兽人
 *
 * @author Michael Chu
 * @date 2019-05-20 14:36
 */
@Slf4j
public class GOrcs implements Race {

    @Override
    public void update(GWeather subject, WeatherType weatherType) {
        switch (weatherType) {
            case COLD:
                log.info("The orcs are freezing cold.");
                break;
            case RAINY:
                log.info("The orcs are dripping wet.");
                break;
            case SUNNY:
                log.info("The sun hurts the orcs' eyes.");
                break;
            case WINDY:
                log.info("The orc smell almost vanishes in the wind.");
                break;
            default:
                break;
        }
    }
}
