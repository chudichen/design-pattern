package com.study.design.pattern.creational.simplefactory;

import org.junit.jupiter.api.Test;

/**
 * 工厂类{@link VideoFactory}拥有一个工厂方法{@link VideoFactory#getVideo(Class)}
 * 接受了一个参数，通过不同参数实例化不同的产品类。很明显，简单工厂的特点就是“简单粗暴”,
 * 通过传入参数即可实例化产品实例，所以简单工厂有一个别名：上帝类。
 *
 * @author Michael.Chu
 * @date 2019-04-07 14:17
 */
public class AppTest {

    /**
     * 普通的创建
     */
    @Test
    public void ordinaryCreateTest() {
        Video video = new JavaVideo();
        video.produce();
    }

    @Test
    public void videoFactoryTest() {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if (video == null) {
            return;
        }
        video.produce();
    }

    @Test
    public void videoFactoryReflectTest() {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(PythonVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
