package com.michael.builder;

/**
 * 职业枚举
 *
 * @author Michael Chu
 * @date 2019-05-10 14:56
 */
public enum Profession {

    /** 战士 */
    WARRIOR,
    /** 盗贼 */
    THIEF,
    /** 法师 */
    MAGE,
    /** 牧师 */
    PRIEST;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
