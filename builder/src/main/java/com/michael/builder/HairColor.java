package com.michael.builder;

/**
 * 发色枚举
 *
 * @author Michael Chu
 * @date 2019-05-10 14:56
 */
public enum HairColor {

    /** 白 */
    WHITE,
    /** 金 */
    BLOND,
    /** 红 */
    RED,
    /** 棕 */
    BROWN,
    /** 黑 */
    BLACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
