package com.michael.abstractfactory;

import org.junit.jupiter.api.Test;

/**
 * 感觉像是工厂方法的升级版，将产品分类为产品族，
 * 一个工厂可以生产自己产品族内的所有产品。
 *
 * @author Michael.Chu
 * @date 2019-04-09 22:45
 */
public class AppTest {

    @Test
    public void abstractFactoryTest() {
        CourseFactory javaFactory = new JavaCourseFactory();
        javaFactory.getArticle().produce();
        javaFactory.getVideo().produce();

        CourseFactory pythonFactory = new PythonCourseFactory();
        pythonFactory.getArticle().produce();
        pythonFactory.getVideo().produce();
    }
}
