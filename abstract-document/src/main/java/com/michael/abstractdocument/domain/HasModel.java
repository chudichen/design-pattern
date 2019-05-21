package com.michael.abstractdocument.domain;

import com.michael.abstractdocument.Document;

import java.util.Optional;

/**
 * 具有model的实体接口
 *
 * @author Michael Chu
 * @date 2019-05-21 16:22
 */
public interface HasModel extends Document {

    String PROPERTY = "model";

    default Optional<String> getModel() {
        return Optional.ofNullable((String) get(PROPERTY));
    }
}
