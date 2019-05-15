package com.michael.principle.dependenceinversion;

/**
 * @author Michael.Chu
 * @date 2019-04-07 09:57
 */
public class PythonCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Study Python course");
    }
}
