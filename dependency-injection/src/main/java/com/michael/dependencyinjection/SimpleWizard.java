package com.michael.dependencyinjection;

/**
 * 错误案例：SimpleWizard违反了控制反转原则，不能依赖于具体实现，
 * 要依赖于抽象。
 *
 * @author Michael Chu
 * @date 2019-05-17 17:22
 */
public class SimpleWizard implements Wizard {

    private OldTobyTobacco tobacco = new OldTobyTobacco();

    @Override
    public void smoke() {
        tobacco.smoke(this);
    }
}
