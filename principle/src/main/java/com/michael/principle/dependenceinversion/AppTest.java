package com.michael.principle.dependenceinversion;

import org.junit.jupiter.api.Test;

/**
 * 依赖倒置原则：高层不应该依赖于低层的具体模块，两者都
 * 应该依赖于其抽象。
 *
 * @author Michael.Chu
 * @date 2019-04-07 09:36
 */
public class AppTest {

    /**
     * 高层不应该依赖于低层的具体实现。
     */
    @Test
    public void negativeTest() {
        StudentNegative student = new StudentNegative();
        student.studyJavaCourse();
        student.studyFECourse();
        student.studyPythonCourse();
    }

    @Test
    public void positiveTest() {
        ICourse course = new JavaCourse();
        StudentPositive student = new StudentPositive(course);
        student.study();
        course = new PythonCourse();
        student.setCourse(course);
        student.study();
    }
}
