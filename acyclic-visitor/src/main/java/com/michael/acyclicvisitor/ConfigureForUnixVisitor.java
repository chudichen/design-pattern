package com.michael.acyclicvisitor;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Michael Chu
 * @date 2019-06-11 10:47
 */
@Slf4j
public class ConfigureForUnixVisitor implements ZoomVisitor {

    @Override
    public void visit(Zoom zoom) {
        log.info(zoom + " used with Unix configurator.");
    }
}
