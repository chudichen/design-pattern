package com.michael.flyweight;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 老王药店货架上摆放着药物，通过使用PotionFactory来提供药物
 *
 * @author Michael Chu
 * @date 2019-05-16 11:32
 */
@Slf4j
public class WangShop {

    private final List<Potion> topShelf;
    private final List<Potion> bottomShelf;

    public WangShop() {
        topShelf = new ArrayList<>();
        bottomShelf = new ArrayList<>();
        fillShelves();
    }

    private void fillShelves() {
        PotionFactory factory = new PotionFactory();

        topShelf.add(factory.createPotion(PotionType.INVISIBILITY));
        topShelf.add(factory.createPotion(PotionType.INVISIBILITY));
        topShelf.add(factory.createPotion(PotionType.STRENGTH));
        topShelf.add(factory.createPotion(PotionType.HEALING));
        topShelf.add(factory.createPotion(PotionType.INVISIBILITY));
        topShelf.add(factory.createPotion(PotionType.STRENGTH));
        topShelf.add(factory.createPotion(PotionType.HEALING));
        topShelf.add(factory.createPotion(PotionType.HEALING));

        bottomShelf.add(factory.createPotion(PotionType.POISON));
        bottomShelf.add(factory.createPotion(PotionType.POISON));
        bottomShelf.add(factory.createPotion(PotionType.POISON));
        bottomShelf.add(factory.createPotion(PotionType.HOLY_WATER));
        bottomShelf.add(factory.createPotion(PotionType.HOLY_WATER));
    }

    /**
     * 返回值一个只读的list
     *
     * @return 返回货架顶部
     */
    public final List<Potion> getTopShelf() {
        return Collections.unmodifiableList(this.topShelf);
    }

    /**
     * 返回值一个只读的list
     *
     * @return 返回货架底部
     */
    public final List<Potion> getBottomShelf() {
        return Collections.unmodifiableList(this.bottomShelf);
    }

    /**
     * 遍历药水
     */
    public void enumerate() {
        log.info("Enumerating top shelf potions");
        for (Potion p : topShelf) {
            p.drink();
        }

        log.info("Enumerating bottom shelf potions");
        for (Potion p : bottomShelf) {
            p.drink();
        }
    }
}
