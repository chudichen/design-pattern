package com.michael.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合接口
 *
 * @author Michael Chu
 * @date 2019-05-17 10:33
 */
public abstract class AbstractLetterComposite {

    private List<AbstractLetterComposite> children = new ArrayList<>();

    public void add(AbstractLetterComposite letter) {
        children.add(letter);
    }

    public int count() {
        return children.size();
    }

    protected void printThisBefore() {}

    protected void printThisAfter() {}

    public void print() {
        printThisBefore();
        for (AbstractLetterComposite letter : children) {
            letter.print();
        }
        printThisAfter();
    }
}
