package com.michael.dependencyinjection;

/**
 * {@link AdvancedWizard}实现了控制反转。它依赖于抽象，可以通过
 * 构造器来注入具体的实现。
 *
 * @author Michael Chu
 * @date 2019-05-17 17:28
 */
public class AdvancedWizard implements Wizard {

    private final Tobacco tobacco;

    public AdvancedWizard(Tobacco tobacco) {
        this.tobacco = tobacco;
    }

    @Override
    public void smoke() {
        tobacco.smoke(this);
    }
}
