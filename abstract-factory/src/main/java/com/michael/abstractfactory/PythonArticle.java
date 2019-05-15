package com.michael.abstractfactory;

/**
 * @author Michael.Chu
 * @date 2019-04-09 22:39
 */
public class PythonArticle extends Article {

    @Override
    public void produce() {
        System.out.println("Writing Python article");
    }
}
