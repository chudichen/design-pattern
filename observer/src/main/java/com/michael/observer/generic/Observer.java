package com.michael.observer.generic;

/**
 * 观察者
 *
 * @author Michael Chu
 * @date 2019-05-20 14:36
 */
public interface Observer<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {

    /**
     * 更新
     *
     * @param subject 主题
     * @param argument 参数
     */
    void update(S subject, A argument);
}
