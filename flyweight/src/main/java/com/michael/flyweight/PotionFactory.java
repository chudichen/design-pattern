package com.michael.flyweight;

import java.util.EnumMap;
import java.util.Map;

/**
 * 享元模式的工厂，最小化内存使用，持有一个药剂Map，如果不存在就创建新的。
 *
 * @author Michael Chu
 * @date 2019-05-16 11:34
 */
public class PotionFactory {

    private final Map<PotionType, Potion> potions;

    public PotionFactory() {
        potions = new EnumMap<>(PotionType.class);
    }

    Potion createPotion(PotionType type) {
        Potion potion = potions.get(type);
        if (potion == null) {
            switch (type) {
                case HEALING:
                    potion = new HealingPotion();
                    potions.put(type, potion);
                    break;
                case HOLY_WATER:
                    potion = new HolyWaterPotion();
                    potions.put(type, potion);
                    break;
                case INVISIBILITY:
                    potion = new InvisibilityPotion();
                    potions.put(type, potion);
                    break;
                case POISON:
                    potion = new PoisonPotion();
                    potions.put(type, potion);
                    break;
                case STRENGTH:
                    potion = new StrengthPotion();
                    potions.put(type, potion);
                default:
                    break;
            }
        }
        return potion;
    }

}
