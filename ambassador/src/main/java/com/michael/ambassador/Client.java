package com.michael.ambassador;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Michael Chu
 * @date 2019-06-11 16:50
 */
@Slf4j
public class Client {

    private final ServiceAmbassador serviceAmbassador = new ServiceAmbassador();

    long useService(int value) {
        long result = -1L;
        try {
            result = serviceAmbassador.doRemoteFunction(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("Service result: " + result);
        return result;
    }
}
