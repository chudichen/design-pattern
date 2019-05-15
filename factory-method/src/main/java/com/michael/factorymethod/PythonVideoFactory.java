package com.michael.factorymethod;

/**
 * @author Michael.Chu
 * @date 2019-04-07 18:57
 */
public class PythonVideoFactory implements VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
