package com.michael.caching;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Michael Chu
 * @since 2019-08-06 14:51
 */
@Getter
@AllArgsConstructor
public enum CachingPolicy {

    /** 缓存 */
    THROUGH("through"), AROUND("around"), BEHIND("behind"), ASIDE("aside");

    private String policy;
}
