package com.michael.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * 毒药
 *
 * @author Michael Chu
 * @date 2019-05-16 11:33
 */
@Slf4j
public class PoisonPotion implements Potion {

    @Override
    public void drink() {
        log.info("Urgh! This is poisonous. (Potion={})", System.identityHashCode(this));
    }
}
