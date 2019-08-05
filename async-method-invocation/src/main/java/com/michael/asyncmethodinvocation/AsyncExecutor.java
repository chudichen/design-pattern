package com.michael.asyncmethodinvocation;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * @author Michael Chu
 * @since 2019-08-02 14:32
 */
public interface AsyncExecutor {

    /**
     * 启动异步任务时，立即返回一个异步对象
     *
     * @param task 执行的异步任务
     * @return 异步结果
     */
    <T> AsyncResult<T> startProcess(Callable<T> task);

    /**
     * 启动一个异步任务，立即返回一个异步结果。当任务执行完成后执行回调
     *
     * @param task 需要异步执行的任务
     * @param callback 任务执行完成后执行回调
     * @return 任务的异步结果
     */
    <T> AsyncResult<T> startProcess(Callable<T> task, AsyncCallback<T> callback);

    /**
     * 结束异步任务执行。如果必要阻塞当前线程直到执行完成。
     *
     * @param asyncResult 异步结果
     * @return 异步执行结果
     * @throws ExecutionException 如果执行失败了，返回错误原因
     * @throws InterruptedException 执行被中断
     */
    <T> T endProcess(AsyncResult<T> asyncResult) throws ExecutionException, InterruptedException;

}
