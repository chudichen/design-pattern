package com.michael.springstudy.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Michael Chu
 * @since 2019-08-08 10:43
 */
public class ClassPathApplicationTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        SimpleBean bean = context.getBean(SimpleBean.class);
        bean.send();
        context.close();
    }
}
