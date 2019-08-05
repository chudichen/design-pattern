package com.michael.businessdelegate;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Michael Chu
 * @since 2019-08-05 16:40
 */
@Slf4j
public class JmsService implements BusinessService {

    @Override
    public void doProcessing() {
        log.info("JmsService is now processing");
    }
}
