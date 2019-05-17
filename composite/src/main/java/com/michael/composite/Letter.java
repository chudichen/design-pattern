package com.michael.composite;

/**
 * 信件
 *
 * @author Michael Chu
 * @date 2019-05-17 10:33
 */
public class Letter extends AbstractLetterComposite {

    private char c;

    public Letter(char c) {
        this.c = c;
    }

    @Override
    protected void printThisBefore() {
        System.out.print(c);
    }
}
