package com.michael.callback;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Michael Chu
 * @since 2019-08-07 14:53
 */
@Slf4j
public class SimpleTask extends Task {

    @Override
    public void execute() {
        log.info("Perform some important activity and after call the callback method.");
    }
}
