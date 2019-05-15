package com.michael.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Michael Chu
 * @date 2019-05-10 14:15
 */
@Slf4j
public class App {

    public static void main(String[] args) {
        Hero mage = new Hero.Builder(Profession.MAGE, "Harry")
                        .withHairColor(HairColor.BLACK).withWeapon(Weapon.DAGGER)
                        .build();
        log.info(mage.toString());

        Hero warrior = new Hero.Builder(Profession.WARRIOR, "Master Yi")
                .withHairType(HairType.SHORT)
                .withHairColor(HairColor.BLOND)
                .withArmor(Armor.LEATHER)
                .withWeapon(Weapon.SWORD)
                .build();
        log.info(warrior.toString());

        Hero thief = new Hero.Builder(Profession.THIEF, "Joker")
                .withHairColor(HairColor.BROWN)
                .withHairType(HairType.CURLY)
                .withArmor(Armor.CLOTHES)
                .withWeapon(Weapon.DAGGER)
                .build();
        log.info(thief.toString());
    }
}
