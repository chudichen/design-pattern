package com.michael.flux.view;

import com.michael.flux.action.MenuItem;
import com.michael.flux.dispatcher.Dispatcher;
import com.michael.flux.store.MenuStore;
import com.michael.flux.store.Store;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * 菜单视图
 *
 * @author Michael Chu
 * @date 2019-05-20 16:07
 */
@Slf4j
public class MenuView implements View {

    private MenuItem selected = MenuItem.HOME;

    @Override
    public void storeChanged(Store store) {
        MenuStore menuStore = (MenuStore) store;
        selected = menuStore.getSelected();
        render();
    }

    @Override
    public void render() {
        for (MenuItem item : MenuItem.values()) {
            if (Objects.equals(selected, item)) {
                log.info("* {}", item);
            } else {
                log.info(item.toString());
            }
        }
    }

    public void itemClicked(MenuItem item) {
        Dispatcher.getInstance().menuItemSelected(item);
    }
}
