package com.michael.dependencyinjection;

import com.google.inject.AbstractModule;

/**
 * Guice模块绑定{@link Tobacco}实例
 *
 * @author Michael Chu
 * @date 2019-05-17 17:50
 */
public class TobaccoModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Tobacco.class).to(RivendellTobacco.class);
    }
}
