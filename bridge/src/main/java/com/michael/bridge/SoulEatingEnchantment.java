package com.michael.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Michael Chu
 * @date 2019-05-17 11:31
 */
@Slf4j
public class SoulEatingEnchantment implements Enchantment {

    @Override
    public void onActivate() {
        log.info("The item spreads bloodlust.");
    }

    @Override
    public void apply() {
        log.info("The item eats the soul of enemies.");
    }

    @Override
    public void onDeactivate() {
        log.info("Bloodlust slowly disappears.");
    }
}
