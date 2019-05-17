package com.michael.bridge;

/**
 * 武器
 *
 * @author Michael Chu
 * @date 2019-05-17 11:31
 */
public interface Weapon {

    void wield();

    void swing();

    void unwield();

    Enchantment getEnchantment();
}
