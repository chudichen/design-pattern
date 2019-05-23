package com.michael.abstractfactory;

/**
 * @author Michael Chu
 * @date 2019-05-23 10:37
 */
public class ElfCastle implements Castle {

    private static final String DESCRIPTION = "This is the Elven castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
