package com.michael.dependencyinjection;

import javax.inject.Inject;

/**
 * @author Michael Chu
 * @date 2019-05-17 17:54
 */
public class GuiceWizard implements Wizard {

    private Tobacco tobacco;

    @Inject
    public GuiceWizard(Tobacco tobacco) {
        this.tobacco = tobacco;
    }

    @Override
    public void smoke() {
        tobacco.smoke(this);
    }
}
