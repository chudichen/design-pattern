package com.michael.abstractfactory;

/**
 * @author Michael Chu
 * @date 2019-05-23 10:37
 */
public class ElfKing implements King {

    private static final String DESCRIPTION = "This is the Elven king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
