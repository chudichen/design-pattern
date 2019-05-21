package com.michael.abstractdocument.domain;

import com.michael.abstractdocument.AbstractDocument;

import java.util.Map;

/**
 * 汽车
 *
 * @author Michael Chu
 * @date 2019-05-21 16:57
 */
public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts {

    public Car(Map<String, Object> properties) {
        super(properties);
    }
}
