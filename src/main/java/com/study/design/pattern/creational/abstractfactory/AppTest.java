package com.study.design.pattern.creational.abstractfactory;

import org.junit.jupiter.api.Test;

/**
 * 不需要关心（无需导入）具体的现实，只关注产品族
 *
 * @author Michael.Chu
 * @date 2019-04-09 22:45
 */
public class AppTest {

    @Test
    public void abstractFactoryTest() {
        CourseFactory factory = new JavaCourseFactory();
        factory.getArticle();
        factory.getVideo();
    }
}
