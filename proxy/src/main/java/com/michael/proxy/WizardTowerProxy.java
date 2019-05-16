package com.michael.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 代理对象，增加{@link IvoryTower}的访问控制
 *
 * @author Michael Chu
 * @date 2019-05-16 16:09
 */
@Slf4j
public class WizardTowerProxy implements WizardTower {

    private static final int NUM_WIZARDS_ALLOWED = 3;

    private int numWizards;

    private final WizardTower tower;

    public WizardTowerProxy(WizardTower tower) {
        this.tower = tower;
    }

    @Override
    public void enter(Wizard wizard) {
        if (numWizards < NUM_WIZARDS_ALLOWED) {
            tower.enter(wizard);
            numWizards++;
        } else {
            log.info("{} is not allowed to enter!", wizard);
        }
    }
}
