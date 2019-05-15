package com.michael.abstractfactory;

/**
 * @author Michael.Chu
 * @date 2019-04-09 22:36
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("Producing Java video");
    }
}
