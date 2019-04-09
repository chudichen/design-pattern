package com.study.design.pattern.creational.abstractfactory;

/**
 * @author Michael.Chu
 * @date 2019-04-09 22:36
 */
public class JavaArticle extends Article {

    @Override
    public void produce() {
        System.out.println("Writing Java article");
    }
}
