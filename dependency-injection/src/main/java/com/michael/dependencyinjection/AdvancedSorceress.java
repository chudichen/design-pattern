package com.michael.dependencyinjection;

/**
 * 高级巫婆实现了控制反转，可以通过set来注入
 *
 * @author Michael Chu
 * @date 2019-05-17 17:16
 */
public class AdvancedSorceress implements Wizard {

    private Tobacco tobacco;

    public void setTobacco(Tobacco tobacco) {
        this.tobacco = tobacco;
    }

    @Override
    public void smoke() {
        tobacco.smoke(this);
    }
}
