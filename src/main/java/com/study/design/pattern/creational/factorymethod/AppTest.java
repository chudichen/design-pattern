package com.study.design.pattern.creational.factorymethod;

import org.junit.jupiter.api.Test;

/**
 * @author Michael.Chu
 * @date 2019-04-07 14:17
 */
public class AppTest {

    /**
     * 普通的创建
     */
    @Test
    public void javaFactoryTest() {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
