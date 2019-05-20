package com.michael.flux.store;

import com.michael.flux.action.Action;
import com.michael.flux.action.ActionType;
import com.michael.flux.action.MenuAction;
import com.michael.flux.action.MenuItem;

import java.util.Objects;

/**
 * @author Michael Chu
 * @date 2019-05-20 15:59
 */
public class MenuStore extends Store {

    private MenuItem selected = MenuItem.HOME;

    @Override
    public void onAction(Action action) {
        if (Objects.equals(action.getType(), ActionType.MENU_ITEM_SELECTED)) {
            MenuAction menuAction = (MenuAction) action;
            selected = menuAction.getMenuItem();
            notifyChange();
        }
    }

    public MenuItem getSelected() {
        return selected;
    }
}
