package com.michael.flux.app;

import com.michael.flux.action.MenuItem;
import com.michael.flux.dispatcher.Dispatcher;
import com.michael.flux.store.ContentStore;
import com.michael.flux.store.MenuStore;
import com.michael.flux.view.ContentView;
import com.michael.flux.view.MenuView;

/**
 * Flux是一个软件应用架构，facebook使用它来构建客户端web应用。
 *
 * @author Michael Chu
 * @date 2019-05-20 15:36
 */
public class App {

    public static void main(String[] args) {
        MenuStore menuStore = new MenuStore();
        Dispatcher.getInstance().registerStore(menuStore);
        ContentStore contentStore = new ContentStore();
        Dispatcher.getInstance().registerStore(contentStore);
        MenuView menuView = new MenuView();
        menuStore.registerView(menuView);
        ContentView contentView = new ContentView();
        contentStore.registerView(contentView);

        // 初始化渲染
        menuView.render();
        contentView.render();

        // 用户点击，触发点击事件
        menuView.itemClicked(MenuItem.COMPANY);
    }
}
