package com.study.design.pattern.creational.simplefactory;

/**
 * 根据传入参数，来返回具体的实例
 *
 * @author Michael.Chu
 * @date 2019-04-07 14:32
 */
public class VideoFactory {

    public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        }
        if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }

    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
