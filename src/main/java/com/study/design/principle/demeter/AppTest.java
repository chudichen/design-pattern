package com.study.design.principle.demeter;

import org.junit.jupiter.api.Test;

/**
 * @author Michael.Chu
 * @date 2019-04-07 11:42
 */
public class AppTest {

    @Test
    public void negativeTest() {
        BossNegative bossNegative = new BossNegative();
        TeamLeader teamLeader = new TeamLeader();
        bossNegative.commandCheckNumber(teamLeader);
    }

    @Test
    public void positiveTest() {
        BossPositive bossNegative = new BossPositive();
        TeamLeader teamLeader = new TeamLeader();
        bossNegative.commandCheckNumber(teamLeader);
    }
}
