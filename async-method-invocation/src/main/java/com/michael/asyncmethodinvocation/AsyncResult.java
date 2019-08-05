package com.michael.asyncmethodinvocation;

import java.util.concurrent.ExecutionException;

/**
 * 异步结果接口
 *
 * @author Michael Chu
 * @since 2019-08-02 14:56
 */
public interface AsyncResult<T> {

    /**
     * 异步任务的状态。
     *
     * @return {@code true} 如果执行完成或者异常
     */
    boolean isCompleted();

    /**
     * 获取完成异步任务的结果
     *
     * @return 执行的结果或者返回的异常
     * @throws ExecutionException 执行失败
     * @throws IllegalStateException 如果执行没有完成
     */
    T getValue() throws ExecutionException;

    /**
     * 阻塞当前线程直到执行完成
     *
     * @throws InterruptedException 中断
     */
    void await() throws InterruptedException;
}
