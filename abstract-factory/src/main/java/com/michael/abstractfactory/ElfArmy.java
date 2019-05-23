package com.michael.abstractfactory;

/**
 * @author Michael Chu
 * @date 2019-05-23 10:37
 */
public class ElfArmy implements Army {

    private static final String DESCRIPTION = "This is the Elven Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
