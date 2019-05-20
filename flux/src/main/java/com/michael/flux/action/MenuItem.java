package com.michael.flux.action;

/**
 * 菜单
 *
 * @author Michael Chu
 * @date 2019-05-20 15:32
 */
public enum MenuItem {

    /** 菜单选项 */
    HOME("Home"), PRODUCTS("Products"), COMPANY("Company");

    private String title;

    MenuItem(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
