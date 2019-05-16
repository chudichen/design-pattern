package com.michael.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * 力量药水
 *
 * @author Michael Chu
 * @date 2019-05-16 11:34
 */
@Slf4j
public class StrengthPotion implements Potion{

    @Override
    public void drink() {
        log.info("You feel strong. (Potion={})", System.identityHashCode(this));
    }
}
