package com.michael.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 被代理对象
 *
 * @author Michael Chu
 * @date 2019-05-16 16:08
 */
@Slf4j
public class IvoryTower implements WizardTower {

    @Override
    public void enter(Wizard wizard) {
        log.info("{} enters the tower.", wizard);
    }
}
