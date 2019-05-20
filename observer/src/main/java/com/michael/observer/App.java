package com.michael.observer;

import com.michael.observer.generic.GHobbits;
import com.michael.observer.generic.GOrcs;
import com.michael.observer.generic.GWeather;
import lombok.extern.slf4j.Slf4j;

/**
 * 观察者模式是一种软件设计模式，其中有一个成为主题的对象，
 * 维护着一个依赖列表，称为观察者，任何主题状态发生变化都
 * 会进行通知，通常是使用一个它们自己的方法。这个模式经常
 * 用于分布式处理系统当中。观察者模式也是MVC架构中的核心
 * 部分，观察者模式也被广泛应用于大量的库和系统，包括几乎
 * 所有的GUI工具。
 * <p>
 * 这这个例子中，{@link Weather}有一个状态可以被观察，
 * {@link Orcs}和{@link Hobbits}注册称为观察者，一
 * 旦观察对象发生变化，就会收到通知。
 * <p>
 *
 * @author Michael Chu
 * @date 2019-05-20 14:02
 */
@Slf4j
public class App {

    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();

        log.info("Running generic version");

        GWeather gWeather = new GWeather();
        gWeather.addObserver(new GOrcs());
        gWeather.addObserver(new GHobbits());

        gWeather.timePasses();
        gWeather.timePasses();
        gWeather.timePasses();
        gWeather.timePasses();
    }
}
