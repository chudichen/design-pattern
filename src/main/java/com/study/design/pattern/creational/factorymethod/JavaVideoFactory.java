package com.study.design.pattern.creational.factorymethod;

/**
 * @author Michael.Chu
 * @date 2019-04-07 18:57
 */
public class JavaVideoFactory implements VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
