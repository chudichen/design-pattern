package com.michael.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * 天气类型枚举
 *
 * @author Michael Chu
 * @date 2019-05-20 14:02
 */
@Slf4j
public enum WeatherType {

    /** 天气类型 */
    SUNNY, RAINY, WINDY, COLD;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
