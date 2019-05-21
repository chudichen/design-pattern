package com.michael.abstractdocument.domain;

import com.michael.abstractdocument.Document;

import java.util.stream.Stream;

/**
 * 有Parts的实体
 *
 * @author Michael Chu
 * @date 2019-05-21 16:46
 */
public interface HasParts extends Document {

    String PROPERTY = "parts";

    default Stream<Part> getParts() {
        return children(PROPERTY, Part::new);
    }
}
