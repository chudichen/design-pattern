package com.michael.asyncmethodinvocation;

import java.util.Optional;

/**
 * @author Michael Chu
 * @since 2019-08-02 14:31
 */
public interface AsyncCallback<T> {

    /**
     * 完成处理器，当任务执行完成或者任务执行失败
     *
     * @param value 执行的结果，当出现异常时为{@code null}
     * @param ex 任务执行抛出的异常，成功时为{@code null}
     */
    void onComplete(T value, Optional<Exception> ex);
}
