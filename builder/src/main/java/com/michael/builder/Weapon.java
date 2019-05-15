package com.michael.builder;

/**
 * 武器枚举
 *
 * @author Michael Chu
 * @date 2019-05-10 14:56
 */
public enum Weapon {

    /** 匕首 */
    DAGGER,
    /** 剑 */
    SWORD,
    /** 斧 */
    AXE,
    /** 战锤 */
    WARHAMMER,
    /** 弓 */
    BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
