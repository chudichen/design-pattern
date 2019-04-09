package com.study.design.principle.singleresponsibility;

import org.junit.jupiter.api.Test;

/**
 * @author Michael.Chu
 * @date 2019-04-07 10:29
 */
public class AppTest {

    @Test
    public void negativeTest() {
        BirdNegative birdNegative = new BirdNegative();
        birdNegative.mainMoveMode("Swift");
        birdNegative.mainMoveMode("Ostrich");
    }

    @Test
    public void positiveTest() {
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("Swift");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("Ostrich");
    }
}
