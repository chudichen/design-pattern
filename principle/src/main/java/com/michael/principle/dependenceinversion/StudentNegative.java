package com.michael.principle.dependenceinversion;

/**
 * 不应该直接依赖具体都实现
 *
 * @author Michael.Chu
 * @date 2019-04-07 09:34
 */
public class StudentNegative {

    public void studyJavaCourse() {
        System.out.println("Study Java course");
    }

    public void studyFECourse() {
        System.out.println("Study FE course");
    }

    public void studyPythonCourse() {
        System.out.println("Study Python course");
    }
}
