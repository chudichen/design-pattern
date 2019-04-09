package com.study.design.pattern.creational.factorymethod;

/**
 * @author Michael.Chu
 * @date 2019-04-07 14:15
 */
public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("Recoding Java video");
    }
}
