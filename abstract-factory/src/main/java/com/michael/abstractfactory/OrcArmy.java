package com.michael.abstractfactory;

/**
 * @author Michael Chu
 * @date 2019-05-23 10:38
 */
public class OrcArmy implements Army {

    private static final String DESCRIPTION = "This is the Orc Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
