package com.michael.callback;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Michael Chu
 * @since 2019-08-07 14:51
 */
@Slf4j
public class App {

    public static void main(String[] args) {
        Task task = new SimpleTask();
        Callback callback = () -> log.info("I'm done now.");
        task.executeWith(callback);
    }
}
