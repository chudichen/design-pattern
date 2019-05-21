package com.michael.abstractdocument.domain;

import com.michael.abstractdocument.Document;

import java.util.Optional;

/**
 * 有Type属性的实体
 *
 * @author Michael Chu
 * @date 2019-05-21 16:51
 */
public interface HasType extends Document {

    String PROPERTY = "type";

    default Optional<String> getType() {
        return Optional.ofNullable((String) get(PROPERTY));
    }
}
