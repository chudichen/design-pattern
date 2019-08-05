package com.michael.ambassador;

import lombok.extern.slf4j.Slf4j;

/**
 * ServiceAmbassador提供一个接口给({@link Client})来访问{@link}
 *
 * @author Michael Chu
 * @date 2019-06-11 17:01
 */
@Slf4j
public class ServiceAmbassador implements RemoteServiceInterface {

    private static final int RETRIES = 3;
    private static final int DELAY_MS = 3000;

    ServiceAmbassador() {}

    @Override
    public long doRemoteFunction(int value) throws Exception {
        return safeCall(value);
    }

    private long checkLatency(int value) {
        long startTime = System.currentTimeMillis();
        long result = -1;
        try {
            result = RemoteService.getRemoteService().doRemoteFunction(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long timeTaken = System.currentTimeMillis() - startTime;
        log.info("Time taken (ms): " + timeTaken);
        return result;
    }

    private long safeCall(int value) {
        int retries = 0;
        long result = FAILURE;

        for (int i = 0; i < RETRIES; i++) {

            if (retries >= RETRIES) {
                return FAILURE;
            }

            if ((result = checkLatency(value)) == FAILURE) {
                log.info("Failed to reach remote: (" + (i + 1) + ")");
                retries++;
                try {
                    Thread.sleep(DELAY_MS);
                } catch (InterruptedException e) {
                    log.error("Thread sleep state interrupted", e);
                }
            } else {
                break;
            }
        }
        return result;
    }
}
