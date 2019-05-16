package com.michael.proxy;

/**
 * 巫师
 *
 * @author Michael Chu
 * @date 2019-05-16 16:04
 */
public class Wizard {

    private final String name;

    public Wizard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
