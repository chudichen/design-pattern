package com.michael.principle.singleresponsibility;

/**
 * @author Michael.Chu
 * @date 2019-04-07 10:47
 */
public class CourseImpl implements ICourseManager, ICourseContent {

    private String courseName;

    private byte[] courseVideo;

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] courseVideo() {
        return new byte[0];
    }
}
