package com.michael.abstractdocument;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * 类型接口
 *
 * @author Michael Chu
 * @date 2019-05-21 16:17
 */
public interface Document {

    /**
     * 通过Key来存入value
     *
     * @param key   对象key
     * @param value 对象value
     */
    void put(String key, Object value);

    /**
     * 通过key来获取value
     *
     * @param key 对象的key
     * @return 对象的值或者不存在则为{@code null}
     */
    Object get(String key);

    /**
     * 获取子类的Stream
     *
     * @param key         子类key
     * @param constructor 子类构造器
     * @param <T>         子类
     * @return 子类
     */
    <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);
}
