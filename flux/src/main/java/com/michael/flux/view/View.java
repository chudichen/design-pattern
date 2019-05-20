package com.michael.flux.view;

import com.michael.flux.store.Store;

/**
 * 定义数据的视图
 *
 * @author Michael Chu
 * @date 2019-05-20 15:48
 */
public interface View {

    /**
     * 保存改变
     *
     * @param store 待保存对象
     */
    void storeChanged(Store store);

    /**
     * 渲染
     */
    void render();
}
