package com.michael.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * 圣水药
 *
 * @author Michael Chu
 * @date 2019-05-16 11:33
 */
@Slf4j
public class HolyWaterPotion implements Potion {

    @Override
    public void drink() {
        log.info("You feel blessed. (Potion={})", System.identityHashCode(this));
    }
}
