package com.michael.abstractdocument.domain;

import com.michael.abstractdocument.Document;

import java.util.Optional;

/**
 * 有价格属性的实体
 *
 * @author Michael Chu
 * @date 2019-05-21 16:49
 */
public interface HasPrice extends Document {

    String PROPERTY = "price";

    default Optional<Number> getPrice() {
        return Optional.ofNullable((Number) get(PROPERTY));
    }
}
