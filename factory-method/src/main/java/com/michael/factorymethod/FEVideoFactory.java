package com.michael.factorymethod;

/**
 * @author Michael.Chu
 * @date 2019-04-07 19:02
 */
public class FEVideoFactory implements VideoFactory {

    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
