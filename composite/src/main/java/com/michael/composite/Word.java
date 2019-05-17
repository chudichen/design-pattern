package com.michael.composite;

import java.util.List;

/**
 * @author Michael Chu
 * @date 2019-05-17 10:33
 */
public class Word extends AbstractLetterComposite {

    public Word(List<Letter> letters) {
        for (Letter letter : letters) {
            this.add(letter);
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }
}
