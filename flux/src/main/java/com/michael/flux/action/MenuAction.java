package com.michael.flux.action;

import java.awt.*;

/**
 * 菜单动作
 *
 * @author Michael Chu
 * @date 2019-05-20 15:29
 */
public class MenuAction extends Action {

    private MenuItem menuItem;

    public MenuAction(MenuItem menuItem) {
        super(ActionType.MENU_ITEM_SELECTED);
        this.menuItem = menuItem;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }
}
