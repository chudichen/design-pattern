package com.michael.acyclicvisitor;

/**
 * @author Michael Chu
 * @date 2019-06-11 10:48
 */
public interface HayesVisitor extends ModemVisitor {
    void visit(Hayes hayes);
}
