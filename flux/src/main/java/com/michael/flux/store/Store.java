package com.michael.flux.store;

import com.michael.flux.action.Action;
import com.michael.flux.view.View;

import java.util.LinkedList;
import java.util.List;

/**
 * Store的数据模型
 *
 * @author Michael Chu
 * @date 2019-05-20 15:38
 */
public abstract class Store {

    private List<View> views = new LinkedList<>();

    /**
     * 使用
     *
     * @param action 动作
     */
    public abstract void onAction(Action action);

    /**
     * 注册视图
     *
     * @param view 视图
     */
    public void registerView(View view) {
        views.add(view);
    }

    /**
     * 通知变更
     */
    protected void notifyChange() {
        views.forEach(view -> view.storeChanged(this));
    }
}
