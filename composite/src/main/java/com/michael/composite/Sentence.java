package com.michael.composite;

import java.util.List;

/**
 * @author Michael Chu
 * @date 2019-05-17 10:33
 */
public class Sentence extends AbstractLetterComposite {

    public Sentence(List<Word> words) {
        for (Word word : words) {
            this.add(word);
        }
    }

    @Override
    protected void printThisAfter() {
        System.out.print(".");
    }
}
