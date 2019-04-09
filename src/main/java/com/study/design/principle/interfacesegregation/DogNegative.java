package com.study.design.principle.interfacesegregation;

/**
 * 一个庞大臃肿的接口,会造成一些无用的功能，
 * 开发时要注意接口隔离原则，尽可能细分接口。
 *
 * @author Michael.Chu
 * @date 2019-04-07 11:19
 */
public class DogNegative implements IAnmalAction {

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
