package com.michael.ambassador;

/**
 * @author Michael Chu
 * @date 2019-06-11 16:51
 */
public interface RemoteServiceInterface {

    int FAILURE = -1;

    long doRemoteFunction(int value) throws Exception;
}
