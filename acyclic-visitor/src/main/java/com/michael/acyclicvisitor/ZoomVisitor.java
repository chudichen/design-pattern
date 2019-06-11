package com.michael.acyclicvisitor;

/**
 * 放大器访问者
 *
 * @author Michael Chu
 * @date 2019-06-11 10:49
 */
public interface ZoomVisitor extends ModemVisitor {
    void visit(Zoom zoom);
}
