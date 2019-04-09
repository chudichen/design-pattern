package com.study.design.pattern.creational.simplefactory;

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
