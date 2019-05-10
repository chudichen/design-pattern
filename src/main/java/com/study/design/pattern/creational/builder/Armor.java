package com.study.design.pattern.creational.builder;

/**
 * 盔甲枚举
 *
 * @author Michael Chu
 * @date 2019-05-10 14:56
 */
public enum Armor {

    /** 布衣 */
    CLOTHES("clothes"),
    /** 皮革 */
    LEATHER("leather"),
    /** 锁甲 */
    CHAIN_MAIL("chain mail"),
    /** 重甲 */
    PLATE_MAIL("plate mail");

    /** 类型 */
    private String title;

    Armor(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
