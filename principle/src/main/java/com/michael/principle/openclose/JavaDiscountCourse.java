package com.michael.principle.openclose;

/**
 * @author Michael.Chu
 * @date 2019-04-06 16:14
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }
}
