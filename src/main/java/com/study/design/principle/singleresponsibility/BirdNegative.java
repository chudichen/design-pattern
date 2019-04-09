package com.study.design.principle.singleresponsibility;

import java.util.Objects;

/**
 * 没有使用单一职责原则，每次增加新的需求都需要更改院线都代码。
 *
 * @author Michael.Chu
 * @date 2019-04-07 10:27
 */
public class BirdNegative {

    public void mainMoveMode(String birdName) {
        String Ostrich = "Ostrich";
        if (Objects.equals(Ostrich, birdName)) {
            System.out.println(birdName + " run away");
        } else {
            System.out.println(birdName + " fly away");
        }
    }
}
