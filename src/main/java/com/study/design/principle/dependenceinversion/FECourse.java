package com.study.design.principle.dependenceinversion;

/**
 * @author Michael.Chu
 * @date 2019-04-07 09:59
 */
public class FECourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Study FE course");
    }
}
