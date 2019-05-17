package com.michael.dependencyinjection;

import lombok.extern.slf4j.Slf4j;

/**
 * 烟草抽象类
 *
 * @author Michael Chu
 * @date 2019-05-17 17:19
 */
@Slf4j
public abstract class Tobacco {

    public void smoke(Wizard wizard) {
        log.info("{} smoking {}", wizard.getClass().getSimpleName(),
                this.getClass().getSimpleName());
    }
}
