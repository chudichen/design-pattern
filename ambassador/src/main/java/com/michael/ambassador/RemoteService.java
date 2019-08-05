package com.michael.ambassador;

import com.michael.ambassador.util.RandomProvider;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Michael Chu
 * @date 2019-06-11 17:02
 */
@Slf4j
public class RemoteService implements RemoteServiceInterface {

    private static final int THRESHOLD = 200;
    private static final RemoteService SERVICE = new RemoteService();
    private final RandomProvider randomProvider;

    static RemoteService getRemoteService() {
        return SERVICE;
    }

    private RemoteService() {
        this(Math::random);
    }

    RemoteService(RandomProvider randomProvider) {
        this.randomProvider = randomProvider;
    }
    @Override
    public long doRemoteFunction(int value) throws Exception {
        long waitTime = (long) Math.floor(randomProvider.random() * 1000);
        Thread.sleep(waitTime);
        return waitTime <= THRESHOLD ? value * 10 : FAILURE;
    }
}
