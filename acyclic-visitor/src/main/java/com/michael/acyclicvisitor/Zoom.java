package com.michael.acyclicvisitor;

import lombok.extern.slf4j.Slf4j;

/**
 * 放大器
 *
 * @author Michael Chu
 * @date 2019-06-11 10:49
 */
@Slf4j
public class Zoom extends Modem {

    /**
     * 接受所有的访问，但只对ZoomVisitor开放访问
     *
     * @param modemVisitor 访问者
     */
    @Override
    public void accept(ModemVisitor modemVisitor) {
        if (modemVisitor instanceof ZoomVisitor) {
            ((ZoomVisitor) modemVisitor).visit(this);
        } else {
            log.info("Only ZoomVisitor is allowed to visit Zoom modem");
        }
    }

    @Override
    public String toString() {
        return "Zoom modem";
    }
}
