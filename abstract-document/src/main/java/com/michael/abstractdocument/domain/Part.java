package com.michael.abstractdocument.domain;

import com.michael.abstractdocument.AbstractDocument;

import java.util.Map;

/**
 * 部分
 *
 * @author Michael Chu
 * @date 2019-05-21 16:47
 */
public class Part extends AbstractDocument implements HasType, HasModel, HasPrice {

    public Part(Map<String, Object> properties) {
        super(properties);
    }
}
