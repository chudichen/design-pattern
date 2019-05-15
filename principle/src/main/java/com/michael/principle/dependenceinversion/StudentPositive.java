package com.michael.principle.dependenceinversion;

/**
 * 依赖于抽象的接口
 *
 * @author Michael.Chu
 * @date 2019-04-07 10:02
 */
public class StudentPositive {

    private ICourse course;

    public StudentPositive(ICourse course) {
        this.course = course;
    }

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void study() {
        course.studyCourse();
    }
}
