package com.michael.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * 通过组合实现类，桥接模式也可以认为是多层级的抽象。
 * 通过桥接模式，可以解耦实现类的，使子实现之间相互独立。
 *
 * @author Michael Chu
 * @date 2019-05-17 11:31
 */
@Slf4j
public class App {

    public static void main(String[] args) {
        log.info("The knight receives an enchanted sword.");
        Sword enchantedSword = new Sword(new SoulEatingEnchantment());
        enchantedSword.wield();
        enchantedSword.swing();
        enchantedSword.unwield();

        log.info("The valkyrie receives an enchanted hammer.");
        Hammer hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unwield();
    }
}
