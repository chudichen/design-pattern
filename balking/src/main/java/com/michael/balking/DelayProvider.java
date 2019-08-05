package com.michael.balking;

import java.util.concurrent.TimeUnit;

/**
 * @author Michael Chu
 * @since 2019-08-05 10:12
 */
public interface DelayProvider {

    void executeAfterDelay(long interval, TimeUnit timeUnit, Runnable task);
}
