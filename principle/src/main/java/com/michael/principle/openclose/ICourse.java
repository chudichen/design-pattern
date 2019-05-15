package com.michael.principle.openclose;

/**
 * 课程接口
 *
 * @author Michael.Chu
 * @date 2019-04-06 15:49
 */
public interface ICourse {

    Integer getId();

    String getName();

    Double getPrice();

    Double getDiscountPrice();
}
