package com.michael.abstractfactory;

/**
 * @author Michael Chu
 * @date 2019-05-23 10:38
 */
public class OrcKing implements King {

    private static final String DESCRIPTION = "This is the Orc king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
