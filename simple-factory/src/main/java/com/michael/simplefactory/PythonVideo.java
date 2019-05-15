package com.michael.simplefactory;

/**
 * @author Michael.Chu
 * @date 2019-04-07 14:16
 */
public class PythonVideo extends Video {

    @Override
    public void produce() {
        System.out.println("Recoding Python video");
    }
}
