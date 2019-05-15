package com.michael.builder;

/**
 * 发质枚举
 *
 * @author Michael Chu
 * @date 2019-05-10 14:56
 */
public enum HairType {

    /** 秃头 */
    BALD("bald"),
    /** 短 */
    SHORT("short"),
    /** 卷 */
    CURLY("curly"),
    /** 长直 */
    LONG_STRAIGHT("long straight"),
    /** 长卷 */
    LONG_CURLY("long curly");

    private String title;

    HairType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
