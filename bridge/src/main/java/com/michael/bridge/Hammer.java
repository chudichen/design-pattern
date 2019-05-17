package com.michael.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Michael Chu
 * @date 2019-05-17 11:31
 */
@Slf4j
public class Hammer implements Weapon {
    private final Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        log.info("The hammer is wielded.");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        log.info("The hammer is swinged.");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        log.info("The hammer is unwielded.");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
