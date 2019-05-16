package com.michael.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * 治愈药
 *
 * @author Michael Chu
 * @date 2019-05-16 11:32
 */
@Slf4j
public class HealingPotion implements Potion {

    @Override
    public void drink() {
        log.info("You feel healed. (Potion={})", System.identityHashCode(this));
    }
}
