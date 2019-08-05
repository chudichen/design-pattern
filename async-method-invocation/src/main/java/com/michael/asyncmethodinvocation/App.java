package com.michael.asyncmethodinvocation;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;

/**
 * @author Michael Chu
 * @since 2019-08-02 14:28
 */
@Slf4j
public class App {

    public static void main(String[] args) throws Exception {
        AsyncExecutor executor = new ThreadAsyncExecutor();

        // start few async tasks with varying processing times, two last with callback handlers
        AsyncResult<Integer> asyncResult1 = executor.startProcess(lazyVal(10, 500));
        AsyncResult<String> asyncResult2 = executor.startProcess(lazyVal("test", 300));
        AsyncResult<Long> asyncResult3 = executor.startProcess(lazyVal(50L, 700));
        AsyncResult<Integer> asyncResult4 = executor.startProcess(lazyVal(20, 400), callback("Callback result 4"));
        AsyncResult<String> asyncResult5 = executor.startProcess(lazyVal("callback", 600), callback("Callback result 5"));

        // emulate processing in the current thread while async tasks are running in their own threads
        // Oh boy I'm working hard here
        Thread.sleep(350);
        log.info("Some hard work done");

        // wait for completion of the tasks
        Integer result1 = executor.endProcess(asyncResult1);
        String result2 = executor.endProcess(asyncResult2);
        Long result3 = executor.endProcess(asyncResult3);
        asyncResult4.await();
        asyncResult5.await();

        // log the results of the tasks, callbacks log immediately when complete
        log.info("Result 1: " + result1);
        log.info("Result 2: " + result2);
        log.info("Result 3: " + result3);
    }

    private static <T> Callable<T> lazyVal(T value, long delayMillis) {
        return () -> {
            Thread.sleep(delayMillis);
            log.info("Task completed with: " + value);
            return value;
        };
    }

    private static <T> AsyncCallback<T> callback(String name) {
        return (value, ex) -> {
            if (ex.isPresent()) {
                log.info(name + " failed: " + ex.map(Exception::getMessage).orElse(""));
            } else {
                log.info(name + ": " + value);
            }
        };
    }
}
