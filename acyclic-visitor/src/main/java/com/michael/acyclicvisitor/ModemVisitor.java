package com.michael.acyclicvisitor;

/**
 * 调制解调器访问者接口，不包含任何的访问方法，因此
 * 它不依赖于访问等级，每一个派生类都定义自己的visit方法
 *
 * @author Michael Chu
 * @date 2019-06-11 10:49
 */
public interface ModemVisitor {
    // 访客的基类
}
