package com.study.design.pattern.creational.abstractfactory;

/**
 * @author Michael.Chu
 * @date 2019-04-09 22:35
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
