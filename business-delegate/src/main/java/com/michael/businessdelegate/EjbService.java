package com.michael.businessdelegate;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Michael Chu
 * @since 2019-08-05 16:42
 */
@Slf4j
public class EjbService implements BusinessService {

    @Override
    public void doProcessing() {
        log.info("EjbService is now processing");
    }
}
