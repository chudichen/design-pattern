package com.michael.businessdelegate;

/**
 * @author Michael Chu
 * @since 2019-08-05 16:43
 */
public class Client {

    private BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void doTask() {
        businessDelegate.doTask();
    }
}
