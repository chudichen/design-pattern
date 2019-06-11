package com.michael.acyclicvisitor;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Michael Chu
 * @date 2019-06-11 10:48
 */
@Slf4j
public class Hayes extends Modem {

    @Override
    public void accept(ModemVisitor modemVisitor) {
        if (modemVisitor instanceof HayesVisitor) {
            ((HayesVisitor) modemVisitor).visit(this);
        } else {
            log.info("Only HayesVisitor is allowed to visit Hayes modem");
        }
    }

    @Override
    public String toString() {
        return "Hayes modem";
    }
}
