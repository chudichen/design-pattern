package com.study.design.principle.interfacesegregation;

/**
 * 接口隔离原则：接口尽量小，不过要注意适度
 *
 * @author Michael.Chu
 * @date 2019-04-07 11:27
 */
public class DogPositive implements IEatAnimalAction, ISwimAnimalAction {

    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
