package com.michael.principle.openclose;

import org.junit.jupiter.api.Test;

/**
 * 开闭原则，一个类或者模块，应该对修改关闭，对扩展开放。
 *
 * @author Michael.Chu
 * @date 2019-04-06 15:52
 */
public class AppTest {

    @Test
    public void positiveTest() {
        ICourse javaCourse = new JavaDiscountCourse(96, "Java Design", 348D);
        System.out.println("Course ID : " + javaCourse.getId());
        System.out.println("Course Name : " + javaCourse.getName());
        System.out.println("Course Price : " + javaCourse.getPrice());
        System.out.println("Course Oringi Price : " + ((JavaDiscountCourse) javaCourse).getOriginPrice());
    }
}
