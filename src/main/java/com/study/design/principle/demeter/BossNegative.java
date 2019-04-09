package com.study.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michael.Chu
 * @date 2019-04-07 11:36
 */
public class BossNegative {

    /**
     * 反例：迪米特原则，只和朋友（入参，成员变量）交流，
     * 不和陌生人交流（方法中的参数）
     *
     * @param teamLeader 入参
     */
    public void commandCheckNumber(TeamLeader teamLeader) {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourses(courseList);
    }
}
