package com.study.design.pattern.creational.abstractfactory;

/**
 * @author Michael.Chu
 * @date 2019-04-09 22:38
 */
public class PythonVideo extends Video {

    @Override
    public void produce() {
        System.out.println("Recording Python video");
    }
}
