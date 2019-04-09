package com.study.design.principle.demeter;

/**
 * @author Michael.Chu
 * @date 2019-04-07 11:49
 */
public class BossPositive {

    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourses();
    }
}
