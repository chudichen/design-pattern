package com.michael.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Michael.Chu
 * @date 2019-04-07 11:37
 */
public class TeamLeader {

    public void checkNumberOfCourses(List<Course> courseList) {
        System.out.println("The number of online courses is : " + courseList.size());
    }

    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("The number of online courses is : " + courseList.size());
    }
}
