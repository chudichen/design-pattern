package com.michael.acyclicvisitor;

/**
 * 调制解调器
 *
 * @author Michael Chu
 * @date 2019-06-11 10:48
 */
public abstract class Modem {
    public abstract void accept(ModemVisitor modemVisitor);
}
