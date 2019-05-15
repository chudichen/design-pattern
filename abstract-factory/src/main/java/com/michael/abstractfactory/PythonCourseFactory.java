package com.michael.abstractfactory;

/**
 * @author Michael.Chu
 * @date 2019-04-09 22:41
 */
public class PythonCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
