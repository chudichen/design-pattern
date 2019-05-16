package com.michael.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * 隐形药水
 *
 * @author Michael Chu
 * @date 2019-05-16 11:33
 */
@Slf4j
public class InvisibilityPotion implements Potion {

    @Override
    public void drink() {
        log.info("You become invisible. (Potion={})", System.identityHashCode(this));
    }
}
