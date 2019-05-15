package com.michael.factorymethod;

/**
 * @author Michael.Chu
 * @date 2019-04-07 19:01
 */
public class FEVideo extends Video {

    @Override
    public void produce() {
        System.out.println("Recording front end video");
    }
}
