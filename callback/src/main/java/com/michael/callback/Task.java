package com.michael.callback;

/**
 * @author Michael Chu
 * @since 2019-08-07 14:52
 */
public abstract class Task {

    public final void executeWith(Callback callback) {
        execute();
        if (callback != null) {
            callback.call();
        }
    }

    public abstract void execute();
}
