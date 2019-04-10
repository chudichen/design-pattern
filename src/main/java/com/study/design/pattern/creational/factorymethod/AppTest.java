package com.study.design.pattern.creational.factorymethod;

import org.junit.jupiter.api.Test;

/**
 * 核心工厂不再负责创建具体的产品了（对比简单工厂），
 * 构建不同的工厂类，来生产不同的产品，解决了单间工厂的
 * 添加产品需要修改工厂类的问题。
 *
 * @author Michael.Chu
 * @date 2019-04-07 14:17
 */
public class AppTest {

    /**
     * 普通的创建
     */
    @Test
    public void factoryMethodTest() {
        VideoFactory javaFactory = new JavaVideoFactory();
        javaFactory.getVideo().produce();

        VideoFactory pythonFactory = new PythonVideoFactory();
        pythonFactory.getVideo().produce();
    }
}
