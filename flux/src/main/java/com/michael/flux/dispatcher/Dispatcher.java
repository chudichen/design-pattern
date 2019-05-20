package com.michael.flux.dispatcher;

import com.michael.flux.action.*;
import com.michael.flux.store.Store;

import java.util.LinkedList;
import java.util.List;

/**
 * 分发动作到已经注册的store
 *
 * @author Michael Chu
 * @date 2019-05-20 15:36
 */
public final class Dispatcher {

    private static Dispatcher instance = new Dispatcher();

    private List<Store> stores = new LinkedList<>();

    private Dispatcher() {}

    public static Dispatcher getInstance() {
        return instance;
    }

    public void registerStore(Store store) {
        stores.add(store);
    }

    public void menuItemSelected(MenuItem menuItem) {
        dispatchAction(new MenuAction(menuItem));
        switch (menuItem) {
            case HOME:
            case PRODUCTS:
            default:
                dispatchAction(new ContentAction(Content.PRODUCTS));
                break;
            case COMPANY:
                dispatchAction(new ContentAction(Content.COMPANY));
                break;
        }
    }

    private void dispatchAction(Action action) {
        stores.forEach(store -> store.onAction(action));
    }
}
