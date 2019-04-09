package com.study.design.pattern.creational.simplefactory;

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
